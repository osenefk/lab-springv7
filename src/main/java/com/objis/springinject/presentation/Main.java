package com.objis.springinject.presentation;

import java.util.ArrayList;
import java.util.List;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.objis.springinject.domaine.Client;
import com.objis.springinject.service.IServiceClient;

public class Main {


	public static void main(String[] args) {

		Client client1 = new Client("SENE", "Khadim");

		// Etape 1 : Chargement du conteneur

		ApplicationContext appContext = (ApplicationContext) new ClassPathXmlApplicationContext("spring-data.xml");

		// Etape 2 : Recuperation de bean

		IServiceClient service = (IServiceClient) appContext.getBean("service");

		// Etape 3 : Manipulation du bean

		System.out.println("*****************************TEST DE LA METHODE CREATE*****************************");
		
		service.ajouterClient(client1);

		System.out.println("*****************************TEST DE LA METHODE DE RECHERCHE**********************");

		Client clientFinded = new Client();

		clientFinded = service.findClientById(4);

		System.out.println(clientFinded);

		System.out.println("*****************************TEST DE LA METHODE DE UPDATE**********************");

		clientFinded.setNomClient("DIAKHATE");

		service.majClient(clientFinded);

		System.out.println("*****************************TEST DE LA METHODE DE DELETE**********************");

		//service.deleClient(clientFinded);
		
		System.out.println("*****************************TEST DE LA METHODE DE FIND ALL**********************");
		
		List<Client> listeClients= new ArrayList<Client>();
		
		listeClients=service.getAllClients();
		
		for(Client c: listeClients) {
			
			System.out.println(c);
			
			System.out.println("------------------------------------------------------------------------------");
		}

	}
}	
