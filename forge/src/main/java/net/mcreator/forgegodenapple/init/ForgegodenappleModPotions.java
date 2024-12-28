
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.forgegodenapple.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.alchemy.Potion;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;

import net.mcreator.forgegodenapple.ForgegodenappleMod;

public class ForgegodenappleModPotions {
	public static final DeferredRegister<Potion> REGISTRY = DeferredRegister.create(ForgeRegistries.POTIONS, ForgegodenappleMod.MODID);
	public static final RegistryObject<Potion> GODOENAPPLEPOTION = REGISTRY.register("godoenapplepotion", () -> new Potion(new MobEffectInstance(MobEffects.ABSORPTION, 2400, 4, false, true),
			new MobEffectInstance(MobEffects.REGENERATION, 200, 2, false, true), new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 6000, 0, false, true), new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 6000, 0, false, true)));
}
