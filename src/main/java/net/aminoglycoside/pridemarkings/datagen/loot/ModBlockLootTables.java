package net.aminoglycoside.pridemarkings.datagen.loot;

import net.aminoglycoside.pridemarkings.block.ModBlocks;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlagSet;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.RegistryObject;

import java.util.Set;

public class ModBlockLootTables extends BlockLootSubProvider {
    public ModBlockLootTables() {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags());
    }

    @Override
    protected void generate() {


        this.dropSelf(ModBlocks.WALL_FLAG_PRIDE_CROSS.get());
        this.dropSelf(ModBlocks.WALL_FLAG_PRIDE_DIAGONAL_LEFTDOWN.get());
        this.dropSelf(ModBlocks.WALL_FLAG_PRIDE_DIAGONAL_LEFTUP.get());
        this.dropSelf(ModBlocks.WALL_FLAG_PRIDE_DIAGONAL_RIGHTDOWN.get());
        this.dropSelf(ModBlocks.WALL_FLAG_PRIDE_DIAGONAL_RIGHTUP.get());
        this.dropSelf(ModBlocks.WALL_FLAG_PRIDE_CROSS.get());
        this.dropSelf(ModBlocks.WALL_FLAG_PRIDE_VERTICAL.get());
        this.dropSelf(ModBlocks.WALL_FLAG_PRIDE_HORIZONTAL.get());

        this.dropSelf(ModBlocks.WALL_FLAG_PROGRESSIVE_VERTICAL.get());
        this.dropSelf(ModBlocks.WALL_FLAG_PROGRESSIVE_HORIZONTAL.get());

        this.dropSelf(ModBlocks.WALL_FLAG_ASEXUAL.get());
        this.dropSelf(ModBlocks.WALL_FLAG_AGENDER.get());
        this.dropSelf(ModBlocks.WALL_FLAG_VINCIAN.get());
        this.dropSelf(ModBlocks.WALL_FLAG_TRANS.get());
        this.dropSelf(ModBlocks.WALL_FLAG_SAPPHIC.get());
        this.dropSelf(ModBlocks.WALL_FLAG_POLYAMORY.get());
        this.dropSelf(ModBlocks.WALL_FLAG_PANSEXUAL.get());
        this.dropSelf(ModBlocks.WALL_FLAG_NONBINARY.get());
        this.dropSelf(ModBlocks.WALL_FLAG_INTERSEX.get());
        this.dropSelf(ModBlocks.WALL_FLAG_BISEXUAL.get());





    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return ModBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}
