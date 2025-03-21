package net.mcreator.fbms.procedures;

import net.minecraft.world.level.block.state.properties.Property;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.mcreator.fbms.init.FbmsModBlocks;

import java.util.Map;

public class PizzaBoxOnBlockRightClickedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, BlockState blockstate) {
		if (blockstate.getBlock() == FbmsModBlocks.PIZZA_BOX_85_OPEN.get()) {
			{
				BlockPos _bp = BlockPos.containing(x, y, z);
				BlockState _bs = FbmsModBlocks.PIZZA_BOX_85_CLOSED.get().defaultBlockState();
				BlockState _bso = world.getBlockState(_bp);
				for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
					Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
					if (_property != null && _bs.getValue(_property) != null)
						try {
							_bs = _bs.setValue(_property, (Comparable) entry.getValue());
						} catch (Exception e) {
						}
				}
				world.setBlock(_bp, _bs, 3);
			}
		} else if (blockstate.getBlock() == FbmsModBlocks.PIZZA_BOX_85_CLOSED.get()) {
			{
				BlockPos _bp = BlockPos.containing(x, y, z);
				BlockState _bs = FbmsModBlocks.PIZZA_BOX_85_OPEN.get().defaultBlockState();
				BlockState _bso = world.getBlockState(_bp);
				for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
					Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
					if (_property != null && _bs.getValue(_property) != null)
						try {
							_bs = _bs.setValue(_property, (Comparable) entry.getValue());
						} catch (Exception e) {
						}
				}
				world.setBlock(_bp, _bs, 3);
			}
		}
		if (blockstate.getBlock() == FbmsModBlocks.PIZZA_BOX_87_OPEN.get()) {
			{
				BlockPos _bp = BlockPos.containing(x, y, z);
				BlockState _bs = FbmsModBlocks.PIZZA_BOX_87_CLOSED.get().defaultBlockState();
				BlockState _bso = world.getBlockState(_bp);
				for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
					Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
					if (_property != null && _bs.getValue(_property) != null)
						try {
							_bs = _bs.setValue(_property, (Comparable) entry.getValue());
						} catch (Exception e) {
						}
				}
				world.setBlock(_bp, _bs, 3);
			}
		} else if (blockstate.getBlock() == FbmsModBlocks.PIZZA_BOX_87_CLOSED.get()) {
			{
				BlockPos _bp = BlockPos.containing(x, y, z);
				BlockState _bs = FbmsModBlocks.PIZZA_BOX_87_OPEN.get().defaultBlockState();
				BlockState _bso = world.getBlockState(_bp);
				for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
					Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
					if (_property != null && _bs.getValue(_property) != null)
						try {
							_bs = _bs.setValue(_property, (Comparable) entry.getValue());
						} catch (Exception e) {
						}
				}
				world.setBlock(_bp, _bs, 3);
			}
		}
		if (blockstate.getBlock() == FbmsModBlocks.PIZZA_BOX_93_OPEN.get()) {
			{
				BlockPos _bp = BlockPos.containing(x, y, z);
				BlockState _bs = FbmsModBlocks.PIZZA_BOX_93_CLOSED.get().defaultBlockState();
				BlockState _bso = world.getBlockState(_bp);
				for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
					Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
					if (_property != null && _bs.getValue(_property) != null)
						try {
							_bs = _bs.setValue(_property, (Comparable) entry.getValue());
						} catch (Exception e) {
						}
				}
				world.setBlock(_bp, _bs, 3);
			}
		} else if (blockstate.getBlock() == FbmsModBlocks.PIZZA_BOX_93_CLOSED.get()) {
			{
				BlockPos _bp = BlockPos.containing(x, y, z);
				BlockState _bs = FbmsModBlocks.PIZZA_BOX_93_OPEN.get().defaultBlockState();
				BlockState _bso = world.getBlockState(_bp);
				for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
					Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
					if (_property != null && _bs.getValue(_property) != null)
						try {
							_bs = _bs.setValue(_property, (Comparable) entry.getValue());
						} catch (Exception e) {
						}
				}
				world.setBlock(_bp, _bs, 3);
			}
		}
		if (blockstate.getBlock() == FbmsModBlocks.PIZZA_BOX_24_OPEN.get()) {
			{
				BlockPos _bp = BlockPos.containing(x, y, z);
				BlockState _bs = FbmsModBlocks.PIZZA_BOX_24_CLOSED.get().defaultBlockState();
				BlockState _bso = world.getBlockState(_bp);
				for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
					Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
					if (_property != null && _bs.getValue(_property) != null)
						try {
							_bs = _bs.setValue(_property, (Comparable) entry.getValue());
						} catch (Exception e) {
						}
				}
				world.setBlock(_bp, _bs, 3);
			}
		} else if (blockstate.getBlock() == FbmsModBlocks.PIZZA_BOX_24_CLOSED.get()) {
			{
				BlockPos _bp = BlockPos.containing(x, y, z);
				BlockState _bs = FbmsModBlocks.PIZZA_BOX_24_OPEN.get().defaultBlockState();
				BlockState _bso = world.getBlockState(_bp);
				for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
					Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
					if (_property != null && _bs.getValue(_property) != null)
						try {
							_bs = _bs.setValue(_property, (Comparable) entry.getValue());
						} catch (Exception e) {
						}
				}
				world.setBlock(_bp, _bs, 3);
			}
		}
	}
}
