
package net.mcreator.fbms.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

import net.mcreator.fbms.init.FbmsModTabs;

public class BanjoItem extends Item {
	public BanjoItem() {
		super(new Item.Properties().tab(FbmsModTabs.TAB_PROPS).stacksTo(64).rarity(Rarity.COMMON));
	}
}