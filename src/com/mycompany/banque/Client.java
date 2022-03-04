package com.mycompany.banque;

public class Client {
	
	private int id;
	private String nom;
	private String prenom;
	
	//navigation de référence avec compte 1-1
	private Compte compte;

	public Client() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Client(int id, String nom, String prenom, Compte compte) {
		super();
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.compte = compte;
	}
	
	

	public Client(int id, String nom, String prenom) {
		super();
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public Compte getCompte() {
		return compte;
	}

	public void setCompte(Compte compte) {
		this.compte = compte;
	}

	
	
	

}
