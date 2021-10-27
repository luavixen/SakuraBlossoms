package dev.foxgirl.sakurablossoms.mixins;

import dev.foxgirl.sakurablossoms.Sakura;
import net.minecraft.client.particle.BlockLeakParticle;
import net.minecraft.client.particle.Particle;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(BlockLeakParticle.FallingSporeBlossomFactory.class)
public abstract class FallingSporeBlossomFactoryMixin {
  @Inject(method = "createParticle", at = @At("RETURN"))
  private void onCreateParticle(CallbackInfoReturnable<Particle> info) {
    Sakura.changeParticleColor(info.getReturnValue());
  }
}
