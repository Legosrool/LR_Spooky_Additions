package net.legosrool.lr_spooky_additions.item;

import net.legosrool.lr_spooky_additions.LR_Spooky_Additions;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, LR_Spooky_Additions.MOD_ID);


    public static final RegistryObject<Item> SCUTTLES = ITEMS.register("scuttles",
            ()-> new Item(new Item.Properties().food(ModFoods.SCUTTLES)));
}
