package net.kreezcraft.mobsunscreen.config;


import me.shedaniel.autoconfig.AutoConfig;
import me.shedaniel.autoconfig.ConfigData;
import me.shedaniel.autoconfig.annotation.Config;
import me.shedaniel.autoconfig.annotation.ConfigEntry;
import me.shedaniel.autoconfig.serializer.GsonConfigSerializer;

import java.util.List;

@Config(name = "mobsunscreen")
public class NFConfig implements ConfigData {

    @ConfigEntry.Gui.Tooltip(count = 2)
    public boolean printIDs = false;

    @ConfigEntry.Gui.Tooltip(count = 2)
    public boolean protectAllMobs = false;

    @ConfigEntry.Gui.Tooltip
    public List<String> mods = List.of("iceandfire");

    @ConfigEntry.Gui.Tooltip
    public List<String> mobs = List.of("minecraft:zombie", "minecraft:drowned", "minecraft:skeleton", "minecraft:stray");

    public static void registerConfig() {
        AutoConfig.register(NFConfig.class, GsonConfigSerializer::new);
    }

    public static NFConfig get() {
        return AutoConfig.getConfigHolder(NFConfig.class).getConfig();
    }
}
