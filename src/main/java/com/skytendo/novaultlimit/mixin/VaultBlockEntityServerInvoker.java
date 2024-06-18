package com.skytendo.novaultlimit.mixin;

import net.minecraft.block.BlockState;
import net.minecraft.block.entity.VaultBlockEntity;
import net.minecraft.block.vault.VaultConfig;
import net.minecraft.block.vault.VaultServerData;
import net.minecraft.block.vault.VaultSharedData;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.math.BlockPos;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Invoker;

import java.util.List;

@Mixin(VaultBlockEntity.Server.class)
public interface VaultBlockEntityServerInvoker {

    /**
     * Invoker for the generateLoot() method
     */
    @Invoker("generateLoot")
    public static List<ItemStack> invokeGenerateLoot(ServerWorld world, VaultConfig config, BlockPos pos, PlayerEntity player) {
        throw new AssertionError();
    }

    /**
     * Invoker for the unlock() method
     */
    @Invoker("unlock")
    public static void invokeUnlock(ServerWorld world, BlockState state, BlockPos pos, VaultConfig config, VaultServerData serverData, VaultSharedData sharedData, List<ItemStack> itemsToEject) {
        throw new AssertionError();
    }

    /**
     * Invoker for the playFailedUnlockSound() method
     */
    @Invoker("playFailedUnlockSound")
    public static void playFailedUnlockSound(ServerWorld world, VaultServerData serverData, BlockPos pos, SoundEvent sound) {
        throw new AssertionError();
    }

    /**
     * Invoker for the isValidKey() method
     */
    @Invoker("isValidKey")
    public static boolean isValidKey(VaultConfig config, ItemStack stack) {
        throw new AssertionError();
    }
}
