package Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Model.LoanApplicationModel;
import Model.UserModel;
import Repository.LoanApplicationRepo;
import Repository.UserRepo;

@Service

public class UserService

{

@Autowired

UserRepo userRep;


@Autowired

LoanApplicationRepo laRep;


public UserModel saveUser(UserModel l)

{

return userRep.save(l);

}

public String valideteUser(String email,String password)

{

String result=" ";

UserModel l=userRep.findByEmail(email);

if(l==null)

{

result="User not found";

}

else

{

if(l.getPassword().equals(password))

{

result="Login success";

}

else

{

result="Login failed";

}

}

return result;

}

public List<UserModel> get()

{

List<UserModel> um=userRep.findAll();

return um;

}

public LoanApplicationModel getById(int id)

{

LoanApplicationModel gbi=laRep.findById(id).get();

return gbi;


}

}