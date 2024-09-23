package net.kreezcraft.mobsunscreen;

import net.kreezcraft.mobsunscreen.config.NFConfig;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.config.ModConfig;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.bus.api.IEventBus;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Mod(MobSunscreenMod.MOD_ID)
public class MobSunscreenMod {
    public static final String MOD_ID = "mobsunscreen";
    public static final String MOD_NAME = "Mob Sunscreen";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_NAME);

    public MobSunscreenMod(IEventBus modEventBus, ModContainer container) {
        // Register the config using ModContainer
        LOGGER.info("Attempting to register config for Mob Sunscreen Mod.");
        container.registerConfig(
                ModConfig.Type.COMMON,
                NFConfig.spec
        );
        LOGGER.info("Config registration successful.");

        // Register the common setup event
        modEventBus.addListener(this::commonSetup);
    }

    private void commonSetup(final FMLCommonSetupEvent event) {
        LOGGER.info("Mob Sunscreen Mod common setup initialized.");
    }

}
