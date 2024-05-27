package net.jake.tutorialmod;

import net.fabricmc.api.ModInitializer;

import net.jake.tutorialmod.block.ModBlocks;
import net.jake.tutorialmod.entity.ModEntities;
import net.jake.tutorialmod.item.ModItemGroups;
import net.jake.tutorialmod.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TutorialMod implements ModInitializer {
	public static final String MOD_ID = "tutorialmod";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);


	@Override
	public void onInitialize() {
		ModItemGroups.registerModItemGroups();
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
		ModEntities.registerModEntities();
	}
}