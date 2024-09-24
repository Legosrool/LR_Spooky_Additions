package net.legosrool.lr_spooky_additions.item;

import net.legosrool.lr_spooky_additions.LR_Spooky_Additions;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, LR_Spooky_Additions.MOD_ID);

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }

    public static final RegistryObject<CreativeModeTab> LR_SPOOKY_ADDITIONS_TAB = CREATIVE_MODE_TABS
            .register("lr_spooky_additions_tab", () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.SCUTTLES
                            .get()))
                    .title(Component.translatable("creativetab.lr_spooky_additions_tab"))
                    .displayItems(((itemDisplayParameters, output) -> {

                    output.accept(ModItems.SCUTTLES.get());







                    }))
                            .build());
}
