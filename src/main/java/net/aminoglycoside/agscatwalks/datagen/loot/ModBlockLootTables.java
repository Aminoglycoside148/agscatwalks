package net.aminoglycoside.agscatwalks.datagen.loot;

import net.aminoglycoside.agscatwalks.block.ModBlocks;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.RegistryObject;

import java.util.Set;

public class ModBlockLootTables extends BlockLootSubProvider {
    public ModBlockLootTables() {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags());
    }

    @Override
    protected void generate() {

        this.dropSelf(ModBlocks.CATWALK_FLOOR_METAL.get());
        this.dropSelf(ModBlocks.CATWALK_FLOOR_GRATE.get());
        this.dropSelf(ModBlocks.CATWALK_FLOOR_MODERN1.get());
        this.dropSelf(ModBlocks.CATWALK_FLOOR_MODERN2.get());

        this.dropSelf(ModBlocks.CATWALK_STAIRS_METAL.get());
        this.dropSelf(ModBlocks.CATWALK_STAIRS_GRATE.get());
        this.dropSelf(ModBlocks.CATWALK_STAIRS_MODERN1.get());
        this.dropSelf(ModBlocks.CATWALK_STAIRS_MODERN2.get());

        this.dropSelf(ModBlocks.RAILING_SINGLE_METAL.get());
        this.dropSelf(ModBlocks.RAILING_SINGLE_MODERN1.get());
        this.dropSelf(ModBlocks.RAILING_SINGLE_MODERN2.get());

        this.dropSelf(ModBlocks.RAILING_LANE_METAL.get());
        this.dropSelf(ModBlocks.RAILING_LANE_MODERN1.get());
        this.dropSelf(ModBlocks.RAILING_LANE_MODERN2.get());

        this.dropSelf(ModBlocks.RAILING_CORNER_METAL.get());
        this.dropSelf(ModBlocks.RAILING_CORNER_MODERN1.get());
        this.dropSelf(ModBlocks.RAILING_CORNER_MODERN2.get());

        this.dropSelf(ModBlocks.RAILING_END_METAL.get());
        this.dropSelf(ModBlocks.RAILING_END_MODERN1.get());
        this.dropSelf(ModBlocks.RAILING_END_MODERN2.get());

        this.dropSelf(ModBlocks.RAILING_STAIRS_METAL.get());
        this.dropSelf(ModBlocks.RAILING_STAIRS_MODERN1.get());
        this.dropSelf(ModBlocks.RAILING_STAIRS_MODERN2.get());






    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return ModBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}
