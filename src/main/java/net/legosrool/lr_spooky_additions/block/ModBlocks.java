package net.legosrool.lr_spooky_additions.block;

import net.legosrool.lr_spooky_additions.LR_Spooky_Additions;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, LR_Spooky_Additions.MOD_ID);



    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
