package net.aminoglycoside.pridemarkings.block;

import net.aminoglycoside.pridemarkings.AGSPrideMarkingsMod;
import net.aminoglycoside.pridemarkings.block.custom.MarkingFloor;
import net.aminoglycoside.pridemarkings.block.custom.MarkingWall;
import net.aminoglycoside.pridemarkings.item.ModItems;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import javax.annotation.Nullable;
import java.util.List;
import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, AGSPrideMarkingsMod.MODID);

    //add blocks like
    //public static final RegistryObject <Block> SAPPHIRE_BLOCK = registerBlock("sapphire_block",
    //    () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.AMETHYST)));


    public static final RegistryObject <Block> WALL_FLAG_PRIDE_DIAGONAL_LEFTDOWN = registerBlock("wall_flag_pride_diagonal_leftdown",
            () -> new MarkingWall(BlockBehaviour.Properties.of()
                    .sound(SoundType.WOOL)
                    .noOcclusion()
                    .noCollission()),"tooltip.ags_pridemarkings.wallmarking_prideflag");

    public static final RegistryObject <Block> WALL_FLAG_PRIDE_DIAGONAL_RIGHTDOWN = registerBlock("wall_flag_pride_diagonal_rightdown",
            () -> new MarkingWall(BlockBehaviour.Properties.of()
                    .sound(SoundType.WOOL)
                    .noOcclusion()
                    .noCollission()),"tooltip.ags_pridemarkings.wallmarking_prideflag");

    public static final RegistryObject <Block> WALL_FLAG_PRIDE_DIAGONAL_LEFTUP = registerBlock("wall_flag_pride_diagonal_leftup",
            () -> new MarkingWall(BlockBehaviour.Properties.of()
                    .sound(SoundType.WOOL)
                    .noOcclusion()
                    .noCollission()),"tooltip.ags_pridemarkings.wallmarking_prideflag");

    public static final RegistryObject <Block> WALL_FLAG_PRIDE_DIAGONAL_RIGHTUP = registerBlock("wall_flag_pride_diagonal_rightup",
            () -> new MarkingWall(BlockBehaviour.Properties.of()
                    .sound(SoundType.WOOL)
                    .noOcclusion()
                    .noCollission()),"tooltip.ags_pridemarkings.wallmarking_prideflag");

    public static final RegistryObject <Block> WALL_FLAG_PRIDE_CROSS = registerBlock("wall_flag_pride_cross",
            () -> new MarkingWall(BlockBehaviour.Properties.of()
                    .sound(SoundType.WOOL)
                    .noOcclusion()
                    .noCollission()),"tooltip.ags_pridemarkings.wallmarking_prideflag");

    public static final RegistryObject <Block> WALL_FLAG_PRIDE_VERTICAL = registerBlock("wall_flag_pride_vertical",
            () -> new MarkingWall(BlockBehaviour.Properties.of()
                    .sound(SoundType.WOOL)
                    .noOcclusion()
                    .noCollission()),"tooltip.ags_pridemarkings.wallmarking_prideflag");

    public static final RegistryObject <Block> WALL_FLAG_PRIDE_HORIZONTAL = registerBlock("wall_flag_pride_horizontal",
            () -> new MarkingWall(BlockBehaviour.Properties.of()
                    .sound(SoundType.WOOL)
                    .noOcclusion()
                    .noCollission()),"tooltip.ags_pridemarkings.wallmarking_prideflag");

    public static final RegistryObject <Block> WALL_FLAG_PROGRESSIVE_VERTICAL = registerBlock("wall_flag_progressive_vertical",
            () -> new MarkingWall(BlockBehaviour.Properties.of()
                    .sound(SoundType.WOOL)
                    .noOcclusion()
                    .noCollission()),"tooltip.ags_pridemarkings.wallmarking_prideflag");

    public static final RegistryObject <Block> WALL_FLAG_PROGRESSIVE_HORIZONTAL = registerBlock("wall_flag_progressive_horizontal",
            () -> new MarkingWall(BlockBehaviour.Properties.of()
                    .sound(SoundType.WOOL)
                    .noOcclusion()
                    .noCollission()),"tooltip.ags_pridemarkings.wallmarking_prideflag");

    public static final RegistryObject <Block> WALL_FLAG_ASEXUAL = registerBlock("wall_flag_asexual",
            () -> new MarkingWall(BlockBehaviour.Properties.of()
                    .sound(SoundType.WOOL)
                    .noOcclusion()
                    .noCollission()),"tooltip.ags_pridemarkings.wallmarking_prideflag");

    public static final RegistryObject <Block> WALL_FLAG_AGENDER = registerBlock("wall_flag_agender",
            () -> new MarkingWall(BlockBehaviour.Properties.of()
                    .sound(SoundType.WOOL)
                    .noOcclusion()
                    .noCollission()),"tooltip.ags_pridemarkings.wallmarking_prideflag");

    public static final RegistryObject <Block> WALL_FLAG_VINCIAN = registerBlock("wall_flag_vincian",
            () -> new MarkingWall(BlockBehaviour.Properties.of()
                    .sound(SoundType.WOOL)
                    .noOcclusion()
                    .noCollission()),"tooltip.ags_pridemarkings.wallmarking_prideflag");

    public static final RegistryObject <Block> WALL_FLAG_TRANS = registerBlock("wall_flag_trans",
            () -> new MarkingWall(BlockBehaviour.Properties.of()
                    .sound(SoundType.WOOL)
                    .noOcclusion()
                    .noCollission()),"tooltip.ags_pridemarkings.wallmarking_prideflag");

    public static final RegistryObject <Block> WALL_FLAG_SAPPHIC = registerBlock("wall_flag_sapphic",
            () -> new MarkingWall(BlockBehaviour.Properties.of()
                    .sound(SoundType.WOOL)
                    .noOcclusion()
                    .noCollission()),"tooltip.ags_pridemarkings.wallmarking_prideflag");

    public static final RegistryObject <Block> WALL_FLAG_POLYAMORY = registerBlock("wall_flag_polyamory",
            () -> new MarkingWall(BlockBehaviour.Properties.of()
                    .sound(SoundType.WOOL)
                    .noOcclusion()
                    .noCollission()),"tooltip.ags_pridemarkings.wallmarking_prideflag");

    public static final RegistryObject <Block> WALL_FLAG_POLYAMORY_NEW = registerBlock("wall_flag_polyamory_new",
            () -> new MarkingWall(BlockBehaviour.Properties.of()
                    .sound(SoundType.WOOL)
                    .noOcclusion()
                    .noCollission()),"tooltip.ags_pridemarkings.wallmarking_prideflag");

    public static final RegistryObject <Block> WALL_FLAG_PANSEXUAL = registerBlock("wall_flag_pansexual",
            () -> new MarkingWall(BlockBehaviour.Properties.of()
                    .sound(SoundType.WOOL)
                    .noOcclusion()
                    .noCollission()),"tooltip.ags_pridemarkings.wallmarking_prideflag");

    public static final RegistryObject <Block> WALL_FLAG_NONBINARY = registerBlock("wall_flag_nonbinary",
            () -> new MarkingWall(BlockBehaviour.Properties.of()
                    .sound(SoundType.WOOL)
                    .noOcclusion()
                    .noCollission()),"tooltip.ags_pridemarkings.wallmarking_prideflag");

    public static final RegistryObject <Block> WALL_FLAG_INTERSEX = registerBlock("wall_flag_intersex",
            () -> new MarkingWall(BlockBehaviour.Properties.of()
                    .sound(SoundType.WOOL)
                    .noOcclusion()
                    .noCollission()),"tooltip.ags_pridemarkings.wallmarking_prideflag");

    public static final RegistryObject <Block> WALL_FLAG_BISEXUAL = registerBlock("wall_flag_bisexual",
            () -> new MarkingWall(BlockBehaviour.Properties.of()
                    .sound(SoundType.WOOL)
                    .noOcclusion()
                    .noCollission()),"tooltip.ags_pridemarkings.wallmarking_prideflag");


    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block, String tooltipKey) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn, tooltipKey);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block, String tooltipKey) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties())
        {
            @Override
            public void appendHoverText(ItemStack stack, @Nullable Level level, List<Component> tooltip, TooltipFlag flagIn) {
                tooltip.add(Component.translatable (tooltipKey));
                super.appendHoverText(stack, level, tooltip, flagIn);
            }
        });
    }

    public static void register(IEventBus eventBus){
        BLOCKS.register(eventBus);
    }



}

