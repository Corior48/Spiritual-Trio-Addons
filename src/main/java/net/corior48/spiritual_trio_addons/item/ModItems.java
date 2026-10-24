package net.corior48.spiritual_trio_addons.item;

import net.corior48.spiritual_trio_addons.SpiritualTrioAddons;
import net.corior48.spiritual_trio_addons.item.guides.MagicHandbookItem;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(SpiritualTrioAddons.MODID);

    // Lockets and other neck related wearables
    public static final DeferredItem KARGIC_PENDANT = ITEMS.registerSimpleItem("kargic_pendant");
    public static final DeferredItem DRAGONIC_LOCKET = ITEMS.registerSimpleItem("dragonic_locket");
    public static final DeferredItem SPA_NECKLACE = ITEMS.registerSimpleItem("spa_necklace");
    public static final DeferredItem HUNTON_LOCKET = ITEMS.registerSimpleItem("hunton_locket");
    public static final DeferredItem MAGIC_MEDAL = ITEMS.registerSimpleItem("magic_medal");
    public static final DeferredItem RA_NECKLACE = ITEMS.registerSimpleItem("ra_necklace");
    public static final DeferredItem ELLIGOT_LOCKET = ITEMS.registerSimpleItem("elligot_locket");

    //Handbook
    public static final DeferredItem MAGIC_HANDBOOK = ITEMS.registerItem("magic_handbook",
            properties -> new MagicHandbookItem(properties));

    //SPA Specific Items
    public static final DeferredItem DIMENSIONSAL_CARD = ITEMS.registerSimpleItem("dimensional_card");
    public static final DeferredItem SPA_SHADES = ITEMS.registerSimpleItem("spa_shades");

    // Weapons and shit
    public static final DeferredItem LYRIC_OG_SWORD = ITEMS.registerItem("lyric_og_sword",
            properties -> new Item(properties.sword(ModToolTiers.LYRIC, 1.5f, -2.4f)));
    public static final DeferredItem LYRIC_SWORD = ITEMS.registerItem("lyric_sword",
            properties -> new Item(properties.sword(ModToolTiers.LYRIC, 3, -2.4f)));
    public static final DeferredItem LYRIC_SHIELD = ITEMS.registerSimpleItem("lyric_shield");
    public static final DeferredItem MATT_SWORD = ITEMS.registerItem("matt_sword",
            properties -> new Item(properties.sword(ModToolTiers.MATT, 3, -2.4f)));
    public static final DeferredItem CHARA_KNIFE = ITEMS.registerItem("chara_knife",
            properties -> new Item(properties.sword(ModToolTiers.CHARA, 2, -1.2f)));
    public static final DeferredItem DARKNESS_CLAWS = ITEMS.registerItem("darkness_claws",
            properties -> new Item(properties.sword(ModToolTiers.DARKNESS, 3, -0f)));

    // Clothing
    public static final DeferredItem LYRIC_WORK_COAT = ITEMS.registerSimpleItem("lyric_work_coat");
    public static final DeferredItem LYRIC_OG_COAT = ITEMS.registerSimpleItem("lyric_og_coat");
    public static final DeferredItem CHARA_WORK_COAT = ITEMS.registerSimpleItem("chara_work_coat");
    public static final DeferredItem TRIO_ORIGINAL_COAT = ITEMS.registerSimpleItem("trio_original_coat");
    public static final DeferredItem MATT_SM_COAT = ITEMS.registerSimpleItem("matt_sm_coat");
    public static final DeferredItem MATT_VEST = ITEMS.registerSimpleItem("matt_vest");

    // Consumable Items
    public static final DeferredItem RABFB = ITEMS.registerSimpleItem("rabfb");


    // Resource Key Method to add custom items to vanilla tags
    public static ResourceKey<Item> getRK(Item item) {
        return BuiltInRegistries.ITEM.getResourceKey(item).get();
    }



    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
