package net.kreezcraft.mobsunscreen;

import net.kreezcraft.mobsunscreen.platform.Services;
import net.minecraft.core.BlockPos;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.LivingEntity;

public class CommonClass {

    public static void onMobTick(LivingEntity entity) {
        if (!shouldProtectFromFire(entity)) {
            return; // Exit early if no protection is needed
        }

        // Check for conditions where the mob should be protected from burning
        if (isEntityInSunlight(entity) && entity.isOnFire() && !entity.isInLava()) {
            entity.clearFire();
        }
    }

    /**
     * Determines whether the mob should be protected based on mod and entity configurations.
     */
    private static boolean shouldProtectFromFire(LivingEntity entity) {
        ResourceLocation entityKey = BuiltInRegistries.ENTITY_TYPE.getKey(entity.getType());

        return Services.PLATFORM.protectAllMobs() ||
                Services.PLATFORM.modsToProtect().contains(entityKey.getNamespace()) ||
                Services.PLATFORM.mobsToProtect().contains(entityKey.toString());
    }

    /**
     * Checks whether the entity is in sunlight and can see the sky.
     */
    private static boolean isEntityInSunlight(LivingEntity entity) {
        BlockPos eyePosition = BlockPos.containing(entity.getX(), entity.getEyeY(), entity.getZ());
        return entity.level().isDay() && entity.level().canSeeSky(eyePosition);
    }
}
