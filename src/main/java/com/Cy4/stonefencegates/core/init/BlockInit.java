package com.Cy4.stonefencegates.core.init;

import com.Cy4.stonefencegates.Main;

        import net.minecraft.block.Block;
        import net.minecraft.block.SoundType;
        import net.minecraft.block.material.Material;
        import net.minecraft.block.material.MaterialColor;
        import net.minecraftforge.fml.RegistryObject;
        import net.minecraftforge.registries.DeferredRegister;
        import net.minecraftforge.registries.ForgeRegistries;
        import net.minecraft.item.ItemGroup;

public class BlockInit
    {

        public static final DeferredRegister<Block> BLOCKS = new DeferredRegister<>(ForgeRegistries.BLOCKS, Main.MOD_ID);
    }