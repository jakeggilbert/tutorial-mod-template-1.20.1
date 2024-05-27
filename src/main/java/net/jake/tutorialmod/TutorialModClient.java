package net.jake.tutorialmod;
import net.fabricmc.api.ClientModInitializer;

import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.EntityModelLayerRegistry;
import net.jake.tutorialmod.entity.ModEntities;
import net.jake.tutorialmod.entity.client.ModModelLayers;
import net.jake.tutorialmod.entity.client.PenguinEntityRenderer;
import net.jake.tutorialmod.entity.client.PenguinModel;



public class TutorialModClient implements ClientModInitializer {

    @Override
    public void onInitializeClient(){


        EntityRendererRegistry.register(ModEntities.PENGUIN, (context) -> {
            return new PenguinEntityRenderer(context);
        });

        EntityModelLayerRegistry.registerModelLayer(ModModelLayers.PENGUIN, PenguinModel::getTexturedModelData);
    }
}
