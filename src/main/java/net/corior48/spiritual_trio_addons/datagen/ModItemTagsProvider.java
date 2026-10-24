package net.corior48.spiritual_trio_addons.datagen;

import net.corior48.spiritual_trio_addons.SpiritualTrioAddons;
import net.corior48.spiritual_trio_addons.item.ModItems;
import net.corior48.spiritual_trio_addons.tags.ModTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceKey;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagEntry;
import net.minecraft.world.item.Item;
import net.neoforged.neoforge.common.data.ItemTagsProvider;

import java.util.concurrent.CompletableFuture;

public class ModItemTagsProvider extends ItemTagsProvider {
    public ModItemTagsProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider) {
        super(output, lookupProvider, SpiritualTrioAddons.MODID);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        tag(ItemTags.SWORDS)
                .add(ModItems.getRK((Item) ModItems.LYRIC_SWORD.get()))
                .add(ModItems.getRK((Item) ModItems.LYRIC_OG_SWORD.get()))
                .add(ModItems.getRK((Item) ModItems.MATT_SWORD.get()))
                .add(ModItems.getRK((Item) ModItems.CHARA_KNIFE.get()))
                .add(ModItems.getRK((Item) ModItems.DARKNESS_CLAWS.get()));

    }
}
