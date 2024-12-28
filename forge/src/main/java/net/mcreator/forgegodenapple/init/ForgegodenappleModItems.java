
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.forgegodenapple.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import net.mcreator.forgegodenapple.item.GodenpickaxeItem;
import net.mcreator.forgegodenapple.item.GodeningotItem;
import net.mcreator.forgegodenapple.ForgegodenappleMod;

public class ForgegodenappleModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, ForgegodenappleMod.MODID);
	public static final RegistryObject<Item> GODENINGOT = REGISTRY.register("godeningot", () -> new GodeningotItem());
	public static final RegistryObject<Item> GODENAPPLEORE = block(ForgegodenappleModBlocks.GODENAPPLEORE);
	public static final RegistryObject<Item> GODENPICKAXE = REGISTRY.register("godenpickaxe", () -> new GodenpickaxeItem());

	// Start of user code block custom items
	// End of user code block custom items
	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
