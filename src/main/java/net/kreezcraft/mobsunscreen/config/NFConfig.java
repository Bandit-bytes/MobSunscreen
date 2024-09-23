package net.kreezcraft.mobsunscreen.config;

import net.neoforged.neoforge.common.ModConfigSpec;

import java.util.List;

public class NFConfig {
    private static final ModConfigSpec.Builder BUILDER = new ModConfigSpec.Builder();
    public static final General GENERAL = new General(BUILDER);

    public static class General {
        public final ModConfigSpec.ConfigValue<Boolean> printIDs;
        public final ModConfigSpec.ConfigValue<Boolean> protectAllMobs;
        public final ModConfigSpec.ConfigValue<List<? extends String>> mods;
        public final ModConfigSpec.ConfigValue<List<? extends String>> mobs;

        public General(ModConfigSpec.Builder builder) {
            builder.push("General");

            printIDs = builder
                    .comment("Print all found mob IDS to the console, will cause spam")
                    .define("printIDs", false);

            protectAllMobs = builder
                    .comment("Protects all mobs from fire")
                    .define("protectAllMobs", false);

            mods = builder
                    .comment("Protects these mods from fire (any mobs with these namespaces)")
                    .defineListAllowEmpty(List.of("mods"), () -> List.of("iceandfire"), o -> (o instanceof String));

            mobs = builder
                    .comment("Protects these mobs from fire (any mobs with these ids (namespace:name))")
                    .defineListAllowEmpty(List.of("mobs"), () -> List.of("minecraft:zombie", "minecraft:drowned", "minecraft:skeleton", "minecraft:stray"), o -> (o instanceof String));

            builder.pop();
        }
    }

    public static final ModConfigSpec spec = BUILDER.build();
}
