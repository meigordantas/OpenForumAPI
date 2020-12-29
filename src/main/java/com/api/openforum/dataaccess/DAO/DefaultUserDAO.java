package com.api.openforum.dataaccess.DAO;


import com.api.openforum.core.DAO.UserDAO;
import com.api.openforum.core.entity.User;
import lombok.RequiredArgsConstructor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import java.util.ArrayList;
import java.util.List;

@Repository
@RequiredArgsConstructor
public class DefaultUserDAO implements UserDAO {

    private final EntityManager entityManager;

    @Override
    public List<User> findAll(){
        var query = "SELECT * FROM TB_USER";
        var result = entityManager.createNativeQuery(query, User.class);

        return result.getResultList();
    };
}
