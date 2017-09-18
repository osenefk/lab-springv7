package com.objis.springinject.service;

import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.objis.springinject.dao.IClientDao;
import com.objis.springinject.domaine.Client;
import com.objis.springinject.domaine.Employe;


@Named(value="service")
public class ClientService implements IServiceClient {
	
@Inject
IClientDao dao;
	
	public void setDao(IClientDao dao) {
		this.dao = dao;
	}
	
	public void ajouterClient(Client client) {
		dao.save(client);
		System.out.println("Ajout reussi !");
	}

	public Client findClientById(int id) {
		// TODO Auto-generated method stub
	
		return dao.findOne(id);

	}

	public void majClient(Client client) {
		dao.saveAndFlush(client);
		System.out.println("maj reussie");
		
	}

	public void deleClient(Client client) {
		// TODO Auto-generated method stub
		dao.delete(client);
		System.out.println("suppression reussi !!");
	}

	public List<Client> getAllClients() {
		// TODO Auto-generated method stub
		return dao.findAll();
	}




}
