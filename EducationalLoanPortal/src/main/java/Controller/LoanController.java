package Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Model.LoanApplicationModel;
import Service.loanService;

@RestController

@RequestMapping("/admin")

public class LoanController

{

@Autowired

loanService laSer;


@GetMapping(value="/getAllLoans")

public List<LoanApplicationModel> get()

{

List<LoanApplicationModel> l=laSer.get();

return l;

}


}