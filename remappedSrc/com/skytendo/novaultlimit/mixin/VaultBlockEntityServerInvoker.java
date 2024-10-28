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
     * Invoker for the generateLoot() method of the VaultBlockEntity.Server inner class.
     * Generates the loot inside the vault.
     * @param world The server world in which the vault exists
     * @param config The vault config of the vault that is generating loot
     * @param pos The position of the vault
     * @param player The player trying to open the vault
     * @return The generated loot
     */
    @Invoker("generateLoot")
    static List<ItemStack> invokeGenerateLoot(ServerWorld world, VaultConfig config, BlockPos pos, PlayerEntity player) {
        throw new AssertionError();
    }

    /**
     * Invoker for the unlock() method of the VaultBlockEntity.Server inner class.
     * Unlocks the vault.
     * @param world The server world in which the vault exists
     * @param state The current block state of the vault
     * @param pos The position of the vault
     * @param config The vault config of the vault that is being unlocked
     * @param serverData The server data
     * @param sharedData The shared data
     * @param itemsToEject The list of ItemStacks to be ejected
     */
    @Invoker("unlock")
    static void invokeUnlock(ServerWorld world, BlockState state, BlockPos pos, VaultConfig config, VaultServerData serverData, VaultSharedData sharedData, List<ItemStack> itemsToEject) {
        throw new AssertionError();
    }

    /**
     * Invoker for the playFailedUnlockSound() method of the VaultBlockEntity.Server inner class.
     * Plays the failed-unlock sound.
     * @param world The server world in which the vault exists
     * @param serverData The vault server data of the vault
     * @param pos The position of the vault
     * @param sound The sound event
     */
    @Invoker("playFailedUnlockSound")
    static void playFailedUnlockSound(ServerWorld world, VaultServerData serverData, BlockPos pos, SoundEvent sound) {
        throw new AssertionError();
    }

    /**
     * Invoker for the isValidKey() method of the VaultBlockEntity.Server inner class.
     * Checks if the key is valid and fitting for this type of vault
     * @param config The vault config of the vault
     * @param stack The key ItemStack
     * @return True, if the key is valid and fitting
     */
    @Invoker("isValidKey")
    static boolean isValidKey(VaultConfig config, ItemStack stack) {
        throw new AssertionError();
    }
}
