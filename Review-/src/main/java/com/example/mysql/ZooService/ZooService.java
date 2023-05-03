package com.example.mysql.ZooService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.mysql.ZooModel.ZooModel;
import com.example.mysql.ZooRepository.ZooRepo;

@Service
public class ZooService {
@Autowired
public ZooRepo repo;

public ZooModel addUser(ZooModel hos)
{
return repo.save(hos);
}

public ZooModel savedetails(ZooModel zo) {
// TODO Auto-generated method stub
return repo.save(zo);
}

public List<ZooModel > getall() {
// TODO Auto-generated method stub
return repo.findAll();
}

public void deletebyid(int byid) {
// TODO Auto-generated method stub
repo.deleteById(byid);


}

public ZooModel  updatedetails(ZooModel  zo) {
// TODO Auto-generated method stub
return repo.save(zo);
}

public List<ZooModel> SortUsers(String field)

{

  return repo.findAll(Sort.by(field));

}

public List<ZooModel> pagingUsers(int offset,int pageSize)

{

  Pageable paging=PageRequest.of(offset,pageSize);

  Page<ZooModel> hosData=repo.findAll(paging);

  List<ZooModel>hosList=hosData.getContent();

  return hosList;

}

public List<ZooModel> PagingAndSorting(int offset,int pagesize,String field)
{
Pageable paging=PageRequest.of(pagesize, pagesize).withSort(Sort.by(field));
Page<ZooModel> stud=repo.findAll(paging);
return stud.getContent();
}
}
