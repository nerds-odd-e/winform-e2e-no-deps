package com.odde.atddv2.nodeps.repo;

import com.odde.atddv2.nodeps.entity.User;
import org.springframework.data.repository.Repository;

public interface UserRepo extends Repository<User, Long> {
    User save(User user);

    void deleteAll();
}
