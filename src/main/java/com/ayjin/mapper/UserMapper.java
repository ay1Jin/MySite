package com.ayjin.mapper;

import com.ayjin.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface UserMapper {
    User queryUserByName(String name);
    int addUser(User user);
}
