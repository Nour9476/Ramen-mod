/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.ramel.init;

import net.minecraft.world.item.Items;
import net.minecraft.world.item.Item;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.Identifier;
import net.minecraft.core.registries.Registries;

import net.mcreator.ramel.item.RamenItem;
import net.mcreator.ramel.RamelMod;

import java.util.function.Function;

public class RamelModItems {
	public static Item RAMEN;

	public static void load() {
		RAMEN = register("ramen", RamenItem::new);
	}

	// Start of user code block custom items
	// End of user code block custom items
	private static <I extends Item> I register(String name, Function<Item.Properties, ? extends I> supplier) {
		return (I) Items.registerItem(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(RamelMod.MODID, name)), (Function<Item.Properties, Item>) supplier);
	}
}