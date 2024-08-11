
package net.mcreator.fbms.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class AdItem extends Item {
	public AdItem() {
		super(new Item.Properties().tab(null).stacksTo(64).rarity(Rarity.COMMON));
	}
}
