package Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import Model.LoanApplicationModel;

public interface LoanApplicationRepo extends JpaRepository<LoanApplicationModel,Integer> {

}
