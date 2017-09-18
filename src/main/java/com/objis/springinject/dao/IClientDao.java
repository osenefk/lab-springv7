package com.objis.springinject.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.objis.springinject.domaine.Client;
import com.objis.springinject.domaine.Employe;

public interface IClientDao extends JpaRepository<Client, Integer> {
	
	public List<Client> findByNomClient(String nomClient);

}
