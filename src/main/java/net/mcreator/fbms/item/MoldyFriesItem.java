
package net.mcreator.fbms.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.entity.LivingEntity;

import net.mcreator.fbms.procedures.MoldyFinishesUsingItemProcedure;
import net.mcreator.fbms.init.FbmsModTabs;

public class MoldyFriesItem extends Item {
	public MoldyFriesItem() {
		super(new Item.Properties().tab(FbmsModTabs.TAB_PROPS).stacksTo(64).rarity(Rarity.COMMON).food((new FoodProperties.Builder()).nutrition(4).saturationMod(0.3f)

				.build()));
	}

	@Override
	public ItemStack finishUsingItem(ItemStack itemstack, Level world, LivingEntity entity) {
		ItemStack retval = super.finishUsingItem(itemstack, world, entity);
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();

		MoldyFinishesUsingItemProcedure.execute(entity);
		return retval;
	}
}