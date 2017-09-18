package com.objis.springinject.service;

import java.util.List;

import com.objis.springinject.domaine.Client;

public interface IServiceClient {

	
	public void ajouterClient(Client client);
	
	public Client findClientById(int id);
	
	public void majClient(Client client);
	
	public void deleClient(Client client);
	
	public List<Client> getAllClients();
	
	
	
	
	


}