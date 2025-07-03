package net.aminoglycoside.agscatwalks.block;

import net.aminoglycoside.agscatwalks.AGSCatwalksMod;
import net.aminoglycoside.agscatwalks.block.custom.*;
import net.aminoglycoside.agscatwalks.item.ModItems;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
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
            DeferredRegister.create(ForgeRegistries.BLOCKS, AGSCatwalksMod.MODID);

    //add blocks like
    //public static final RegistryObject <Block> SAPPHIRE_BLOCK = registerBlock("sapphire_block",
    //    () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.AMETHYST)));


    public static final RegistryObject <Block> CATWALK_FLOOR_METAL = registerBlock("catwalk_floor_metal",
            () -> new CatwalkFloor(BlockBehaviour.Properties.of()
                    .strength(1f)
                    .sound(SoundType.COPPER)
                    .noOcclusion()),"tooltip.ags_catwalks.catwalkfloor");

    public static final RegistryObject <Block> CATWALK_FLOOR_GRATE = registerBlock("catwalk_floor_grate",
            () -> new CatwalkFloor(BlockBehaviour.Properties.of()
                    .strength(1f)
                    .sound(SoundType.COPPER)
                    .noOcclusion()),"tooltip.ags_catwalks.catwalkfloor");

    public static final RegistryObject <Block> CATWALK_FLOOR_MODERN1 = registerBlock("catwalk_floor_modern1",
            () -> new CatwalkFloor(BlockBehaviour.Properties.of()
                    .strength(1f)
                    .sound(SoundType.COPPER)
                    .noOcclusion()),"tooltip.ags_catwalks.catwalkfloor");


    public static final RegistryObject <Block> CATWALK_FLOOR_MODERN2 = registerBlock("catwalk_floor_modern2",
            () -> new CatwalkFloor(BlockBehaviour.Properties.of()
                    .strength(1f)
                    .sound(SoundType.COPPER)
                    .noOcclusion()),"tooltip.ags_catwalks.catwalkfloor");

    public static final RegistryObject <Block> CATWALK_FLOOR_MODERN1_ORANGE = registerBlock("catwalk_floor_modern1_orange",
            () -> new CatwalkFloor(BlockBehaviour.Properties.of()
                    .strength(1f)
                    .sound(SoundType.COPPER)
                    .noOcclusion()),"tooltip.ags_catwalks.catwalkfloor");

    public static final RegistryObject <Block> CATWALK_FLOOR_MODERN1_YELLOW = registerBlock("catwalk_floor_modern1_yellow",
            () -> new CatwalkFloor(BlockBehaviour.Properties.of()
                    .strength(1f)
                    .sound(SoundType.COPPER)
                    .noOcclusion()),"tooltip.ags_catwalks.catwalkfloor");



    public static final RegistryObject <Block> CATWALK_STAIRS_METAL = registerBlock("catwalk_stairs_metal",
            () -> new CatwalkStairs(BlockBehaviour.Properties.of()
                    .strength(1f)
                    .sound(SoundType.COPPER)
                    .noOcclusion()),"tooltip.ags_catwalks.catwalkfloor");

    public static final RegistryObject <Block> CATWALK_STAIRS_GRATE = registerBlock("catwalk_stairs_grate",
            () -> new CatwalkStairs(BlockBehaviour.Properties.of()
                    .strength(1f)
                    .sound(SoundType.COPPER)
                    .noOcclusion()),"tooltip.ags_catwalks.catwalkfloor");

    public static final RegistryObject <Block> CATWALK_STAIRS_MODERN1 = registerBlock("catwalk_stairs_modern1",
            () -> new CatwalkStairs(BlockBehaviour.Properties.of()
                    .strength(1f)
                    .sound(SoundType.COPPER)
                    .noOcclusion()),"tooltip.ags_catwalks.catwalkfloor");

    public static final RegistryObject <Block> CATWALK_STAIRS_MODERN2 = registerBlock("catwalk_stairs_modern2",
            () -> new CatwalkStairs(BlockBehaviour.Properties.of()
                    .strength(1f)
                    .sound(SoundType.COPPER)
                    .noOcclusion()),"tooltip.ags_catwalks.catwalkfloor");

    public static final RegistryObject <Block> CATWALK_STAIRS_MODERN1_ORANGE = registerBlock("catwalk_stairs_modern1_orange",
            () -> new CatwalkStairs(BlockBehaviour.Properties.of()
                    .strength(1f)
                    .sound(SoundType.COPPER)
                    .noOcclusion()),"tooltip.ags_catwalks.catwalkfloor");

    public static final RegistryObject <Block> CATWALK_STAIRS_MODERN1_YELLOW = registerBlock("catwalk_stairs_modern1_yellow",
            () -> new CatwalkStairs(BlockBehaviour.Properties.of()
                    .strength(1f)
                    .sound(SoundType.COPPER)
                    .noOcclusion()),"tooltip.ags_catwalks.catwalkfloor");





    public static final RegistryObject <Block> RAILING_SINGLE_METAL = registerBlock("railing_single_metal",
            () -> new RailingSingle(BlockBehaviour.Properties.of()
                    .strength(1f)
                    .sound(SoundType.COPPER)
                    .noOcclusion()),"tooltip.ags_catwalks.railing");

    public static final RegistryObject <Block> RAILING_LANE_METAL = registerBlock("railing_lane_metal",
            () -> new RailingLane(BlockBehaviour.Properties.of()
                    .strength(1f)
                    .sound(SoundType.COPPER)
                    .noOcclusion()),"tooltip.ags_catwalks.railing");

    public static final RegistryObject <Block> RAILING_CORNER_METAL = registerBlock("railing_corner_metal",
            () -> new RailingCorner(BlockBehaviour.Properties.of()
                    .strength(1f)
                    .sound(SoundType.COPPER)
                    .noOcclusion()),"tooltip.ags_catwalks.railing");

    public static final RegistryObject <Block> RAILING_END_METAL = registerBlock("railing_end_metal",
            () -> new RailingEnd(BlockBehaviour.Properties.of()
                    .strength(1f)
                    .sound(SoundType.COPPER)
                    .noOcclusion()),"tooltip.ags_catwalks.railing");

    public static final RegistryObject <Block> RAILING_STAIRS_METAL = registerBlock("railing_stairs_metal",
            () -> new RailingStairs(BlockBehaviour.Properties.of()
                    .strength(1f)
                    .sound(SoundType.COPPER)
                    .noOcclusion()),"tooltip.ags_catwalks.railing");




    public static final RegistryObject <Block> RAILING_SINGLE_MODERN1 = registerBlock("railing_single_modern1",
            () -> new RailingSingle(BlockBehaviour.Properties.of()
                    .strength(1f)
                    .sound(SoundType.COPPER)
                    .noOcclusion()),"tooltip.ags_catwalks.railing");

    public static final RegistryObject <Block> RAILING_SINGLE_MODERN2 = registerBlock("railing_single_modern2",
            () -> new RailingSingle(BlockBehaviour.Properties.of()
                    .strength(1f)
                    .sound(SoundType.COPPER)
                    .noOcclusion()),"tooltip.ags_catwalks.railing");



    public static final RegistryObject <Block> RAILING_LANE_MODERN1 = registerBlock("railing_lane_modern1",
            () -> new RailingLane(BlockBehaviour.Properties.of()
                    .strength(1f)
                    .sound(SoundType.COPPER)
                    .noOcclusion()),"tooltip.ags_catwalks.railing");

    public static final RegistryObject <Block> RAILING_LANE_MODERN2 = registerBlock("railing_lane_modern2",
            () -> new RailingLane(BlockBehaviour.Properties.of()
                    .strength(1f)
                    .sound(SoundType.COPPER)
                    .noOcclusion()),"tooltip.ags_catwalks.railing");



    public static final RegistryObject <Block> RAILING_CORNER_MODERN1 = registerBlock("railing_corner_modern1",
            () -> new RailingCorner(BlockBehaviour.Properties.of()
                    .strength(1f)
                    .sound(SoundType.COPPER)
                    .noOcclusion()),"tooltip.ags_catwalks.railing");

    public static final RegistryObject <Block> RAILING_CORNER_MODERN2 = registerBlock("railing_corner_modern2",
            () -> new RailingCorner(BlockBehaviour.Properties.of()
                    .strength(1f)
                    .sound(SoundType.COPPER)
                    .noOcclusion()),"tooltip.ags_catwalks.railing");



    public static final RegistryObject <Block> RAILING_END_MODERN1 = registerBlock("railing_end_modern1",
            () -> new RailingEnd(BlockBehaviour.Properties.of()
                    .strength(1f)
                    .sound(SoundType.COPPER)
                    .noOcclusion()),"tooltip.ags_catwalks.railing");

    public static final RegistryObject <Block> RAILING_END_MODERN2 = registerBlock("railing_end_modern2",
            () -> new RailingEnd(BlockBehaviour.Properties.of()
                    .strength(1f)
                    .sound(SoundType.COPPER)
                    .noOcclusion()),"tooltip.ags_catwalks.railing");



    public static final RegistryObject <Block> RAILING_STAIRS_MODERN1 = registerBlock("railing_stairs_modern1",
            () -> new RailingStairs(BlockBehaviour.Properties.of()
                    .strength(1f)
                    .sound(SoundType.COPPER)
                    .noOcclusion()),"tooltip.ags_catwalks.railing");

    public static final RegistryObject <Block> RAILING_STAIRS_MODERN2 = registerBlock("railing_stairs_modern2",
            () -> new RailingStairs(BlockBehaviour.Properties.of()
                    .strength(1f)
                    .sound(SoundType.COPPER)
                    .noOcclusion()),"tooltip.ags_catwalks.railing");


    public static final RegistryObject <Block> RAILING_SINGLE_MODERN1_ORANGE = registerBlock("railing_single_modern1_orange",
            () -> new RailingSingle(BlockBehaviour.Properties.of()
                    .strength(1f)
                    .sound(SoundType.COPPER)
                    .noOcclusion()),"tooltip.ags_catwalks.railing");

    public static final RegistryObject <Block> RAILING_LANE_MODERN1_ORANGE = registerBlock("railing_lane_modern1_orange",
            () -> new RailingLane(BlockBehaviour.Properties.of()
                    .strength(1f)
                    .sound(SoundType.COPPER)
                    .noOcclusion()),"tooltip.ags_catwalks.railing");

    public static final RegistryObject <Block> RAILING_CORNER_MODERN1_ORANGE = registerBlock("railing_corner_modern1_orange",
            () -> new RailingCorner(BlockBehaviour.Properties.of()
                    .strength(1f)
                    .sound(SoundType.COPPER)
                    .noOcclusion()),"tooltip.ags_catwalks.railing");

    public static final RegistryObject <Block> RAILING_END_MODERN1_ORANGE = registerBlock("railing_end_modern1_orange",
            () -> new RailingEnd(BlockBehaviour.Properties.of()
                    .strength(1f)
                    .sound(SoundType.COPPER)
                    .noOcclusion()),"tooltip.ags_catwalks.railing");

    public static final RegistryObject <Block> RAILING_STAIRS_MODERN1_ORANGE = registerBlock("railing_stairs_modern1_orange",
            () -> new RailingStairs(BlockBehaviour.Properties.of()
                    .strength(1f)
                    .sound(SoundType.COPPER)
                    .noOcclusion()),"tooltip.ags_catwalks.railing");

    public static final RegistryObject <Block> RAILING_SINGLE_MODERN1_YELLOW = registerBlock("railing_single_modern1_yellow",
            () -> new RailingSingle(BlockBehaviour.Properties.of()
                    .strength(1f)
                    .sound(SoundType.COPPER)
                    .noOcclusion()),"tooltip.ags_catwalks.railing");

    public static final RegistryObject <Block> RAILING_LANE_MODERN1_YELLOW = registerBlock("railing_lane_modern1_yellow",
            () -> new RailingLane(BlockBehaviour.Properties.of()
                    .strength(1f)
                    .sound(SoundType.COPPER)
                    .noOcclusion()),"tooltip.ags_catwalks.railing");

    public static final RegistryObject <Block> RAILING_CORNER_MODERN1_YELLOW = registerBlock("railing_corner_modern1_yellow",
            () -> new RailingCorner(BlockBehaviour.Properties.of()
                    .strength(1f)
                    .sound(SoundType.COPPER)
                    .noOcclusion()),"tooltip.ags_catwalks.railing");

    public static final RegistryObject <Block> RAILING_END_MODERN1_YELLOW = registerBlock("railing_end_modern1_yellow",
            () -> new RailingEnd(BlockBehaviour.Properties.of()
                    .strength(1f)
                    .sound(SoundType.COPPER)
                    .noOcclusion()),"tooltip.ags_catwalks.railing");

    public static final RegistryObject <Block> RAILING_STAIRS_MODERN1_YELLOW = registerBlock("railing_stairs_modern1_yellow",
            () -> new RailingStairs(BlockBehaviour.Properties.of()
                    .strength(1f)
                    .sound(SoundType.COPPER)
                    .noOcclusion()),"tooltip.ags_catwalks.railing");


    public static final RegistryObject <Block> RAILING_SINGLE_MODERN2_ORANGE = registerBlock("railing_single_modern2_orange",
            () -> new RailingSingle(BlockBehaviour.Properties.of()
                    .strength(1f)
                    .sound(SoundType.COPPER)
                    .noOcclusion()),"tooltip.ags_catwalks.railing");

    public static final RegistryObject <Block> RAILING_LANE_MODERN2_ORANGE = registerBlock("railing_lane_modern2_orange",
            () -> new RailingLane(BlockBehaviour.Properties.of()
                    .strength(1f)
                    .sound(SoundType.COPPER)
                    .noOcclusion()),"tooltip.ags_catwalks.railing");

    public static final RegistryObject <Block> RAILING_CORNER_MODERN2_ORANGE = registerBlock("railing_corner_modern2_orange",
            () -> new RailingCorner(BlockBehaviour.Properties.of()
                    .strength(1f)
                    .sound(SoundType.COPPER)
                    .noOcclusion()),"tooltip.ags_catwalks.railing");

    public static final RegistryObject <Block> RAILING_END_MODERN2_ORANGE = registerBlock("railing_end_modern2_orange",
            () -> new RailingEnd(BlockBehaviour.Properties.of()
                    .strength(1f)
                    .sound(SoundType.COPPER)
                    .noOcclusion()),"tooltip.ags_catwalks.railing");

    public static final RegistryObject <Block> RAILING_STAIRS_MODERN2_ORANGE = registerBlock("railing_stairs_modern2_orange",
            () -> new RailingStairs(BlockBehaviour.Properties.of()
                    .strength(1f)
                    .sound(SoundType.COPPER)
                    .noOcclusion()),"tooltip.ags_catwalks.railing");

    public static final RegistryObject <Block> RAILING_SINGLE_MODERN2_YELLOW = registerBlock("railing_single_modern2_yellow",
            () -> new RailingSingle(BlockBehaviour.Properties.of()
                    .strength(1f)
                    .sound(SoundType.COPPER)
                    .noOcclusion()),"tooltip.ags_catwalks.railing");

    public static final RegistryObject <Block> RAILING_LANE_MODERN2_YELLOW = registerBlock("railing_lane_modern2_yellow",
            () -> new RailingLane(BlockBehaviour.Properties.of()
                    .strength(1f)
                    .sound(SoundType.COPPER)
                    .noOcclusion()),"tooltip.ags_catwalks.railing");

    public static final RegistryObject <Block> RAILING_CORNER_MODERN2_YELLOW = registerBlock("railing_corner_modern2_yellow",
            () -> new RailingCorner(BlockBehaviour.Properties.of()
                    .strength(1f)
                    .sound(SoundType.COPPER)
                    .noOcclusion()),"tooltip.ags_catwalks.railing");

    public static final RegistryObject <Block> RAILING_END_MODERN2_YELLOW = registerBlock("railing_end_modern2_yellow",
            () -> new RailingEnd(BlockBehaviour.Properties.of()
                    .strength(1f)
                    .sound(SoundType.COPPER)
                    .noOcclusion()),"tooltip.ags_catwalks.railing");

    public static final RegistryObject <Block> RAILING_STAIRS_MODERN2_YELLOW = registerBlock("railing_stairs_modern2_yellow",
            () -> new RailingStairs(BlockBehaviour.Properties.of()
                    .strength(1f)
                    .sound(SoundType.COPPER)
                    .noOcclusion()),"tooltip.ags_catwalks.railing");




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

