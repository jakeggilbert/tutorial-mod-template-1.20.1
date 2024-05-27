package net.jake.tutorialmod.entity.client;

import net.jake.tutorialmod.TutorialMod;
import net.minecraft.client.render.entity.model.EntityModelLayer;
import net.minecraft.util.Identifier;

public class ModModelLayers {

    public static final EntityModelLayer PENGUIN = new EntityModelLayer(new Identifier(TutorialMod.MOD_ID, "penguin"),
            "main");
}
