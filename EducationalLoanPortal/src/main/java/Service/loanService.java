package Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Model.LoanApplicationModel;
import Repository.LoanApplicationRepo;

@Service

public class loanService

{

@Autowired

LoanApplicationRepo laRep;


public List<LoanApplicationModel> get()

{

List<LoanApplicationModel> l=laRep.findAll();

return l;

}

}