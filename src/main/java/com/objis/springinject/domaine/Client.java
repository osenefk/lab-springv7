package com.objis.springinject.domaine;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Client {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	
	private int id;
	
	@Column(name = "nom")
	
	private String nomClient;
	
	@Column(name = "prenom")
	
	private String prenomClient;

	public int getId() {
		
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNomClient() {
		return nomClient;
	}

	public void setNomClient(String nomClient) {
		this.nomClient = nomClient;
	}

	public String getPrenomClient() {
		return prenomClient;
	}

	public void setPrenomClient(String prenomClient) {
		this.prenomClient = prenomClient;
	}

	public Client() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Client(String nomClient, String prenomClient) {
		super();
		this.nomClient = nomClient;
		this.prenomClient = prenomClient;
	}

	@Override
	public String toString() {
		return "Nom du client =" + nomClient + "\nPrénom du client =" + prenomClient;
	}

}
