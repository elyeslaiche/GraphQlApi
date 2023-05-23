package org.rygn.first_graphql;

public class Player {

	private String id;
    private String Nom;
    private String prenom;

	public Player() {
	}

	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	
	public String getNom() {
		return Nom;
	}
	public void setNom(String nom) {
		this.Nom = nom;
	}
}
