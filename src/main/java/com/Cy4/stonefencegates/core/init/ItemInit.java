package com.Cy4.stonefencegates.core.init;

import com.Cy4.stonefencegates.Main;

        import net.minecraft.item.Food;
        import net.minecraft.item.Item;
        import net.minecraft.item.Rarity;
        import net.minecraft.potion.EffectInstance;
        import net.minecraft.potion.Effects;
        import net.minecraftforge.fml.RegistryObject;
        import net.minecraftforge.registries.DeferredRegister;
        import net.minecraftforge.registries.ForgeRegistries;
        import net.minecraft.item.ItemGroup;

public class ItemInit {
	
	public static final DeferredRegister<Item> ITEMS = new DeferredRegister<>(ForgeRegistries.ITEMS, Main.MOD_ID);
}