package net.kreezcraft.mobsunscreen.mixin;


import net.kreezcraft.mobsunscreen.CommonClass;
import net.minecraft.world.entity.LivingEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(LivingEntity.class)
public class EntityLivingMixin {

	@Inject(method = "tick", at = @At("RETURN"))
	private void mobsunscreen_onTick(CallbackInfo ci) {
		LivingEntity entity = (LivingEntity) (Object) this;
		CommonClass.onMobTick(entity);
	}
}
