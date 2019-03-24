package io.azmain.polls.repository;

import io.azmain.polls.model.Role;
import io.azmain.polls.model.RoleName;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RoleRepository extends JpaRepository<Role, Long> {

    Optional<Role> findByName(RoleName roleName);
}
