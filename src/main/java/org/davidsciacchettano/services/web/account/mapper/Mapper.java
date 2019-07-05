package org.davidsciacchettano.services.web.account.mapper;

import java.util.Optional;

public interface Mapper<DTO, ENTITY> {
    default Optional<DTO> tryMapToDto(ENTITY entity) {
        return entity == null ? Optional.empty() : Optional.of(mapToDto(entity));

    }

    default Optional<ENTITY> tryMapToEntity(DTO dto) {
        return dto == null ? Optional.empty() : Optional.of(mapToEntity(dto));
    }

    DTO mapToDto(ENTITY entity);
    ENTITY mapToEntity(DTO dto);

}
