package com.HospitalManagment.HospitalManagment.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.HospitalManagment.HospitalManagment.enities.Patient;


public interface HospitalManagementDao extends JpaRepository<Patient, Long>{
//	  this is Data Transfer Object class which is extending the jpa repositry
}
