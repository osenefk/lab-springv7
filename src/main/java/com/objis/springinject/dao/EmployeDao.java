package com.objis.springinject.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.objis.springinject.domaine.Employe;

public interface EmployeDao extends JpaRepository<Employe, Integer> {

}
