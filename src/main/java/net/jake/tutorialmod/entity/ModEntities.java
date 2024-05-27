package net.jake.tutorialmod.entity;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.jake.tutorialmod.TutorialMod;
import net.jake.tutorialmod.entity.custom.PenguinEntity;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModEntities {

    public static final EntityType<PenguinEntity> PENGUIN = Registry.register(Registries.ENTITY_TYPE,
                new Identifier("tutorialmod","penguin"),
            FabricEntityTypeBuilder.create(SpawnGroup.CREATURE, PenguinEntity::new).dimensions(EntityDimensions.fixed(0.75f, 2f)).build());


    public static void registerModEntities() {
        TutorialMod.LOGGER.info("registering mod entities for "+TutorialMod.MOD_ID);
        FabricDefaultAttributeRegistry.register(PENGUIN, PenguinEntity.createMobAttributes());
    }




}