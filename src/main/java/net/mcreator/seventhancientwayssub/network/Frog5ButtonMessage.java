
package net.mcreator.seventhancientwayssub.network;

import net.minecraftforge.network.NetworkEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.core.BlockPos;

import net.mcreator.seventhancientwayssub.world.inventory.Frog5Menu;
import net.mcreator.seventhancientwayssub.procedures.GoFrog6Procedure;
import net.mcreator.seventhancientwayssub.procedures.GoFrog4Procedure;
import net.mcreator.seventhancientwayssub.procedures.BackToIndexProcedure;
import net.mcreator.seventhancientwayssub.PoisonMadnessMod;

import java.util.function.Supplier;
import java.util.HashMap;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class Frog5ButtonMessage {
	private final int buttonID, x, y, z;

	public Frog5ButtonMessage(FriendlyByteBuf buffer) {
		this.buttonID = buffer.readInt();
		this.x = buffer.readInt();
		this.y = buffer.readInt();
		this.z = buffer.readInt();
	}

	public Frog5ButtonMessage(int buttonID, int x, int y, int z) {
		this.buttonID = buttonID;
		this.x = x;
		this.y = y;
		this.z = z;
	}

	public static void buffer(Frog5ButtonMessage message, FriendlyByteBuf buffer) {
		buffer.writeInt(message.buttonID);
		buffer.writeInt(message.x);
		buffer.writeInt(message.y);
		buffer.writeInt(message.z);
	}

	public static void handler(Frog5ButtonMessage message, Supplier<NetworkEvent.Context> contextSupplier) {
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
		HashMap guistate = Frog5Menu.guistate;
		// security measure to prevent arbitrary chunk generation
		if (!world.hasChunkAt(new BlockPos(x, y, z)))
			return;
		if (buttonID == 0) {

			BackToIndexProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 1) {

			GoFrog6Procedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 2) {

			GoFrog4Procedure.execute(world, x, y, z, entity);
		}
	}

	@SubscribeEvent
	public static void registerMessage(FMLCommonSetupEvent event) {
		PoisonMadnessMod.addNetworkMessage(Frog5ButtonMessage.class, Frog5ButtonMessage::buffer, Frog5ButtonMessage::new, Frog5ButtonMessage::handler);
	}
}
