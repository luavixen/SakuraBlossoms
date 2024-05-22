package dev.foxgirl.sakurablossoms.mixins;

import dev.foxgirl.sakurablossoms.Sakura;
import net.minecraft.client.particle.Particle;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Pseudo;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Pseudo @Mixin(targets = "net.minecraft.class_663", remap = false)
public abstract class BlockLeakParticleMixin {
  @Inject(method = "method_49332", at = @At("RETURN"), remap = false)
  private static void onCreateFallingSporeBlossom(CallbackInfoReturnable<Particle> info) {
    Sakura.changeParticleColor(info.getReturnValue());
  }
}
