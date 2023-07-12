package com.rebaderbs.stellarcellarapp.data;

import com.rebaderbs.stellarcellarapp.models.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Integer> {

    User findByUsername(String username);

}
