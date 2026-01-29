
package net.mcreator.seventhancientwayssub.network;

import net.minecraftforge.network.NetworkEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.core.BlockPos;

import net.mcreator.seventhancientwayssub.world.inventory.IndexMenu;
import net.mcreator.seventhancientwayssub.procedures.GonextIndex2Procedure;
import net.mcreator.seventhancientwayssub.procedures.GoToadsProcedure;
import net.mcreator.seventhancientwayssub.procedures.GoLizardsProcedure;
import net.mcreator.seventhancientwayssub.procedures.GoFrogsProcedure;
import net.mcreator.seventhancientwayssub.procedures.GoComingSoonProcedure;
import net.mcreator.seventhancientwayssub.PoisonMadnessMod;

import java.util.function.Supplier;
import java.util.HashMap;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class IndexButtonMessage {
	private final int buttonID, x, y, z;

	public IndexButtonMessage(FriendlyByteBuf buffer) {
		this.buttonID = buffer.readInt();
		this.x = buffer.readInt();
		this.y = buffer.readInt();
		this.z = buffer.readInt();
	}

	public IndexButtonMessage(int buttonID, int x, int y, int z) {
		this.buttonID = buttonID;
		this.x = x;
		this.y = y;
		this.z = z;
	}

	public static void buffer(IndexButtonMessage message, FriendlyByteBuf buffer) {
		buffer.writeInt(message.buttonID);
		buffer.writeInt(message.x);
		buffer.writeInt(message.y);
		buffer.writeInt(message.z);
	}

	public static void handler(IndexButtonMessage message, Supplier<NetworkEvent.Context> contextSupplier) {
		NetworkEvent.Context context = contextSupplier.get();
		context.enqueueWork(() -> {
			Player entity = context.getSender();
			int buttonID = message.buttonID;
			int x = message.x;
			int y = message.y;
			int z = message.z;
			handleButtonAction(entity, buttonID, x, y, z);
		});
		context.setPacketHandled(true);
	}

	public static void handleButtonAction(Player entity, int buttonID, int x, int y, int z) {
		Level world = entity.level();
		HashMap guistate = IndexMenu.guistate;
		// security measure to prevent arbitrary chunk generation
		if (!world.hasChunkAt(new BlockPos(x, y, z)))
			return;
		if (buttonID == 0) {

			GoFrogsProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 1) {

			GoLizardsProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 2) {

			GoToadsProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 3) {

			GoComingSoonProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 4) {

			GonextIndex2Procedure.execute(world, x, y, z, entity);
		}
	}

	@SubscribeEvent
	public static void registerMessage(FMLCommonSetupEvent event) {
		PoisonMadnessMod.addNetworkMessage(IndexButtonMessage.class, IndexButtonMessage::buffer, IndexButtonMessage::new, IndexButtonMessage::handler);
	}
}
