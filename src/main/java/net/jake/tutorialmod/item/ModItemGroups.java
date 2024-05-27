package net.jake.tutorialmod.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.jake.tutorialmod.TutorialMod;
import net.jake.tutorialmod.block.ModBlocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

import java.util.function.Supplier;

public class ModItemGroups {
    private static Supplier<ItemStack> rubyIcon = new Supplier<ItemStack>() {
        @Override
        public ItemStack get() {
            return new ItemStack(ModItems.RUBY);
        }
    };
    public static final ItemGroup RUBY_GROUP = Registry.register(Registries.ITEM_GROUP,new Identifier("tutorialmod", "ruby"),
            FabricItemGroup.builder().displayName(Text.translatable("tutorialmod.ruby")).icon(ModItemGroups.rubyIcon).entries((displayContext, entries) -> {
                entries.add(new ItemStack(ModItems.RUBY));
                entries.add(new ItemStack(ModItems.RAW_RUBY));
                entries.add(new ItemStack(ModItems.DRAGON_SCALE));
                entries.add(new ItemStack(ModBlocks.RUBY_BLOCK));
                entries.add(new ItemStack(ModBlocks.RUBY_ORE));
                entries.add(new ItemStack(ModItems.RUBY_HELMET));
                entries.add(new ItemStack(ModItems.RUBY_CHESPLATE));
                entries.add(new ItemStack(ModItems.RUBY_LEGGINGS));
                entries.add(new ItemStack(ModItems.RUBY_BOOTS));
                entries.add(new ItemStack(ModItems.DRAGON_HELMET));
                entries.add(new ItemStack(ModItems.DRAGON_CHESPLATE));
                entries.add(new ItemStack(ModItems.DRAGON_LEGGINGS));
                entries.add(new ItemStack(ModItems.DRAGON_BOOTS));
            }).build());

    public static void registerModItemGroups() {
        TutorialMod.LOGGER.info("registering mod items for "+TutorialMod.MOD_ID);





    }
}
