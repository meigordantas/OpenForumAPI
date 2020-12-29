package com.api.openforum.core.DAO;

import com.api.openforum.core.entity.User;

import java.util.List;

public interface UserDAO {

    List<User> findAll();

}
