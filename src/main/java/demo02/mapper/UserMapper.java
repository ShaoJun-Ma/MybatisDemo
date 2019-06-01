package demo02.mapper;

import demo02.User;

import java.util.List;

public interface UserMapper {
    public List<User> selectOne(Integer id);
}
