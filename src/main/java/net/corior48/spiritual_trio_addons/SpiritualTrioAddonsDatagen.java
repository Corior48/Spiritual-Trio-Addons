package net.corior48.spiritual_trio_addons;

import net.corior48.spiritual_trio_addons.datagen.ModBlockTagsProvider;
import net.corior48.spiritual_trio_addons.datagen.ModItemTagsProvider;
import net.corior48.spiritual_trio_addons.datagen.ModModelProvider;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.data.event.GatherDataEvent;

@EventBusSubscriber(modid = SpiritualTrioAddons.MODID)
public class SpiritualTrioAddonsDatagen {
    @SubscribeEvent
    public static void gatherClientData(GatherDataEvent.Client event) {
        DataGenerator generator = event.getGenerator();
        PackOutput packOutput = generator.getPackOutput();
        var lookupProvider = event.getLookupProvider();

        generator.addProvider(true, new ModModelProvider(packOutput));
        generator.addProvider(true, new ModItemTagsProvider(packOutput, lookupProvider));
        generator.addProvider(true, new ModBlockTagsProvider(packOutput, lookupProvider));
    }
}
