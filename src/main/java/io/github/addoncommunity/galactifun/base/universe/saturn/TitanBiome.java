package io.github.addoncommunity.galactifun.base.universe.saturn;

import org.bukkit.block.Biome;

import lombok.Getter;

enum TitanBiome {

    FOREST(Biome.FOREST),
    FROZEN_FOREST(Biome.SNOWY_TAIGA),
    WASTELAND(Biome.DESERT),
    DRY_ICE_FLATS(Biome.ICE_SPIKES),
    CARBON_FOREST(Biome.DARK_FOREST),
    FROZEN_CARBON_FOREST(Biome.BIRCH_FOREST);

    @Getter
    private final Biome biome;

    TitanBiome(Biome biome) {
        this.biome = biome;
    }
}
