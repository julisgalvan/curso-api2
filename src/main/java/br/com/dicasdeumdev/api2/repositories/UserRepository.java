package br.com.dicasdeumdev.api2.repositories;

import br.com.dicasdeumdev.api2.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
}
