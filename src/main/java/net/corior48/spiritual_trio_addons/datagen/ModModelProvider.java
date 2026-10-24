package net.corior48.spiritual_trio_addons.datagen;

import net.corior48.spiritual_trio_addons.SpiritualTrioAddons;
import net.corior48.spiritual_trio_addons.item.ModItems;
import net.minecraft.client.data.models.BlockModelGenerators;
import net.minecraft.client.data.models.ItemModelGenerators;
import net.minecraft.client.data.models.ItemModelOutput;
import net.minecraft.client.data.models.ModelProvider;
import net.minecraft.client.data.models.model.*;
import net.minecraft.client.resources.model.sprite.Material;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.Identifier;
import net.minecraft.world.item.Item;

import java.util.function.BiConsumer;

public class ModModelProvider extends ModelProvider {
    public ModModelProvider(PackOutput output) {
        super(output, SpiritualTrioAddons.MODID);
    }



    @Override
    protected void registerModels(BlockModelGenerators blockModels, ItemModelGenerators itemModels) {
        this.itemModels = itemModels;
        // Wearables
        generateFlatItemWithPrefix((Item) ModItems.DRAGONIC_LOCKET.get(), ModelTemplates.FLAT_ITEM, "wearables");
        generateFlatItemWithPrefix((Item) ModItems.ELLIGOT_LOCKET.get(), ModelTemplates.FLAT_ITEM, "wearables");
        generateFlatItemWithPrefix((Item) ModItems.HUNTON_LOCKET.get(), ModelTemplates.FLAT_ITEM, "wearables");
        generateFlatItemWithPrefix((Item) ModItems.KARGIC_PENDANT.get(), ModelTemplates.FLAT_ITEM, "wearables");
        generateFlatItemWithPrefix((Item) ModItems.MAGIC_MEDAL.get(), ModelTemplates.FLAT_ITEM, "wearables");
        generateFlatItemWithPrefix((Item) ModItems.RA_NECKLACE.get(), ModelTemplates.FLAT_ITEM, "wearables");
        generateFlatItemWithPrefix((Item) ModItems.SPA_NECKLACE.get(), ModelTemplates.FLAT_ITEM, "wearables");
        generateFlatItemWithPrefix((Item) ModItems.SPA_SHADES.get(), ModelTemplates.FLAT_ITEM, "wearables");
        generateFlatItemWithPrefix((Item) ModItems.LYRIC_OG_COAT.get(), ModelTemplates.FLAT_ITEM, "wearables");
        generateFlatItemWithPrefix((Item) ModItems.LYRIC_WORK_COAT.get(), ModelTemplates.FLAT_ITEM, "wearables");
        generateFlatItemWithPrefix((Item) ModItems.CHARA_WORK_COAT.get(), ModelTemplates.FLAT_ITEM, "wearables");
        generateFlatItemWithPrefix((Item) ModItems.MATT_SM_COAT.get(), ModelTemplates.FLAT_ITEM, "wearables");
        generateFlatItemWithPrefix((Item) ModItems.MATT_VEST.get(), ModelTemplates.FLAT_ITEM, "wearables");
        generateFlatItemWithPrefix((Item) ModItems.TRIO_ORIGINAL_COAT.get(), ModelTemplates.FLAT_ITEM, "wearables");

        // Weapons
        generateFlatItemWithPrefix((Item) ModItems.CHARA_KNIFE.get(), ModelTemplates.FLAT_HANDHELD_ITEM, "weapons");
        generateFlatItemWithPrefix((Item) ModItems.DARKNESS_CLAWS.get(), ModelTemplates.FLAT_HANDHELD_ITEM, "weapons");
        generateFlatItemWithPrefix((Item) ModItems.LYRIC_OG_SWORD.get(), ModelTemplates.FLAT_HANDHELD_ITEM, "weapons");
        generateFlatItemWithPrefix((Item) ModItems.LYRIC_SWORD.get(), ModelTemplates.FLAT_HANDHELD_ITEM, "weapons");
        generateFlatItemWithPrefix((Item) ModItems.LYRIC_SHIELD.get(), ModelTemplates.FLAT_ITEM, "weapons");
        generateFlatItemWithPrefix((Item) ModItems.MATT_SWORD.get(), ModelTemplates.FLAT_HANDHELD_ITEM, "weapons");

        // Consumables
        generateFlatItemWithPrefix((Item) ModItems.RABFB.get(), ModelTemplates.FLAT_ITEM, "consumables");

        // MISC
        generateFlatItemWithPrefix((Item) ModItems.DIMENSIONSAL_CARD.get(), ModelTemplates.FLAT_ITEM, "misc");
        generateFlatItemWithPrefix((Item) ModItems.MAGIC_HANDBOOK.get(), ModelTemplates.FLAT_ITEM, "misc");
    }

    // Helpers
    private ItemModelGenerators itemModels;

    public void generateFlatItemWithPrefix(Item item, ModelTemplate template, String prefix) {
        itemModels.itemModelOutput.accept(item, ItemModelUtils.plainModel(this.createFlatItemModelWithPrefix(item, template, prefix)));
    }
    public Identifier createFlatItemModelWithPrefix(Item item, ModelTemplate template, String prefix) {
        Identifier id = BuiltInRegistries.ITEM.getKey(item);
        Material itemTexture = new Material(id.withPrefix("item/%s/".formatted(prefix)));
        TextureMapping prefixedTextureMapping = (new TextureMapping()).put(TextureSlot.LAYER0, itemTexture);

        return template.create(ModelLocationUtils.getModelLocation(item), prefixedTextureMapping, itemModels.modelOutput);
    }
}