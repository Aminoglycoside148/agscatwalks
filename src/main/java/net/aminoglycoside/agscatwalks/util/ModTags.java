package net.aminoglycoside.agscatwalks.util;

import net.aminoglycoside.agscatwalks.AGSCatwalksMod;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

import static net.minecraft.tags.TagEntry.tag;

public class ModTags {
    public static class Blocks{
        public static final TagKey<Block> CATWALKBLOCKS =  tag ("catwalkblocks");

        private static TagKey<Block> tag(String name) {
            return BlockTags.create(new ResourceLocation(AGSCatwalksMod.MODID, name));
        }
    }

    public static class Items {
        public static final TagKey<Item> CATWALKITEMS =  tag("catwalkitems");

        private static TagKey<Item> tag(String name) {
            return ItemTags.create(new ResourceLocation(AGSCatwalksMod.MODID, name));
        }
    }
}
