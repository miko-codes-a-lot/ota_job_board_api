package com.jboard.ota.api.mappers;

public interface Mapper<A, B> {
    B toDTO(A entity);
    A toEntity(B dto);
}
