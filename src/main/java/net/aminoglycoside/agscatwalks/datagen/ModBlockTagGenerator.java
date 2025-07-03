package net.aminoglycoside.agscatwalks.datagen;

import net.aminoglycoside.agscatwalks.AGSCatwalksMod;
import net.aminoglycoside.agscatwalks.block.ModBlocks;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

import javax.annotation.Nullable;
import java.util.concurrent.CompletableFuture;

public class ModBlockTagGenerator extends BlockTagsProvider {
    public ModBlockTagGenerator(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, AGSCatwalksMod.MODID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider pProvider) {
        this.tag(BlockTags.MINEABLE_WITH_PICKAXE).add(
                ModBlocks.CATWALK_FLOOR_METAL.get(),
        ModBlocks.CATWALK_FLOOR_GRATE.get(),
        ModBlocks.CATWALK_FLOOR_MODERN1.get(),
        ModBlocks.CATWALK_FLOOR_MODERN2.get(),
        ModBlocks.CATWALK_FLOOR_MODERN1_ORANGE.get(),
        ModBlocks.CATWALK_FLOOR_MODERN1_YELLOW.get(),

        ModBlocks.CATWALK_STAIRS_METAL.get(),
        ModBlocks.CATWALK_STAIRS_GRATE.get(),
        ModBlocks.CATWALK_STAIRS_MODERN1.get(),
        ModBlocks.CATWALK_STAIRS_MODERN2.get(),
        ModBlocks.CATWALK_STAIRS_MODERN1_ORANGE.get(),
        ModBlocks.CATWALK_STAIRS_MODERN1_YELLOW.get(),

        ModBlocks.RAILING_SINGLE_METAL.get(),
        ModBlocks.RAILING_LANE_METAL.get(),
        ModBlocks.RAILING_CORNER_METAL.get(),
        ModBlocks.RAILING_END_METAL.get(),
        ModBlocks.RAILING_STAIRS_METAL.get(),


        ModBlocks.RAILING_SINGLE_MODERN1.get(),
        ModBlocks.RAILING_LANE_MODERN1.get(),
        ModBlocks.RAILING_CORNER_MODERN1.get(),
        ModBlocks.RAILING_END_MODERN1.get(),
        ModBlocks.RAILING_STAIRS_MODERN1.get(),


        ModBlocks.RAILING_SINGLE_MODERN2.get(),
        ModBlocks.RAILING_LANE_MODERN2.get(),
        ModBlocks.RAILING_CORNER_MODERN2.get(),
        ModBlocks.RAILING_END_MODERN2.get(),
        ModBlocks.RAILING_STAIRS_MODERN2.get(),

        ModBlocks.RAILING_SINGLE_MODERN1_ORANGE.get(),
        ModBlocks.RAILING_LANE_MODERN1_ORANGE.get(),
        ModBlocks.RAILING_CORNER_MODERN1_ORANGE.get(),
        ModBlocks.RAILING_END_MODERN1_ORANGE.get(),
        ModBlocks.RAILING_STAIRS_MODERN1_ORANGE.get(),

        ModBlocks.RAILING_SINGLE_MODERN1_YELLOW.get(),
        ModBlocks.RAILING_LANE_MODERN1_YELLOW.get(),
        ModBlocks.RAILING_CORNER_MODERN1_YELLOW.get(),
        ModBlocks.RAILING_END_MODERN1_YELLOW.get(),
        ModBlocks.RAILING_STAIRS_MODERN1_YELLOW.get(),

        ModBlocks.RAILING_SINGLE_MODERN2_ORANGE.get(),
        ModBlocks.RAILING_LANE_MODERN2_ORANGE.get(),
        ModBlocks.RAILING_CORNER_MODERN2_ORANGE.get(),
        ModBlocks.RAILING_END_MODERN2_ORANGE.get(),
        ModBlocks.RAILING_STAIRS_MODERN2_ORANGE.get(),

        ModBlocks.RAILING_SINGLE_MODERN2_YELLOW.get(),
        ModBlocks.RAILING_LANE_MODERN2_YELLOW.get(),
        ModBlocks.RAILING_CORNER_MODERN2_YELLOW.get(),
        ModBlocks.RAILING_END_MODERN2_YELLOW.get(),
        ModBlocks.RAILING_STAIRS_MODERN2_YELLOW.get()
        );
    }
}
