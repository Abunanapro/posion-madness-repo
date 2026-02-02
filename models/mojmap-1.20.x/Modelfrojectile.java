// Made with Blockbench 5.0.7
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelfrojectile<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "frojectile"), "main");
	private final ModelPart frog;
	private final ModelPart poach;
	private final ModelPart front_legs;
	private final ModelPart right;
	private final ModelPart flat;
	private final ModelPart left;
	private final ModelPart flat2;
	private final ModelPart back_legs;
	private final ModelPart right2;
	private final ModelPart flat4;
	private final ModelPart left2;
	private final ModelPart flat3;

	public Modelfrojectile(ModelPart root) {
		this.frog = root.getChild("frog");
		this.poach = this.frog.getChild("poach");
		this.front_legs = this.frog.getChild("front_legs");
		this.right = this.front_legs.getChild("right");
		this.flat = this.right.getChild("flat");
		this.left = this.front_legs.getChild("left");
		this.flat2 = this.left.getChild("flat2");
		this.back_legs = this.frog.getChild("back_legs");
		this.right2 = this.back_legs.getChild("right2");
		this.flat4 = this.right2.getChild("flat4");
		this.left2 = this.back_legs.getChild("left2");
		this.flat3 = this.left2.getChild("flat3");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition frog = partdefinition.addOrReplaceChild("frog", CubeListBuilder.create(),
				PartPose.offset(0.0F, 20.3837F, 2.4155F));

		PartDefinition frog_r1 = frog.addOrReplaceChild("frog_r1",
				CubeListBuilder.create().texOffs(0, 0).addBox(-2.5F, -4.0F, -6.0F, 5.0F, 3.0F, 10.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 2.6163F, -2.4155F, -0.3927F, 0.0F, 0.0F));

		PartDefinition poach = frog.addOrReplaceChild("poach",
				CubeListBuilder.create().texOffs(0, 22).addBox(-1.5F, -0.5F, -1.5F, 3.0F, 1.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -0.0685F, -4.839F, -0.3927F, 0.0F, 0.0F));

		PartDefinition front_legs = frog.addOrReplaceChild("front_legs", CubeListBuilder.create(),
				PartPose.offset(0.0F, -0.3837F, -2.9155F));

		PartDefinition right = front_legs.addOrReplaceChild("right", CubeListBuilder.create().texOffs(10, 17).addBox(
				-1.0F, -0.01F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(-2.0F, 0.0F, 0.0F));

		PartDefinition flat = right.addOrReplaceChild("flat", CubeListBuilder.create().texOffs(-2, 6).addBox(-2.5F,
				0.99F, -3.0F, 4.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(-0.5F, 3.0F, 0.5F));

		PartDefinition left = front_legs.addOrReplaceChild("left", CubeListBuilder.create().texOffs(10, 17).addBox(0.0F,
				-0.01F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(2.0F, 0.0F, 0.0F));

		PartDefinition flat2 = left.addOrReplaceChild("flat2",
				CubeListBuilder.create().texOffs(-2, 6).mirror()
						.addBox(-1.5F, 0.99F, -3.0F, 4.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(0.5F, 3.0F, 0.5F));

		PartDefinition back_legs = frog.addOrReplaceChild("back_legs", CubeListBuilder.create(),
				PartPose.offset(0.0F, 0.6163F, 2.0845F));

		PartDefinition right2 = back_legs.addOrReplaceChild("right2", CubeListBuilder.create().texOffs(0, 0)
				.addBox(-2.0F, -0.01F, -1.5F, 2.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-2.0F, 0.0F, -1.0F));

		PartDefinition flat4 = right2.addOrReplaceChild("flat4", CubeListBuilder.create().texOffs(0, 13).addBox(-3.0F,
				0.99F, -4.0F, 5.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(-2.0F, 2.0F, 1.5F));

		PartDefinition left2 = back_legs.addOrReplaceChild("left2", CubeListBuilder.create().texOffs(0, 0).addBox(0.0F,
				-0.01F, -1.5F, 2.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(2.0F, 0.0F, -1.0F));

		PartDefinition flat3 = left2.addOrReplaceChild("flat3", CubeListBuilder.create().texOffs(10, 13).addBox(-2.0F,
				0.99F, -4.0F, 5.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(2.0F, 2.0F, 1.5F));

		return LayerDefinition.create(meshdefinition, 32, 32);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		frog.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
	}
}