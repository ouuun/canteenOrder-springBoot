package com.fjm.canteenOrder.convert;

import com.fjm.canteenOrder.entity.DO.UserDO;
import com.fjm.canteenOrder.entity.DTO.UserDTO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface UserConvert {
    UserConvert INSTANCE = Mappers.getMapper(UserConvert.class);

    UserDO userDTOToUserDO(UserDTO userDTO);
    UserDTO userDOToUserDTO(UserDO userDO);
}
