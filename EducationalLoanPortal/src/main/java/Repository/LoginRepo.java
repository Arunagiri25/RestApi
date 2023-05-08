package Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import Model.LoginModel;

public interface LoginRepo extends JpaRepository<LoginModel,Integer> {

}
