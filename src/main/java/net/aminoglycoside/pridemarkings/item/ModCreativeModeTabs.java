package net.aminoglycoside.pridemarkings.item;

import net.aminoglycoside.pridemarkings.AGSPrideMarkingsMod;
import net.aminoglycoside.pridemarkings.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, AGSPrideMarkingsMod.MODID);

    public static final RegistryObject<CreativeModeTab> PRIDE_MARKING_TAB = CREATIVE_MODE_TABS.register("pride_markings_tab",
            () -> CreativeModeTab.builder()
                    .icon(() -> new ItemStack(ModItems.CHALK.get()))
                    .title(Component.translatable("creativetab.pride_markings"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModItems.CHALK.get());


                        pOutput.accept(ModBlocks.WALL_FLAG_PRIDE_DIAGONAL_LEFTDOWN.get());
                        pOutput.accept(ModBlocks.WALL_FLAG_PRIDE_DIAGONAL_LEFTUP.get());
                        pOutput.accept(ModBlocks.WALL_FLAG_PRIDE_DIAGONAL_RIGHTDOWN.get());
                        pOutput.accept(ModBlocks.WALL_FLAG_PRIDE_DIAGONAL_RIGHTUP.get());
                        pOutput.accept(ModBlocks.WALL_FLAG_PRIDE_CROSS.get());
                        pOutput.accept(ModBlocks.WALL_FLAG_PRIDE_VERTICAL.get());
                        pOutput.accept(ModBlocks.WALL_FLAG_PRIDE_HORIZONTAL.get());

                        pOutput.accept(ModBlocks.WALL_FLAG_PROGRESSIVE_VERTICAL.get());
                        pOutput.accept(ModBlocks.WALL_FLAG_PROGRESSIVE_HORIZONTAL.get());

                        pOutput.accept(ModBlocks.WALL_FLAG_AGENDER.get());
                        pOutput.accept(ModBlocks.WALL_FLAG_ASEXUAL.get());
                        pOutput.accept(ModBlocks.WALL_FLAG_VINCIAN.get());
                        pOutput.accept(ModBlocks.WALL_FLAG_TRANS.get());
                        pOutput.accept(ModBlocks.WALL_FLAG_SAPPHIC.get());
                        pOutput.accept(ModBlocks.WALL_FLAG_POLYAMORY.get());
                        pOutput.accept(ModBlocks.WALL_FLAG_PANSEXUAL.get());
                        pOutput.accept(ModBlocks.WALL_FLAG_NONBINARY.get());
                        pOutput.accept(ModBlocks.WALL_FLAG_INTERSEX.get());
                        pOutput.accept(ModBlocks.WALL_FLAG_BISEXUAL.get());



                    })
                            .build());



    public static void register(IEventBus eventBus)
    {
        CREATIVE_MODE_TABS.register(eventBus);
    }

}
