package hadl;

import java.util.Observable;

public class ElementArchitectural extends Observable {
	
	private String nom;
	
	private IConfiguration configuration;

	public IConfiguration getConfiguration() {
		return configuration;
	}

	public void setConfiguration(IConfiguration configuration) {		
		this.configuration = configuration;		
		this.addObserver(configuration);
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}
	
	public void ecrireTrace(){
		System.out.println("=> Passage à l'element architectural: "+getClass().getName());
	}		
	
	public void envoyerMessage(String msg){
		System.out.println("Le message est maintenant sur ==> "+getClass().getName());
		System.out.println("Le message est  ==> "+msg);
		setChanged();
		notifyObservers(msg);
	}

}
