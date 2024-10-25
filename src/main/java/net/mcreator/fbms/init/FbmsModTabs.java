
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.fbms.init;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class FbmsModTabs {
	public static CreativeModeTab TAB_FMS;
	public static CreativeModeTab TAB_A_DS;
	public static CreativeModeTab TAB_PROPS;
	public static CreativeModeTab TAB_CARS;
	public static CreativeModeTab TAB_PRIVATE_ROOM;
	public static CreativeModeTab TAB_SHOP_BLOCKS;
	public static CreativeModeTab TAB_PLUSH;
	public static CreativeModeTab TAB_FMS_BLOCKS;

	public static void load() {
		TAB_FMS = new CreativeModeTab("tabfms") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(FbmsModBlocks.CANDY_CADET.get());
			}

			@Override
			public boolean hasSearchBar() {
				return false;
			}
		};
		TAB_A_DS = new CreativeModeTab("taba_ds") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(FbmsModItems.AD.get());
			}

			@Override
			public boolean hasSearchBar() {
				return false;
			}
		};
		TAB_PROPS = new CreativeModeTab("tabprops") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(FbmsModItems.GUITAR.get());
			}

			@Override
			public boolean hasSearchBar() {
				return false;
			}
		};
		TAB_CARS = new CreativeModeTab("tabcars") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(FbmsModBlocks.IMPALA_BLOCK.get());
			}

			@Override
			public boolean hasSearchBar() {
				return false;
			}
		};
		TAB_PRIVATE_ROOM = new CreativeModeTab("tabprivate_room") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(FbmsModBlocks.D_BALLOON_BOY.get());
			}

			@Override
			public boolean hasSearchBar() {
				return false;
			}
		};
		TAB_SHOP_BLOCKS = new CreativeModeTab("tabshop_blocks") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(FbmsModBlocks.SANITATION_STATION.get());
			}

			@Override
			public boolean hasSearchBar() {
				return false;
			}
		};
		TAB_PLUSH = new CreativeModeTab("tabplush") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(FbmsModBlocks.DOC_PLUSH.get());
			}

			@Override
			public boolean hasSearchBar() {
				return false;
			}
		};
		TAB_FMS_BLOCKS = new CreativeModeTab("tabfms_blocks") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(FbmsModBlocks.BLACK_WHITE_TILES.get());
			}

			@Override
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundSuffix("item_search.png");
	}
}
