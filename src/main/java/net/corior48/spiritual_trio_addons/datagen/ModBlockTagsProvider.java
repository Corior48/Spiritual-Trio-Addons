package net.corior48.spiritual_trio_addons.datagen;

import net.corior48.spiritual_trio_addons.SpiritualTrioAddons;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.common.data.BlockTagsProvider;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagsProvider extends BlockTagsProvider {
    public ModBlockTagsProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider) {
        super(output, lookupProvider, SpiritualTrioAddons.MODID);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {

    }
}
