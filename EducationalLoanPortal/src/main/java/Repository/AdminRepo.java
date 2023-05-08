 package Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import Model.AdminModel;

public interface AdminRepo extends JpaRepository<AdminModel,Integer> {

}
