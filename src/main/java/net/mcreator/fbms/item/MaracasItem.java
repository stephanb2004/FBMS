
package net.mcreator.fbms.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class MaracasItem extends Item {
	public MaracasItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
