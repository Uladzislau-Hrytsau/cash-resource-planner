package com.crp.repository;

import com.crp.entity.User;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface UserRepository  extends ReactiveCrudRepository<User, String> {

}
