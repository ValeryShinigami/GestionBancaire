package com.mycompany.banque;

import java.util.ArrayList;
import java.util.List;

public class Compte {

	private int id;
	private String numero;
	private double solde;
	//navigation de référence avec client 1-1
	private Client client;	
	//relation plusieurs avec opération: collection (list / ArrayList)	
	private List<Operation> operations = new ArrayList<Operation>();

	
	public Compte() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Compte(int id, String numero, Client client) {
		super();
		this.id = id;
		this.numero = numero;
		this.solde = 0;
		this.client = client;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getNumero() {
		return numero;
	}


	public void setNumero(String numero) {
		this.numero = numero;
	}


	public double getSolde() {
		return solde;
	}


	public void setSolde(double solde) {
		this.solde = solde;
	}


	public Client getClient() {
		return client;
	}


	public void setClient(Client client) {
		this.client = client;
	}


	public List<Operation> getOperations() {
		return operations;
	}


	public void setOperations(List<Operation> operations) {
		this.operations = operations;
	}

	/* Méthode add opération pour la class compte qui possède les opérations
	cela permet d'ajouter un enregistrement à une collection */
	public void addOperation(Operation operation) {
		operations.add(operation);
		if (operation.getType().equals("VERS")) {
			
			solde = solde + operation.getMontant();
			
		}else if (operation.getType().equals("RETR")) {
			
			solde = solde - operation.getMontant();
			
		}
		
	}
	

	
	
	
	
	
}
