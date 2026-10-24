package net.corior48.spiritual_trio_addons.tags;

import net.corior48.spiritual_trio_addons.SpiritualTrioAddons;
import net.minecraft.resources.Identifier;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public class ModTags {

    public static class Blocks {

        public static final TagKey<Block> INCORRECT_FOR_LYRIC_SWORD = createTag("incorrect_for_lyric_sword");
        public static final TagKey<Block> INCORRECT_FOR_MATT_SWORD = createTag("incorrect_for_matt_sword");
        public static final TagKey<Block> INCORRECT_FOR_CHARA_KNIFE = createTag("incorrect_for_chara_knife");
        public static final TagKey<Block> INCORRECT_FOR_DARKNESS_CLAW = createTag("incorrect_for_darkness_claw");

        private static TagKey<Block> createTag(String name) {
            return BlockTags.create(Identifier.fromNamespaceAndPath(SpiritualTrioAddons.MODID, name));
        }
    }

    public static class Items {

        public static final TagKey<Item> LYRIC_SWORD_REPAIRABLE = createTag("lyric_sword_repairable");
        public static final TagKey<Item> MATT_SWORD_REPAIRABLE = createTag("matt_sword_repairable");
        public static final TagKey<Item> CHARA_KNIFE_REPAIRABLE = createTag("chara_knife_repairable");
        public static final TagKey<Item> DARKNESS_CLAW_REPAIRABLE = createTag("darkness_claw_repairable");

        private static TagKey<Item> createTag(String name) {
            return ItemTags.create(Identifier.fromNamespaceAndPath(SpiritualTrioAddons.MODID, name));
        }
    }
}
