package com.example.above18.entity;

import javax.persistence.*;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity 
@Table(name="applicants")
@JsonIgnoreProperties(value = {"eligibility"}, allowGetters = true)
public class Applicant {
  @Id
  private Integer id;
   
  
  private String name;

  
  private int age;
  private String eligibility;

  private Integer tenant_id;

  public Integer getTenantId(){
    return tenant_id;
  }
  public void setTenantId(Integer tenant_id){
    this.tenant_id=tenant_id;
  }
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getEligibility() {
    return eligibility;
  }

  public void setEligibility(String eligibility) {
    this.eligibility = eligibility;
  }
  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }
}