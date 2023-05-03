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
import com.example.mysql.ZooService.ZooService;

@RestController
public class ZooController {
@Autowired

public ZooService ser;

@PostMapping(value="/adduser")
public ZooModel AddUser(@RequestBody ZooModel hos)
{
return ser.addUser(hos);
}

@PostMapping("/save")

public ZooModel savedetails(@RequestBody ZooModel zo)

{
return ser.savedetails(zo);
}

@GetMapping("/fetch")

public List<ZooModel>getall()

{

return ser.getall();

}

@DeleteMapping("/delete/{id}")

public String deletebyid(@PathVariable("id")int id)

{

ser.deletebyid(id);

return "the Deletion was successful";

}

@PutMapping("/update")

public ZooModel updatedetails(@RequestBody ZooModel zo)

{

return ser.savedetails(zo);

}

  @GetMapping(value="/sortUsers/{field}")

  public List<ZooModel>sortUsers(@PathVariable String field)

  {

  return ser.SortUsers(field);

  }

  //pagination

  // http://localhost:8080/pageStudents/0/1

  @GetMapping(value="/pagingUsers/{offset}/{pageSize}")
  public List<ZooModel> pagingUsers(@PathVariable int offset,@PathVariable int pageSize)

  {

  return ser.pagingUsers(offset, pageSize);

  }
 
 
  //http://localhost:8080?fetchhStudentsByNamePrefix?prefix=a
   
  @GetMapping(value="/pagingAndSorting/{offset}/{pagesize}/{field}")
  public List<ZooModel> PagingAndSorting(@PathVariable int offset, @PathVariable int pagesize, @PathVariable String field)
  {
  return ser.PagingAndSorting(offset, pagesize, field);
  }

}