package slexom.earthtojava.mobs.utils;

import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.MobEntity;
import net.minecraft.entity.monster.MonsterEntity;
import net.minecraft.entity.passive.AnimalEntity;
import net.minecraft.entity.passive.WaterMobEntity;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.biome.Biome;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public final class BiomeSpawnHelper {

    public static final String[] MOOBLOOM_SPAWN_BIOMES = getBiomesListFromBiomes(new String[]{"minecraft:flower_forest"});

    private BiomeSpawnHelper() {
    }

    public static final String[] SNOWY_TUNDRA = new String[]{"minecraft:snowy_tundra", "minecraft:snowy_mountains"};
    public static final String[] ICE_SPIKE = new String[]{"minecraft:ice_spikes"};
    public static final String[] SNOWY_TAIGA = new String[]{"minecraft:snowy_taiga", "minecraft:snowy_taiga_hills", "minecraft:snowy_taiga_mountains"};
    public static final String[] FROZEN_RIVER = new String[]{"minecraft:frozen_river"};
    public static final String[] SNOWY_BEACH = new String[]{"minecraft:snowy_beach"};

    public static final String[] MOUNTAINS = new String[]{"minecraft:mountains", "minecraft:wooded_mountains", "minecraft:mountain_edge"};
    public static final String[] GRAVELLY_MOUNTAINS = new String[]{"minecraft:gravelly_mountains", "minecraft:modified_gravelly_mountains"};
    public static final String[] TAIGA = new String[]{"minecraft:taiga", "minecraft:taiga_hills", "minecraft:taiga_mountains"};
    public static final String[] GIANT_TAIGA = new String[]{"minecraft:giant_tree_taiga", "minecraft:giant_tree_taiga_hills", "minecraft:giant_spruce_taiga", "minecraft:giant_spruce_taiga_hills"};

    public static final String[] PLAINS = new String[]{"minecraft:plains", "minecraft:sunflower_plains"};
    public static final String[] FOREST = new String[]{"minecraft:forest", "minecraft:wooded_hills", "minecraft:flower_forest"};
    public static final String[] BIRCH_FOREST = new String[]{"minecraft:birch_forest", "minecraft:birch_forest_hills", "minecraft:tall_birch_forest", "minecraft:tall_birch_hills"};
    public static final String[] DARK_FOREST = new String[]{"minecraft:dark_forest", "minecraft:dark_forest_hills"};
    public static final String[] SWAMP = new String[]{"minecraft:swamp", "minecraft:swamp_hills"};
    public static final String[] JUNGLE = new String[]{"minecraft:jungle", "minecraft:jungle_hills", "minecraft:modified_jungle", "minecraft:jungle_edge", "minecraft:modified_jungle_edge"};
    public static final String[] BAMBOO_JUNGLE = new String[]{"minecraft:bamboo_jungle", "minecraft:bamboo_jungle_hills"};
    public static final String[] RIVER = new String[]{"minecraft:river"};
    public static final String[] BEACH = new String[]{"minecraft:beach"};
    public static final String[] MUSHROOM_FIELDS = new String[]{"minecraft:mushroom_fields", "minecraft:mushroom_fields"};

    public static final String[] DESERT = new String[]{"minecraft:desert", "minecraft:desert_hills", "minecraft:desert_lakes"};
    public static final String[] SAVANNA = new String[]{"minecraft:savanna", "minecraft:savanna_plateau", "minecraft:shattered_savanna", "minecraft:shattered_savanna_plateau"};
    public static final String[] BADLANDS = new String[]{"minecraft:badlands", "minecraft:badlands_plateau", "minecraft:modified_badlands_plateau", "minecraft:wooded_badlands_plateau", "minecraft:modified_wooded_badlands_plateau", "minecraft:eroded_badlands"};

    public static final String[] OCEAN = new String[]{"minecraft:ocean", "minecraft:deep_ocean", "minecraft:frozen_ocean", "minecraft:deep_frozen_ocean", "minecraft:cold_ocean", "minecraft:deep_cold_ocean", "minecraft:lukewarm_ocean", "minecraft:deep_lukewarm_ocean", "minecraft:warm_ocean", "minecraft:deep_warm_ocean"};

    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    public static final String[] PALE_PIG_SPAWN_BIOMES = getBiomesListFromBiomes(SNOWY_TUNDRA, SNOWY_TAIGA);
    public static final String[] MELON_GOLEM_SPAWN_BIOMES = getBiomesListFromBiomes(SNOWY_TAIGA, SNOWY_TUNDRA, SNOWY_BEACH, ICE_SPIKE);
    public static final String[] ASHEN_COW_SPAWN_BIOMES = getBiomesListFromBiomes(MOUNTAINS, GRAVELLY_MOUNTAINS);
    public static final String[] WOOLY_COW_SPAWN_BIOMES = getBiomesListFromBiomes(TAIGA, SNOWY_TAIGA, GIANT_TAIGA);
    public static final String[] ALBINO_COW_SPAWN_BIOMES = getBiomesListFromBiomes(PLAINS, MOUNTAINS, GRAVELLY_MOUNTAINS);
    public static final String[] FURNACE_GOLEM_SPAWN_BIOMES = getBiomesListFromBiomes(DESERT);
    public static final String[] MUDDY_FOOT_RABBIT_SPAWN_BIOMES = getBiomesListFromBiomes(PLAINS);
    public static final String[] HARELEQUIN_RABBIT_SPAWN_BIOMES = getBiomesListFromBiomes(PLAINS);
    public static final String[] JUMBO_RABBIT_SPAWN_BIOMES = getBiomesListFromBiomes(PLAINS);
    public static final String[] VESTED_RABBIT_SPAWN_BIOMES = getBiomesListFromBiomes(PLAINS);
    public static final String[] STORMY_CHICKEN_SPAWN_BIOMES = getBiomesListFromBiomes(PLAINS, MOUNTAINS, GRAVELLY_MOUNTAINS, TAIGA);
    public static final String[] ROCKY_SHEEP_SPAWN_BIOMES = getBiomesListFromBiomes(PLAINS, MOUNTAINS, GRAVELLY_MOUNTAINS);
    public static final String[] RAINBOW_SHEEP_SPAWN_BIOMES = getBiomesListFromBiomes(PLAINS, FOREST);
    public static final String[] INKY_SHEEP_SPAWN_BIOMES = getBiomesListFromBiomes(PLAINS, MOUNTAINS, GRAVELLY_MOUNTAINS);
    public static final String[] HORNED_SHEEP_SPAWN_BIOMES = getBiomesListFromBiomes(PLAINS, MOUNTAINS, GRAVELLY_MOUNTAINS);
    public static final String[] FLECKED_SHEEP_SPAWN_BIOMES = getBiomesListFromBiomes(PLAINS, MOUNTAINS, TAIGA, GRAVELLY_MOUNTAINS, FOREST);
    public static final String[] SPOTTED_PIG_SPAWN_BIOMES = getBiomesListFromBiomes(SWAMP);
    public static final String[] MIDNIGHT_CHICKEN_SPAWN_BIOMES = getBiomesListFromBiomes(FOREST, DARK_FOREST, JUNGLE, BIRCH_FOREST);
    public static final String[] MUDDY_PIG_SPAWN_BIOMES = getBiomesListFromBiomeTypes(BiomeDictionary.Type.PLAINS, BiomeDictionary.Type.MOUNTAIN, BiomeDictionary.Type.RIVER);
    public static final String[] TROPICAL_SLIME_SPAWN_BIOMES = getBiomesListFromBiomes(BEACH);
    public static final String[] CLUCKSHROOM_SPAWN_BIOMES = getBiomesListFromBiomes(MUSHROOM_FIELDS);
    public static final String[] SUNSET_COW_SPAWN_BIOMES = getBiomesListFromBiomeTypes(BiomeDictionary.Type.SAVANNA);
    public static final String[] PIEBALD_PIG_SPAWN_BIOMES = getBiomesListFromBiomes(FOREST, BIRCH_FOREST, PLAINS, MOUNTAINS, TAIGA, SAVANNA);
    public static final String[] PINK_FOOTED_PIG_SPAWN_BIOMES = getBiomesListFromBiomeTypes(BiomeDictionary.Type.PLAINS, BiomeDictionary.Type.MOUNTAIN);
    public static final String[] AMBER_CHICKEN_SPAWN_BIOMES = getBiomesListFromBiomes(DESERT, SAVANNA);
    public static final String[] BONE_SPIDER_SPAWN_BIOMES = getBiomesListFromBiomes(BADLANDS);
    public static final String[] SKELETON_WOLF_SPAWN_BIOMES = getBiomesListFromBiomes(FOREST, TAIGA, SNOWY_TAIGA, GIANT_TAIGA, BADLANDS);
    public static final String[] GLOW_SQUID_SPAWN_BIOMES = getBiomesListFromBiomes(OCEAN, RIVER, SWAMP);
    public static final String[] JOLLY_LLAMA_SPAWN_BIOMES = getBiomesListFromBiomes(SNOWY_TUNDRA, ICE_SPIKE, SNOWY_TAIGA, FROZEN_RIVER, SNOWY_BEACH);

    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    public static String[] getBiomesList(String[]... identifiers){
        List<String> biomes = new ArrayList<>();
        List<String> types = new ArrayList<>();
        String[] flatted = Stream.of(identifiers).flatMap(Stream::of).toArray(String[]::new);
        for(String identifier: flatted){
            String[] splitted = identifier.split(":");
            if(splitted.length == 2){
                biomes.add(identifier);
            }
            if(splitted.length == 1){
                types.add(identifier);
            }
        }
        return Stream.concat(biomes.stream(), types.stream()).toArray(String[]::new);
    }

    public static String[] getBiomesListFromBiomes(String[]... biomes) {
        return Stream.of(biomes).flatMap(Stream::of).toArray(String[]::new);
    }

    public static String[] getBiomesListFromBiomeTypes(BiomeDictionary.Type... types){
        return Stream.of(types).flatMap(Stream::of).map(BiomeDictionary.Type::getName).toArray(String[]::new) ;
    }

    private static void setSpawnBiomes(EntityType<?> entity, String[] spawnBiomes, int weight, int minGroupCountIn, int maxGroupCountIn, EntityClassification classification) {

        for (String identifier : spawnBiomes) {
            String[] splitted = identifier.split(":");
            if (splitted.length == 2) {
                Biome biome = ForgeRegistries.BIOMES.getValue(new ResourceLocation(identifier));
                if(biome != null){
                    biome.getSpawns(classification).add(new Biome.SpawnListEntry(entity, weight, minGroupCountIn, maxGroupCountIn));
                }
            }
            if (splitted.length == 1) {
                Set<Biome> biomes = BiomeDictionary.getBiomes(BiomeDictionary.Type.getType(identifier.toUpperCase()));
                for (Biome biome : biomes) {
                    biome.getSpawns(classification).add(new Biome.SpawnListEntry(entity, weight, minGroupCountIn, maxGroupCountIn));
                }
            }
        }

        for (Biome biome : ForgeRegistries.BIOMES.getValues()) {
            boolean biomeCriteria = Arrays.asList(spawnBiomes).contains(ForgeRegistries.BIOMES.getKey(biome).toString());
            if (!biomeCriteria)
                continue;
            biome.getSpawns(classification).add(new Biome.SpawnListEntry(entity, weight, minGroupCountIn, maxGroupCountIn));
        }
    }

    public static <T extends AnimalEntity> void setCreatureSpawnBiomes(EntityType<T> entity, String[] spawnBiomes, int weight, int minGroupCountIn, int maxGroupCountIn) {
        setSpawnBiomes(entity, spawnBiomes, weight, minGroupCountIn, maxGroupCountIn, EntityClassification.CREATURE);
    }

    public static <T extends WaterMobEntity> void setWaterCreatureSpawnBiomes(EntityType<T> entity, String[] spawnBiomes, int weight, int minGroupCountIn, int maxGroupCountIn) {
        setSpawnBiomes(entity, spawnBiomes, weight, minGroupCountIn, maxGroupCountIn, EntityClassification.WATER_CREATURE);
    }

    public static <T extends MonsterEntity> void setMonsterSpawnBiomes(EntityType<T> entity, String[] spawnBiomes, int weight, int minGroupCountIn, int maxGroupCountIn) {
        setSpawnBiomes(entity, spawnBiomes, weight, minGroupCountIn, maxGroupCountIn, EntityClassification.MONSTER);
    }

    public static <T extends MobEntity> void setMobSpawnBiomes(EntityType<T> entity, String[] spawnBiomes, int weight, int minGroupCountIn, int maxGroupCountIn) {
        setSpawnBiomes(entity, spawnBiomes, weight, minGroupCountIn, maxGroupCountIn, EntityClassification.MISC);
    }

    public static List<String> convertForConfig(String[] ary) {
        return Arrays.stream(ary).collect(Collectors.toList());
    }

}
