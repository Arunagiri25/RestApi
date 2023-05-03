

package com.example.zoo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.Repository;
import org.springframework.stereotype.Service;

import com.animal.zoo.AnimalZooApplication;
import com.example.zoo.Controller.Zooinfo;
import com.example.zoo.Model.AnimalMod;
import com.example.zoo.Repo.AnimalRepo;

@Service
public class AnimalServ {

@Autowired
public AnimalRepo repo;

public Object savedetails(Zooinfo zooinfo) {
// TODO Auto-generated method stub
return repo.save(zooinfo);
}

public List<AnimalMod> getall() {
// TODO Auto-generated method stub
return repo.findAll();
}

public void deletebyid(int byid) {
// TODO Auto-generated method stub
repo.deleteById(byid);


}

public AnimalMod updatedetails( ) {
Example AnimalZooApplication;
// TODO Auto-generated method stub
return repo.count(AnimalZooApplication);
}

public List<AnimalMod> sortDetails(String[] zo) {
// TODO Auto-generated method stub
return repo.findAll(Sort.by(zo).descending());
}

public List<AnimalMod> page(int num, int size) {
// TODO Auto-generated method stub
Page<AnimalMod> p=repo.findAll(PageRequest.of(num, size));
return p.getContent();
}

public List<Zooinfo> sortpage(int num, int size, String name) {
	// TODO Auto-generated method stub
	return null;
}
}