package net.jake.tutorialmod.entity.client;

import net.jake.tutorialmod.entity.custom.PenguinEntity;
import net.minecraft.client.model.*;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.entity.model.EntityModel;
import net.minecraft.client.util.math.MatrixStack;


// Made with Blockbench 4.10.1
// Exported for Minecraft version 1.17+ for Yarn
// Paste this class into your mod and generate all required imports
public class PenguinModel extends EntityModel<PenguinEntity> {
	private final ModelPart Penguin;
	private final ModelPart head;
	private final ModelPart body;
	public PenguinModel(ModelPart root) {
		this.Penguin = root.getChild("Penguin");
		this.head = Penguin.getChild("Body").getChild("Head");
		this.body = Penguin.getChild("Body");
	}
	public static TexturedModelData getTexturedModelData() {
		ModelData modelData = new ModelData();
		ModelPartData modelPartData = modelData.getRoot();
		ModelPartData Penguin = modelPartData.addChild("Penguin", ModelPartBuilder.create(), ModelTransform.of(0.0F, 24.0F, 0.0F, 0.0F, 3.1416F, 0.0F));

		ModelPartData Body = Penguin.addChild("Body", ModelPartBuilder.create().uv(0, 0).cuboid(-6.0F, -17.0F, 0.0F, 12.0F, 17.0F, 11.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, -6.0F));

		ModelPartData Head = Body.addChild("Head", ModelPartBuilder.create().uv(0, 28).cuboid(-4.0F, -24.0F, -4.0F, 8.0F, 7.0F, 7.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, 6.0F));

		ModelPartData BottomBeak_r1 = Head.addChild("BottomBeak_r1", ModelPartBuilder.create().uv(0, 8).cuboid(-1.0F, -1.0F, -1.0F, 2.0F, 1.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -18.0F, 4.0F, -0.0873F, 0.0F, 0.0F));

		ModelPartData TopBeak_r1 = Head.addChild("TopBeak_r1", ModelPartBuilder.create().uv(23, 28).cuboid(-1.0F, -1.0F, -1.0F, 2.0F, 1.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -19.0F, 4.0F, 0.1309F, 0.0F, 0.0F));

		ModelPartData LeftArm = Body.addChild("LeftArm", ModelPartBuilder.create(), ModelTransform.pivot(-13.0F, 0.0F, 6.0F));

		ModelPartData cube_r1 = LeftArm.addChild("cube_r1", ModelPartBuilder.create().uv(30, 28).cuboid(0.0F, -9.0F, 1.0F, 1.0F, 10.0F, 7.0F, new Dilation(0.0F)), ModelTransform.of(5.0F, -6.0F, -5.0F, 0.0F, 0.0F, 0.1745F));

		ModelPartData RightArm = Body.addChild("RightArm", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 0.0F, 6.0F));

		ModelPartData cube_r2 = RightArm.addChild("cube_r2", ModelPartBuilder.create().uv(39, 38).cuboid(0.0F, -9.0F, 1.0F, 1.0F, 10.0F, 7.0F, new Dilation(0.0F)), ModelTransform.of(7.0F, -6.0F, -5.0F, 0.0F, 0.0F, -0.1745F));

		ModelPartData LeftFoot = Body.addChild("LeftFoot", ModelPartBuilder.create().uv(0, 0).cuboid(-5.0F, -2.0F, 5.0F, 3.0F, 2.0F, 2.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, 6.0F));

		ModelPartData RightFoot = Body.addChild("RightFoot", ModelPartBuilder.create().uv(0, 4).cuboid(2.0F, -2.0F, 5.0F, 3.0F, 2.0F, 2.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, 6.0F));
		return TexturedModelData.of(modelData, 64, 64);
	}
	@Override
	public void render(MatrixStack matrices, VertexConsumer vertexConsumer, int light, int overlay, float red, float green, float blue, float alpha) {
		Penguin.render(matrices, vertexConsumer, light, overlay, red, green, blue, alpha);

	}

	@Override
	public void setAngles(PenguinEntity entity, float limbAngle, float limbDistance, float animationProgress, float headYaw, float headPitch) {

	}
}