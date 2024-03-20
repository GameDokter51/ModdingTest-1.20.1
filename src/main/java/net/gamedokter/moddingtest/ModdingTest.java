package net.gamedokter.moddingtest;

import net.fabricmc.api.ModInitializer;

import net.gamedokter.moddingtest.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ModdingTest implements ModInitializer {
	public static final String MOD_ID = "moddingtest";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
	}
}