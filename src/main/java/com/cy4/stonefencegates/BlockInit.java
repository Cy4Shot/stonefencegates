package com.cy4.stonefencegates;

import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.FenceGateBlock;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class BlockInit {
	public static final DeferredRegister<Block> BLOCKS = new DeferredRegister<>(ForgeRegistries.BLOCKS, Main.MOD_ID);

	public static final RegistryObject<Block> COBBLESTONE_FENCE_GATE = BLOCKS.register("cobblestone_fence_gate",
			() -> new FenceGateBlock(Block.Properties.from(Blocks.COBBLESTONE)));

	public static final RegistryObject<Block> MOSSY_COBBLESTONE_FENCE_GATE = BLOCKS.register(
			"mossy_cobblestone_fence_gate", () -> new FenceGateBlock(Block.Properties.from(Blocks.MOSSY_COBBLESTONE)));

	public static final RegistryObject<Block> STONE_BRICK_FENCE_GATE = BLOCKS.register("stone_brick_fence_gate",
			() -> new FenceGateBlock(Block.Properties.from(Blocks.STONE_BRICKS)));

	public static final RegistryObject<Block> MOSSY_STONE_BRICK_FENCE_GATE = BLOCKS.register(
			"mossy_stone_brick_fence_gate", () -> new FenceGateBlock(Block.Properties.from(Blocks.MOSSY_STONE_BRICKS)));

	public static final RegistryObject<Block> ANDESITE_FENCE_GATE = BLOCKS.register("andesite_fence_gate",
			() -> new FenceGateBlock(Block.Properties.from(Blocks.ANDESITE)));

	public static final RegistryObject<Block> DIORITE_FENCE_GATE = BLOCKS.register("diorite_fence_gate",
			() -> new FenceGateBlock(Block.Properties.from(Blocks.DIORITE)));

	public static final RegistryObject<Block> GRANITE_FENCE_GATE = BLOCKS.register("granite_fence_gate",
			() -> new FenceGateBlock(Block.Properties.from(Blocks.GRANITE)));

	public static final RegistryObject<Block> SANDSTONE_FENCE_GATE = BLOCKS.register("sandstone_fence_gate",
			() -> new FenceGateBlock(Block.Properties.from(Blocks.SANDSTONE)));

	public static final RegistryObject<Block> RED_SANDSTONE_FENCE_GATE = BLOCKS.register("red_sandstone_fence_gate",
			() -> new FenceGateBlock(Block.Properties.from(Blocks.RED_SANDSTONE)));

	public static final RegistryObject<Block> BRICK_FENCE_GATE = BLOCKS.register("brick_fence_gate",
			() -> new FenceGateBlock(Block.Properties.from(Blocks.BRICKS)));

	public static final RegistryObject<Block> PRISMARINE_FENCE_GATE = BLOCKS.register("prismarine_fence_gate",
			() -> new FenceGateBlock(Block.Properties.from(Blocks.PRISMARINE)));

	public static final RegistryObject<Block> NETHER_BRICK_FENCE_GATE = BLOCKS.register("nether_brick_fence_gate",
			() -> new FenceGateBlock(Block.Properties.from(Blocks.NETHER_BRICKS)));

	public static final RegistryObject<Block> RED_NETHER_BRICK_FENCE_GATE = BLOCKS.register(
			"red_nether_brick_fence_gate", () -> new FenceGateBlock(Block.Properties.from(Blocks.RED_NETHER_BRICKS)));

	public static final RegistryObject<Block> END_STONE_BRICK_FENCE_GATE = BLOCKS.register("end_stone_brick_fence_gate",
			() -> new FenceGateBlock(Block.Properties.from(Blocks.END_STONE_BRICKS)));
}