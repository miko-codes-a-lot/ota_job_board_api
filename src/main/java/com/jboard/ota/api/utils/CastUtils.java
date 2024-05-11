package com.jboard.ota.api.utils;

import java.util.ArrayList;
import java.util.Collection;

public final class CastUtils {
    public static <T> Collection<T> toCollection(Object object, Class<T> type) {
        if (object instanceof Collection<?>) {
            Collection<T> collection = new ArrayList<>();
            for (Object value : (Collection<?>) object) {
                if (type.isInstance(value)) {
                    collection.add(type.cast(value));
                } else {
                    throw new RuntimeException("Failed to convert " + value + " to " + type);
                }
            }
            return collection;
        }
        throw new RuntimeException("Failed to cast " + object + " to " + type);
    }
}
