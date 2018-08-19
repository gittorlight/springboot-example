package com.github.torlight.sbex;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.factory.Mappers;

@Mapper
public interface PeopleMapper {
    PeopleMapper INSTANCE = Mappers.getMapper(PeopleMapper.class);

    /**
     * PO转DTO
     *
     * @param entity PO
     * @return DTO
     */
    @Mapping(target = "phoneNumber", source = "callNumber")
    @Mapping(target = "user.name", source = "name")
    @Mapping(target = "user.age", source = "age")
    PeopleDTO entityToDTO(PeopleEntity entity);

    /**
     * DTO转PO
     *
     * @param peopleDTO DTO
     * @param entity    PO
     */
    @Mapping(target = "callNumber", source = "phoneNumber")
    @Mapping(target = "name", source = "user.name")
    @Mapping(target = "age", source = "user.age")
    void updateEntityFromDto(PeopleDTO peopleDTO, @MappingTarget PeopleEntity entity);

}