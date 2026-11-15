package com.hirowassan.riptide.mixin;

import net.minecraft.world.entity.player.Player;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Pseudo;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

/**
 * Soft compatibility for More Gears' Enderite trident.
 * Applied only when MoreGears is present; skipped otherwise.
 */
@Pseudo
@Mixin(targets = "com.coolerpromc.moregears.item.custom.MGTridentItem")
public class MoreGearsTridentMixin {

    @Redirect(
            method = "releaseUsing",
            at = @At(
                    value = "INVOKE",
                    target = "Lnet/minecraft/world/entity/player/Player;isInWaterOrRain()Z"
            )
    )
    private boolean allowRiptideRelease(Player player) {
        return true;
    }
}
