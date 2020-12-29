package com.api.openforum.web.service;

import com.api.openforum.core.entity.User;
import com.api.openforum.dataaccess.DAO.DefaultUserDAO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {

    private final DefaultUserDAO userDao;


    public List<User> findAll(){
        return userDao.findAll();
    }
}
