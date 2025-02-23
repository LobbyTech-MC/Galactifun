package io.github.addoncommunity.galactifun.api.universe.types;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import javax.annotation.Nonnull;

import com.google.common.collect.ImmutableSet;

import lombok.NonNull;

/**
 * Star system types
 *
 * @author Mooy1
 */
public final class StarSystemType extends UniversalType {

    private static final Map<String, StarSystemType> allTypes = new HashMap<>();

    public static final StarSystemType NORMAL = new StarSystemType("普通", "NORMAL");
    public static final StarSystemType BINARY = new StarSystemType("双星", "BINARY");

    public StarSystemType(String name, String id) {
        super(id, name);
        allTypes.put(id, this);
    }

    public static StarSystemType getById(@NonNull String id) {
        return allTypes.get(id);
    }

    @Nonnull
    public static Set<StarSystemType> allTypes() {
        return ImmutableSet.copyOf(allTypes.values());
    }

}
