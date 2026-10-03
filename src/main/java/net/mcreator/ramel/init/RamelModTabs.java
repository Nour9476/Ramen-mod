/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.ramel.init;

import net.minecraft.world.item.CreativeModeTabs;

import net.fabricmc.fabric.api.creativetab.v1.CreativeModeTabEvents;

public class RamelModTabs {
	public static void load() {
		CreativeModeTabEvents.modifyOutputEvent(CreativeModeTabs.FOOD_AND_DRINKS).register(tabData -> {
			tabData.accept(RamelModItems.RAMEN);
		});
	}
}