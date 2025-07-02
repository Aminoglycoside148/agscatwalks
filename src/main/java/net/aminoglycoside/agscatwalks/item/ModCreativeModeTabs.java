package net.aminoglycoside.agscatwalks.item;

import net.aminoglycoside.agscatwalks.AGSCatwalksMod;
import net.aminoglycoside.agscatwalks.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, AGSCatwalksMod.MODID);

    public static final RegistryObject<CreativeModeTab> AGS_CATWALKS_TAB = CREATIVE_MODE_TABS.register("agscatwalks_tab",
            () -> CreativeModeTab.builder()
                    .icon(() -> new ItemStack(ModBlocks.CATWALK_FLOOR_GRATE.get()))
                    .title(Component.translatable("creativetab.ags_catwalks"))
                    .displayItems((pParameters, pOutput) -> {

                        pOutput.accept(ModBlocks.CATWALK_FLOOR_METAL.get());
                        pOutput.accept(ModBlocks.CATWALK_FLOOR_GRATE.get());
                        pOutput.accept(ModBlocks.CATWALK_FLOOR_MODERN1.get());
                        pOutput.accept(ModBlocks.CATWALK_FLOOR_MODERN2.get());


                        pOutput.accept(ModBlocks.CATWALK_STAIRS_METAL.get());
                        pOutput.accept(ModBlocks.CATWALK_STAIRS_GRATE.get());
                        pOutput.accept(ModBlocks.CATWALK_STAIRS_MODERN1.get());
                        pOutput.accept(ModBlocks.CATWALK_STAIRS_MODERN2.get());

                        pOutput.accept(ModBlocks.RAILING_SINGLE_METAL.get());
                        pOutput.accept(ModBlocks.RAILING_SINGLE_MODERN1.get());
                        pOutput.accept(ModBlocks.RAILING_SINGLE_MODERN2.get());

                        pOutput.accept(ModBlocks.RAILING_LANE_METAL.get());
                        pOutput.accept(ModBlocks.RAILING_LANE_MODERN1.get());
                        pOutput.accept(ModBlocks.RAILING_LANE_MODERN2.get());

                        pOutput.accept(ModBlocks.RAILING_CORNER_METAL.get());
                        pOutput.accept(ModBlocks.RAILING_CORNER_MODERN1.get());
                        pOutput.accept(ModBlocks.RAILING_CORNER_MODERN2.get());

                        pOutput.accept(ModBlocks.RAILING_END_METAL.get());
                        pOutput.accept(ModBlocks.RAILING_END_MODERN1.get());
                        pOutput.accept(ModBlocks.RAILING_END_MODERN2.get());

                        pOutput.accept(ModBlocks.RAILING_STAIRS_METAL.get());
                        pOutput.accept(ModBlocks.RAILING_STAIRS_MODERN1.get());
                        pOutput.accept(ModBlocks.RAILING_STAIRS_MODERN2.get());



                    })
                            .build());



    public static void register(IEventBus eventBus)
    {
        CREATIVE_MODE_TABS.register(eventBus);
    }

}
