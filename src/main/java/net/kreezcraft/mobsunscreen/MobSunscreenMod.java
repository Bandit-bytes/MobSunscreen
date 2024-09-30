package net.kreezcraft.mobsunscreen;

import net.fabricmc.api.ModInitializer;
import net.kreezcraft.mobsunscreen.config.NFConfig;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MobSunscreenMod implements ModInitializer {
	public static final String MOD_ID = "mobsunscreen";
	public static final String MOD_NAME = "Mob Sunscreen";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_NAME);

	@Override
	public void onInitialize() {
		// Register the configuration
		NFConfig.registerConfig();

		LOGGER.info("{} has been initialized!", MOD_NAME);
	}
}
