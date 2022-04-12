package Metier;

public class Client {

 public String nom ;
 public int id ;
 public String prenom ;
 
public Client(String nom, int id, String prenom) {
	super();
	this.nom = nom;
	this.id = id;
	this.prenom = prenom;
}

public String getNom() {
	return nom;
}

public void setNom(String nom) {
	this.nom = nom;
}

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getPrenom() {
	return prenom;
}

public void setPrenom(String prenom) {
	this.prenom = prenom;
}
 
 
}
