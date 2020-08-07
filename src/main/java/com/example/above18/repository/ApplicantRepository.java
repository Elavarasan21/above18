package com.example.above18.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.example.above18.entity.Applicant;


public interface ApplicantRepository extends JpaRepository<Applicant, Integer>,JpaSpecificationExecutor<Applicant> {

}