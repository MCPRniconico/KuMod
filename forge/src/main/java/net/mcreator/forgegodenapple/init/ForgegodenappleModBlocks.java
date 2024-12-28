
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.forgegodenapple.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.forgegodenapple.block.GodenappleoreBlock;
import net.mcreator.forgegodenapple.ForgegodenappleMod;

public class ForgegodenappleModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, ForgegodenappleMod.MODID);
	public static final RegistryObject<Block> GODENAPPLEORE = REGISTRY.register("godenappleore", () -> new GodenappleoreBlock());
	// Start of user code block custom blocks
	// End of user code block custom blocks
}
