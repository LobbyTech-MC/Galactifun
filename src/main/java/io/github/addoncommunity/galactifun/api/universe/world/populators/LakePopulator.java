package io.github.addoncommunity.galactifun.api.universe.world.populators;

import lombok.AllArgsConstructor;
import org.bukkit.Chunk;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.block.Block;
import org.bukkit.generator.BlockPopulator;

import javax.annotation.Nonnull;
import java.util.Random;

/**
 * Lake populator
 *
 * @author Seggan
 * @author Mooy1
 */
@AllArgsConstructor
public class LakePopulator extends BlockPopulator {
    
    private final int maxY;
    private final Material liquid;
    
    @Override
    public void populate(@Nonnull World world, @Nonnull Random random, @Nonnull Chunk chunk) {
        final int startX = chunk.getX() << 4;
        final int startZ = chunk.getZ() << 4;

        for (int x = 0; x < 16; x++) {
            for (int z = 0; z < 16; z++) {
                Block b = world.getHighestBlockAt(startX + x, startZ + z);
                if (b.getY() < this.maxY) {
                    for (int y = this.maxY ; y > b.getY(); y--) {
                        chunk.getBlock(x, y, z).setType(this.liquid, false);
                    }
                }
            }
        }
    }
}
