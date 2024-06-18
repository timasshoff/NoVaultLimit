package com.skytendo.novaultlimit.mixin;

import net.minecraft.block.enums.VaultState;
import net.minecraft.block.vault.VaultConfig;
import net.minecraft.block.vault.VaultServerData;
import net.minecraft.block.vault.VaultSharedData;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.BlockPos;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(VaultState.class)
public class VaultStateMixin {

    /**
     * updateActiveState() injection (RETURN)
     *
     * Removes the connected-player-logic.
     * Now the vault will always be either in ACTIVE, EJECTING or UNLOCKING and never in INACTIVE.
     */
    @Inject(method = "updateActiveState(" +
            "Lnet/minecraft/server/world/ServerWorld;" +
            "Lnet/minecraft/util/math/BlockPos;" +
            "Lnet/minecraft/block/vault/VaultConfig;" +
            "Lnet/minecraft/block/vault/VaultServerData;" +
            "Lnet/minecraft/block/vault/VaultSharedData;D)Lnet/minecraft/block/enums/VaultState;", at = @At("RETURN"))
    private static VaultState updateActiveState(ServerWorld world, BlockPos pos, VaultConfig config, VaultServerData serverData, VaultSharedData sharedData, double radius, CallbackInfoReturnable<VaultState> cir) {
        return VaultState.ACTIVE;
    }
}
