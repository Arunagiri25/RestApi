package com.example.mysql.ZooController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.mysql.ZooModel.ZooModel;
import com.example.mysql.ZooRepository.ZooRepo;
import com.example.mysql.ZooService.ZooService;

import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
public class ZooController {
@Autowired

public ZooService ser;

@Tag(name = "Login user",description = "add user")
@PostMapping(value="/adduser1")
public ZooModel AddUser(@RequestBody ZooModel hos)
{
return ser.addUser(hos);
}

@Tag(name = "save user",description = "saving user")
@PostMapping("/save")

public ZooModel savedetails(@RequestBody ZooModel zo)

{
return ser.savedetails(zo);
}

@Tag(name = "fectch ",description = " fetch id")
@GetMapping("/fetch")

public List<ZooModel>getall()

{

return ser.getall();

}

@Tag(name = "delete",description = "delete id")
@DeleteMapping("/delete/{id}")

public String deletebyid(@PathVariable("id")int id)

{

ser.deletebyid(id);

return "the Deletion was successful";

}

@Tag(name = "update",description = "Update id")
@PutMapping("/update")

public ZooModel updatedetails(@RequestBody ZooModel zo)

{

return ser.savedetails(zo);

}

@Tag(name = "sorting",description = "sort user")
  @GetMapping(value="/sortUsers/{field}")

  public List<ZooModel>sortUsers(@PathVariable String field)

  {

  return ser.SortUsers(field);

  }

  //pagination

  // http://localhost:8080/pageStudents/0/1

@Tag(name = "pagination")
  @GetMapping(value="/pagingUsers/{offset}/{pageSize}")
  public List<ZooModel> pagingUsers(@PathVariable int offset,@PathVariable int pageSize)

  {

  return ser.pagingUsers(offset, pageSize);

  }
 
 
  //http://localhost:8080?fetchhStudentsByNamePrefix?prefix=a

@Tag(name = "pagingandsorting")
  @GetMapping(value="/pagingAndSorting/{offset}/{pagesize}/{field}")
  public List<ZooModel> PagingAndSorting(@PathVariable int offset, @PathVariable int pagesize, @PathVariable String field)
  {
  return ser.PagingAndSorting(offset, pagesize, field);
  }
public List<ZooModel> getData(String name ) {
	return ser.getData(name);
}


@Autowired
public ZooRepo zr;
@GetMapping("/byFood/{id}")
public List<ZooModel> getName(@PathVariable("id")int aid)
{
	return zr.afood(aid);
}

}