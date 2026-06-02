package net.nashe.problematicfantasymod.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.nashe.problematicfantasymod.ProblematicFantasyMod;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item SUNSTONE_DUST = registerItem("sunstone_dust", new Item(new Item.Settings()));
    public static final Item SUNSTONE = registerItem("sunstone", new Item(new Item.Settings()));
    public static final Item BLOODSTONE_NUGGET = registerItem("bloodstone_nugget", new Item(new Item.Settings()));
    public static final Item BLOODSTONE = registerItem("bloodstone", new Item(new Item.Settings()));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(ProblematicFantasyMod.MOD_ID, name), item);
    }

    public static void registerModItems() {
        ProblematicFantasyMod.LOGGER.info("Registering Mod Items for " + ProblematicFantasyMod.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
            entries.add(SUNSTONE_DUST);
            entries.add(SUNSTONE);
            entries.add(BLOODSTONE_NUGGET);
            entries.add(BLOODSTONE);
        });
    }
}
