package tech.eikona.jpa.auditing.repository;

import tech.eikona.jpa.auditing.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
