package net.kreezcraft.mobsunscreen.platform.services;

import java.util.List;

public interface IPlatformHelper {

    /**
     * Gets the config value for `printIDs`
     *
     * @return config value.
     */
    boolean printIDs();


    /**
     * Gets the config value for `allMobs`
     *
     * @return config value.
     */
    boolean protectAllMobs();


    /**
     * Gets the config value for `mobsToProtect`
     *
     * @return config value.
     */
    List<? extends String> mobsToProtect();


    /**
     * Gets the config value for `modsToProtect`
     *
     * @return config value.
     */
    List<? extends String> modsToProtect();
}
