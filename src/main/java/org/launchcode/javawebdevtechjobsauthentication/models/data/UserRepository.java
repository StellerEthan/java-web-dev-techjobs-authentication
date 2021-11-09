package org.launchcode.javawebdevtechjobsauthentication.models.data;


import org.launchcode.javawebdevtechjobsauthentication.models.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Integer> {
    //findByUserName, returnUser, input username
    User findByUsername(String username);

}
