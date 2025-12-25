package com.nstrange.authservice.repository;

import com.nstrange.authservice.entities.UserInfo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<UserInfo, String> {

    UserInfo findByUsername(String username);
}
