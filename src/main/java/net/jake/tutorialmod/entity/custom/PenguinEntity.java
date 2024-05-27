package net.jake.tutorialmod.entity.custom;


import net.jake.tutorialmod.entity.ModEntities;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.ai.goal.*;
import net.minecraft.entity.attribute.DefaultAttributeContainer;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.mob.MobEntity;
import net.minecraft.entity.passive.AnimalEntity;
import net.minecraft.entity.passive.PassiveEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

public class PenguinEntity extends AnimalEntity {
    public PenguinEntity(EntityType<? extends AnimalEntity> entityType, World world) {
        super(entityType, world);
    }

    @Override
    protected void initGoals(){
        this.goalSelector.add(0,new SwimGoal(this));

        this.goalSelector.add(1,new AnimalMateGoal(this, 1.15D));

        this.goalSelector.add(2,new TemptGoal(this, 1.15D, Ingredient.ofItems(Items.COD), false));

        this.goalSelector.add(3,new FollowParentGoal(this, 1.15D));

        this.goalSelector.add(4,new WanderAroundFarGoal(this, .3D));

        this.goalSelector.add(5,new LookAtEntityGoal(this, PlayerEntity.class, 4f));

        this.goalSelector.add(6,new LookAroundGoal(this));
    }
    public static DefaultAttributeContainer.Builder createPenguinAttributes(){
        return MobEntity.createMobAttributes()
                .add(EntityAttributes.GENERIC_MAX_HEALTH,15)
                .add(EntityAttributes.GENERIC_ATTACK_DAMAGE, 2)
                .add(EntityAttributes.GENERIC_KNOCKBACK_RESISTANCE, 1)
                .add(EntityAttributes.GENERIC_MOVEMENT_SPEED, .7f)
                .add(EntityAttributes.GENERIC_ARMOR,.1f);
    }

    @Nullable
    @Override
    public PassiveEntity createChild(ServerWorld world, PassiveEntity entity) {
        return ModEntities.PENGUIN.create(world);
    }
}
