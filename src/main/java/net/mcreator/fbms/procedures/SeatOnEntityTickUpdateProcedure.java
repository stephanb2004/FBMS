package net.mcreator.fbms.procedures;

import net.minecraft.world.entity.Entity;

public class SeatOnEntityTickUpdateProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (!entity.isVehicle()) {
			if (!entity.level.isClientSide())
				entity.discard();
		}
	}
}
