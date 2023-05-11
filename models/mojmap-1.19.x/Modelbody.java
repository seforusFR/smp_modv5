// Made with Blockbench 4.6.5
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelbody<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "body"), "main");
	private final ModelPart body;
	private final ModelPart arm;
	private final ModelPart arm2;

	public Modelbody(ModelPart root) {
		this.body = root.getChild("body");
		this.arm = root.getChild("arm");
		this.arm2 = root.getChild("arm2");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition body = partdefinition
				.addOrReplaceChild("body",
						CubeListBuilder.create().texOffs(30, 9).addBox(8.0F, -10.0F, -8.0F, 0.0F, 10.0F, 14.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 58.0F, 0.0F, 0.0F, 1.5708F, 0.0F));

		PartDefinition cube_r1 = body.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(30, 9).addBox(8.0F, -10.0F, -8.0F, 0.0F, 10.0F, 14.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.0F, -17.999F, 0.0F, 0.0F, 0.0F, 1.5708F));

		PartDefinition arm = partdefinition.addOrReplaceChild("arm", CubeListBuilder.create().texOffs(58, 21).addBox(
				4.0F, -7.0F, 8.0F, 4.0F, 7.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition arm2 = partdefinition.addOrReplaceChild("arm2", CubeListBuilder.create().texOffs(6, 80).addBox(
				5.0F, -6.0F, -12.0F, 3.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 24.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 256, 256);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		arm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		arm2.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
	}
}