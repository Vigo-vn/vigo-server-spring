package uet.vnu.vigo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import uet.vnu.vigo.models.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}