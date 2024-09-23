package net.kreezcraft.mobsunscreen.platform;


import net.kreezcraft.mobsunscreen.config.NFConfig;
import net.kreezcraft.mobsunscreen.platform.services.IPlatformHelper;

import java.util.List;

public class NFPlatformHelper implements IPlatformHelper {

    @Override
    public boolean printIDs() {
        return NFConfig.GENERAL.printIDs.get();
    }

    @Override
    public boolean protectAllMobs() {
        return NFConfig.GENERAL.protectAllMobs.get();
    }

    @Override
    public List<? extends String> mobsToProtect() {
        return NFConfig.GENERAL.mobs.get();
    }

    @Override
    public List<? extends String> modsToProtect() {
        return NFConfig.GENERAL.mods.get();
    }
}
