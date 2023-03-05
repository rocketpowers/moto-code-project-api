package motocodepackages.repository;

import org.springframework.data.repository.CrudRepository;


import motocodepackages.model.Users;

public interface UserRepository extends CrudRepository<Users, Integer> {

}
