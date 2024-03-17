
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.peatmod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.peatmod.block.PeatBlock;
import net.mcreator.peatmod.PeatModMod;

public class PeatModModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, PeatModMod.MODID);
	public static final RegistryObject<Block> PEAT = REGISTRY.register("peat", () -> new PeatBlock());
}
