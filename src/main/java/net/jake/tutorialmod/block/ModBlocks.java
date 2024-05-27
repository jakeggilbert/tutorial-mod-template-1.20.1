package net.jake.tutorialmod.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.jake.tutorialmod.TutorialMod;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

public class ModBlocks {
    public static final Block RUBY_BLOCK = registerModBlock("ruby_block",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).sounds(BlockSoundGroup.AMETHYST_BLOCK)));

    public static final Block RUBY_ORE = registerModBlock("ruby_ore",
            new Block(FabricBlockSettings.copyOf(Blocks.DIAMOND_ORE)));

    private static Block registerModBlock(String name, Block block){
        registerModBlockItem(name,block);
        return Registry.register(Registries.BLOCK, new Identifier(TutorialMod.MOD_ID, name), block);
    }
    private static Item registerModBlockItem(String name, Block block){
return Registry.register(Registries.ITEM, new Identifier(TutorialMod.MOD_ID, name),
        new BlockItem(block, new FabricItemSettings()));
    }
    public static void registerModBlocks(){
        TutorialMod.LOGGER.info("Registering mod blocks for "+TutorialMod.MOD_ID);
    }
}
