package com.github.winexp.winexpcarpetaddition.mixin.fancyOakGrownFix;

import com.github.winexp.winexpcarpetaddition.WCASettings;
import com.llamalad7.mixinextras.sugar.Local;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.gen.trunk.LargeOakTrunkPlacer;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyArg;

@Mixin(LargeOakTrunkPlacer.class)
public abstract class LargeOakTrunkPlacerMixin {
    @ModifyArg(method = "generate", at = @At(value = "INVOKE", target = "Lnet/minecraft/util/math/BlockPos;<init>(III)V"), index = 1)
    private int modifyBranchStartY(int u, @Local(ordinal = 6) double t, @Local(ordinal = 5) int m) {
        if (WCASettings.largeOakGenerationFix)
            return t > (double) m ? m : MathHelper.floor(t);
        else return u;
    }
}
