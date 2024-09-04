package com.skytendo.novaultlimit;

import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.gamerule.v1.GameRuleFactory;
import net.fabricmc.fabric.api.gamerule.v1.GameRuleRegistry;
import net.minecraft.world.GameRules;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class NoVaultLimit implements ModInitializer {

    public static final Logger LOGGER = LoggerFactory.getLogger("novaultlimit");
	public static final GameRules.Key<GameRules.BooleanRule> VAULT_HAS_COOLDOWN = GameRuleRegistry.register("vaultHasCooldown", GameRules.Category.MISC, GameRuleFactory.createBooleanRule(false));
	public static final GameRules.Key<GameRules.IntRule> VAULT_COOLDOWN = GameRuleRegistry.register("vaultCooldown", GameRules.Category.MISC, GameRuleFactory.createIntRule(100, 0));

	@Override
	public void onInitialize() {
		LOGGER.info("Initializing NoVaultLimit...");
	}
}