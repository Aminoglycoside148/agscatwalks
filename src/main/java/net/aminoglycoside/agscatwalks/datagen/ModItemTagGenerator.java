package net.aminoglycoside.agscatwalks.datagen;

import net.aminoglycoside.agscatwalks.AGSCatwalksMod;
import net.aminoglycoside.agscatwalks.block.ModBlocks;
import net.aminoglycoside.agscatwalks.util.ModTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModItemTagGenerator extends ItemTagsProvider {

    public ModItemTagGenerator(PackOutput pOutput, CompletableFuture<HolderLookup.Provider> pLookupProvider, CompletableFuture<TagLookup<Block>> pBlockTags, @Nullable ExistingFileHelper existingFileHelper) {
        super(pOutput, pLookupProvider, pBlockTags, AGSCatwalksMod.MODID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider pProvider) {
        this.tag(ModTags.Items.CATWALKITEMS).add(
                ModBlocks.CATWALK_FLOOR_METAL.get().asItem(),
                ModBlocks.CATWALK_FLOOR_GRATE.get().asItem(),
                ModBlocks.CATWALK_FLOOR_MODERN1.get().asItem(),
                ModBlocks.CATWALK_FLOOR_MODERN2.get().asItem(),
                ModBlocks.CATWALK_FLOOR_MODERN1_ORANGE.get().asItem(),
                ModBlocks.CATWALK_FLOOR_MODERN1_YELLOW.get().asItem(),

                ModBlocks.CATWALK_STAIRS_METAL.get().asItem(),
                ModBlocks.CATWALK_STAIRS_GRATE.get().asItem(),
                ModBlocks.CATWALK_STAIRS_MODERN1.get().asItem(),
                ModBlocks.CATWALK_STAIRS_MODERN2.get().asItem(),
                ModBlocks.CATWALK_STAIRS_MODERN1_ORANGE.get().asItem(),
                ModBlocks.CATWALK_STAIRS_MODERN1_YELLOW.get().asItem(),

                ModBlocks.RAILING_SINGLE_METAL.get().asItem(),
                ModBlocks.RAILING_LANE_METAL.get().asItem(),
                ModBlocks.RAILING_CORNER_METAL.get().asItem(),
                ModBlocks.RAILING_END_METAL.get().asItem(),
                ModBlocks.RAILING_STAIRS_METAL.get().asItem(),


                ModBlocks.RAILING_SINGLE_MODERN1.get().asItem(),
                ModBlocks.RAILING_LANE_MODERN1.get().asItem(),
                ModBlocks.RAILING_CORNER_MODERN1.get().asItem(),
                ModBlocks.RAILING_END_MODERN1.get().asItem(),
                ModBlocks.RAILING_STAIRS_MODERN1.get().asItem(),


                ModBlocks.RAILING_SINGLE_MODERN2.get().asItem(),
                ModBlocks.RAILING_LANE_MODERN2.get().asItem(),
                ModBlocks.RAILING_CORNER_MODERN2.get().asItem(),
                ModBlocks.RAILING_END_MODERN2.get().asItem(),
                ModBlocks.RAILING_STAIRS_MODERN2.get().asItem(),

                ModBlocks.RAILING_SINGLE_MODERN1_ORANGE.get().asItem(),
                ModBlocks.RAILING_LANE_MODERN1_ORANGE.get().asItem(),
                ModBlocks.RAILING_CORNER_MODERN1_ORANGE.get().asItem(),
                ModBlocks.RAILING_END_MODERN1_ORANGE.get().asItem(),
                ModBlocks.RAILING_STAIRS_MODERN1_ORANGE.get().asItem(),

                ModBlocks.RAILING_SINGLE_MODERN1_YELLOW.get().asItem(),
                ModBlocks.RAILING_LANE_MODERN1_YELLOW.get().asItem(),
                ModBlocks.RAILING_CORNER_MODERN1_YELLOW.get().asItem(),
                ModBlocks.RAILING_END_MODERN1_YELLOW.get().asItem(),
                ModBlocks.RAILING_STAIRS_MODERN1_YELLOW.get().asItem(),

                ModBlocks.RAILING_SINGLE_MODERN2_ORANGE.get().asItem(),
                ModBlocks.RAILING_LANE_MODERN2_ORANGE.get().asItem(),
                ModBlocks.RAILING_CORNER_MODERN2_ORANGE.get().asItem(),
                ModBlocks.RAILING_END_MODERN2_ORANGE.get().asItem(),
                ModBlocks.RAILING_STAIRS_MODERN2_ORANGE.get().asItem(),

                ModBlocks.RAILING_SINGLE_MODERN2_YELLOW.get().asItem(),
                ModBlocks.RAILING_LANE_MODERN2_YELLOW.get().asItem(),
                ModBlocks.RAILING_CORNER_MODERN2_YELLOW.get().asItem(),
                ModBlocks.RAILING_END_MODERN2_YELLOW.get().asItem(),
                ModBlocks.RAILING_STAIRS_MODERN2_YELLOW.get().asItem()
        );
    }
}
