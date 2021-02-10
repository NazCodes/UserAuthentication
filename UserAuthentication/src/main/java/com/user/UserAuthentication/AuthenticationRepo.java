package com.user.UserAuthentication;

import org.springframework.data.repository.CrudRepository;

public interface AuthenticationRepo extends CrudRepository<AuthenticationEntity, Integer> {

}
