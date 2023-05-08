package Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import Model.UserModel;

public interface UserRepo extends JpaRepository<UserModel,Integer> {

	UserModel findByEmail(String email);

}
