package net.kreezcraft.mobsunscreen.platform;

import net.kreezcraft.mobsunscreen.config.NFConfig;
import net.kreezcraft.mobsunscreen.platform.services.IPlatformHelper;

import java.util.List;

public class NFPlatformHelper implements IPlatformHelper {

    // Get the configuration instance using AutoConfig
    private final NFConfig config = NFConfig.get();

    @Override
    public boolean printIDs() {
        // Access the printIDs field from the config instance
        return config.printIDs;
    }

    @Override
    public boolean protectAllMobs() {
        // Access the protectAllMobs field from the config instance
        return config.protectAllMobs;
    }

    @Override
    public List<String> mobsToProtect() {
        // Access the mobs list from the config instance
        return config.mobs;
    }

    @Override
    public List<String> modsToProtect() {
        // Access the mods list from the config instance
        return config.mods;
    }
}
