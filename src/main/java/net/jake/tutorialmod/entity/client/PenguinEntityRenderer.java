package net.jake.tutorialmod.entity.client;

import net.jake.tutorialmod.entity.custom.PenguinEntity;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.util.Identifier;

public class PenguinEntityRenderer extends MobEntityRenderer<PenguinEntity, PenguinModel> {

    public PenguinEntityRenderer(EntityRendererFactory.Context context) {
        super(context, new PenguinModel(context.getPart(ModModelLayers.PENGUIN)), 0.5f);
    }

    @Override
    public Identifier getTexture(PenguinEntity entity) {
        return new Identifier("tutorialmod", "textures/entity/penguin/penguin.png");
    }
}