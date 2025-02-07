package io.github.addoncommunity.galactifun.api.universe.types;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import javax.annotation.Nonnull;

import com.google.common.collect.ImmutableSet;

import lombok.NonNull;

/**
 * Types of galaxies
 *
 * @author Mooy1
 */
public final class GalaxyType extends UniversalType {

    public static final Map<String, GalaxyType> allTypes = new HashMap<>();

    public static final GalaxyType ELLIPTICAL = new GalaxyType("椭圆", "ELLIPTICAL");
    public static final GalaxyType SPIRAL = new GalaxyType("螺旋", "SPIRAL");
    public static final GalaxyType IRREGULAR = new GalaxyType("不规则", "IRREGULAR");

    public GalaxyType(String name, String id) {
        super(id, name);
        allTypes.put(id, this);
    }

    public static GalaxyType getById(@NonNull String id) {
        return allTypes.get(id);
    }

    @Nonnull
    public static Set<GalaxyType> allTypes() {
        return ImmutableSet.copyOf(allTypes.values());
    }

}
