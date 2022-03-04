package com.mycompany.banque;

import java.util.Date;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Client client = new Client(1, "Stef","Curry");
		//en creeant le compte on connait le client d'où le paramètre client
		Compte compte = new Compte(1, "SC1982", client);
		client.setCompte(compte);
		
		Operation op1 = new Operation(new Date(2022,3,3), "VERS", 2000, compte);
		compte.addOperation(op1);
		
		Operation op2 = new Operation(new Date(2022,3,5), "VERS", 2500, compte);
		compte.addOperation(op2);
		
		//ajout d'opération direct
		compte.addOperation(new Operation(new Date(2022,3,7), "RETR", 500, compte));
		
		compte.addOperation(new Operation(new Date(2022,3,10), "VERS", 1500, compte));
		
			
		System.out.println("Client: "+ client.getNom()+" "+client.getPrenom());
		System.out.println("Compte: "+ compte.getNumero()+"\n");
		
		System.out.println("Opération:");
		
		System.out.println("Date \t\t\t\t Type \t Montant");
		
		for (Operation op : compte.getOperations()) {
			
			System.out.println(op.getDate() +" "+op.getType() +" "+op.getMontant()+" EUR");
			
			
		}
		
		System.out.println("\n\t\t\t Solde: "+compte.getSolde()+" EUR");

	}

}
