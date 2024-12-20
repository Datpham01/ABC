package vn.fs.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import vn.fs.entities.Role;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
}
