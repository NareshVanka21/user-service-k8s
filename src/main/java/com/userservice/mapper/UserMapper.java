//package com.userservice.mapper;
//
//import com.userservice.model.UserDetails;
//
//public class UserMapper {
//
//    public static com.userservice.DTO.UserDetails toEntity(UserDetails dto) {
//        com.userservice.DTO.UserDetails entity = new com.userservice.DTO.UserDetails();
//        entity.setUserid(dto.getId());
//        entity.setUsername(dto.getName());
//        entity.setUserdesc(dto.getDesc());
//        return entity;
//    }
//
//    public static UserDetails toDto(com.userservice.DTO.UserDetails entity) {
//        UserDetails dto = new UserDetails();
//        dto.setId(entity.getUserid());
//        dto.setName(entity.getUsername());
//        dto.setDesc(entity.getUserdesc());
//        return dto;
//    }
//}
