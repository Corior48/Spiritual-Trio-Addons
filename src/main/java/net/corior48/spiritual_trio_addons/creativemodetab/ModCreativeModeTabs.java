package net.corior48.spiritual_trio_addons.creativemodetab;

import net.corior48.spiritual_trio_addons.SpiritualTrioAddons;
import net.corior48.spiritual_trio_addons.item.ModItems;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.ItemLike;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, SpiritualTrioAddons.MODID);

    public static final Supplier<CreativeModeTab> WEARABLES = CREATIVE_MODE_TABS.register("wearables_tab",
            () -> CreativeModeTab.builder()
                    .icon(() -> new ItemStack((ItemLike) ModItems.HUNTON_LOCKET.get()))
                    .title(Component.translatable("creativetab.spiritual_trio_addons.wearables"))
                    .displayItems((itemDisplayParameters, output) ->{
                        output.accept(ModItems.KARGIC_PENDANT);
                        output.accept(ModItems.MAGIC_MEDAL);
                        output.accept(ModItems.DRAGONIC_LOCKET);
                        output.accept(ModItems.HUNTON_LOCKET);
                        output.accept(ModItems.ELLIGOT_LOCKET);
                        output.accept(ModItems.SPA_NECKLACE);
                        output.accept(ModItems.SPA_SHADES);
                        output.accept(ModItems.RA_NECKLACE);
                        output.accept(ModItems.LYRIC_WORK_COAT);
                        output.accept(ModItems.LYRIC_OG_COAT);
                        output.accept(ModItems.CHARA_WORK_COAT);
                        output.accept(ModItems.MATT_SM_COAT);
                        output.accept(ModItems.MATT_VEST);
                        output.accept(ModItems.TRIO_ORIGINAL_COAT);
                    })
                    .build());

    public static final Supplier<CreativeModeTab> WEAPONS = CREATIVE_MODE_TABS.register("weapons_tab",
            () -> CreativeModeTab.builder()
                    .icon(() -> new ItemStack((ItemLike) ModItems.LYRIC_SWORD.get()))
                    .title(Component.translatable("creativetab.spiritual_trio_addons.weapons"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.LYRIC_SWORD);
                        output.accept(ModItems.LYRIC_OG_SWORD);
                        output.accept(ModItems.LYRIC_SHIELD);
                        output.accept(ModItems.MATT_SWORD);
                        output.accept(ModItems.CHARA_KNIFE);
                        output.accept(ModItems.DARKNESS_CLAWS);
                    })
                    .build());

    public static final Supplier<CreativeModeTab> CONSUMABLES = CREATIVE_MODE_TABS.register("consumables_tab",
            () -> CreativeModeTab.builder()
                    .icon(() -> new ItemStack((ItemLike) ModItems.RABFB.get()))
                    .title(Component.translatable("creativetab.spiritual_trio_addons.consumables"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.RABFB);
                    })
                    .build());


    public static final Supplier<CreativeModeTab> MISC = CREATIVE_MODE_TABS.register("misc_tab",
            () -> CreativeModeTab.builder()
                    .icon(() -> new ItemStack((ItemLike) ModItems.MAGIC_HANDBOOK.get()))
                    .title(Component.translatable("creativetab.spiritual_trio_addons.misc"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.MAGIC_HANDBOOK);
                        output.accept(ModItems.DIMENSIONSAL_CARD);
                    })
                    .build());


    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
