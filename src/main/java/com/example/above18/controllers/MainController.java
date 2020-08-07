package com.example.above18.controllers;

import com.example.above18.entity.Applicant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RequestBody;
import java.util.Optional;

import com.example.above18.annotation.SearchSpec;
//import com.sipios.springsearch.anotation.SearchSpec;
import org.springframework.data.jpa.domain.Specification;

@Controller 
@RequestMapping(path="/applicant")
public class MainController {
  @Autowired
  private ApplicantRepository applicantRepository;


  @GetMapping("searchUrl")
  public @ResponseBody Iterable<Applicant> retrive(@SearchSpec Specification<Applicant> specs){
      System.out.println("retrive() method called");
	  return applicantRepository.findAll(Specification.where(specs));
  }

//fun yourFunctionNameHere(@SearchSpec specs: Specification<YourModel>): ResponseEntity<List<YourResponse>> {
//    return ResponseEntity(yourRepository.findAll(Specification.where(specs)), HttpStatus.OK)
//}



  
  @PostMapping(path="/insert") 
  public @ResponseBody String addNewUser (@RequestBody Applicant a) {
    a.setEligibility((a.getAge()>=18)?"Eligible":"Not Eligible");
    applicantRepository.save(a);
    return "Saved Successfully";
  }


  @GetMapping(path="/displayAll")
  public @ResponseBody Iterable<Applicant> getAllUsers() {
    return applicantRepository.findAll();
  }



  @GetMapping(path="/displayById/{id}")
  public @ResponseBody Optional<Applicant> getUserById(@PathVariable("id") int id) {
        return applicantRepository.findById(id);
  }



  @PutMapping(path="/updateById") 
  public @ResponseBody Applicant updateUserById (@RequestBody Applicant a) {
    a.setEligibility((a.getAge()>=18)?"Eligible":"Not Eligible");
    applicantRepository.save(a);
    return a;

  }



  @DeleteMapping(path="/deleteById/{id}")
  public @ResponseBody String deleteUserById(@PathVariable("id") int id) {
    applicantRepository.deleteById(id);
    return "Record containing id = "+id+" is deleted successfully.";
  }


  @DeleteMapping(path="/deleteAll")
  public @ResponseBody String deleteAllRecords() {
    applicantRepository.deleteAll();
    return "All Records are deleted successfully.";
  }


}