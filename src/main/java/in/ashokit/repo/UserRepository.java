package in.ashokit.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import in.ashokit.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
	public User findByEmailAndPwd(String email, String pwd);
}
