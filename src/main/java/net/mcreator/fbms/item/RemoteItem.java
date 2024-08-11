
package net.mcreator.fbms.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

import net.mcreator.fbms.init.FbmsModTabs;

public class RemoteItem extends Item {
	public RemoteItem() {
		super(new Item.Properties().tab(FbmsModTabs.TAB_PRIVATE_ROOM).stacksTo(64).rarity(Rarity.COMMON));
	}
}
