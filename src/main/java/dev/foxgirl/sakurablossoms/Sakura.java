package dev.foxgirl.sakurablossoms;

import net.minecraft.client.particle.Particle;

public final class Sakura {
  private Sakura() {}

  public static float red   = 0.94F;
  public static float green = 0.32F;
  public static float blue  = 0.75F;

  public static void changeParticleColor(Particle particle) {
    particle.setColor(red, green, blue);
  }

  public static void init() {}
}
