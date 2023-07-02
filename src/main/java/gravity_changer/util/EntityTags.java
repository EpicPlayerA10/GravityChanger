package gravity_changer.util;

import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;

public class EntityTags {
    public static final TagKey<EntityType<?>> FORBIDDEN_ENTITIES = TagKey.create(BuiltInRegistries.ENTITY_TYPE.key(), new ResourceLocation("gravitychanger", "forbidden_entities"));
    public static final TagKey<EntityType<?>> FORBIDDEN_ENTITY_RENDERING = TagKey.create(BuiltInRegistries.ENTITY_TYPE.key(), new ResourceLocation("gravitychanger", "forbidden_entity_rendering"));
    
    public static boolean canChangeGravity(Entity entity) {
            return !entity.getType().builtInRegistryHolder().is(FORBIDDEN_ENTITIES);
    }
}
