package org.davidsciacchettano.services.web.account.mapper;

public interface Mapper<DTO, ENTITY> {
    default DTO tryMapToDto(ENTITY entity) {
        return mapToDto(entity);
    }

    default ENTITY tryMapToEntity(DTO dto) {
        return mapToEntity(dto);
    }

    DTO mapToDto(ENTITY entity);
    ENTITY mapToEntity(DTO dto);

}
