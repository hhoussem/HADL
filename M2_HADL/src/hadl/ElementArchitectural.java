package hadl;

public class ElementArchitectural {
	
	private String nom;
	
	private IConfiguration configuration;

	public IConfiguration getConfiguration() {
		return configuration;
	}

	public void setConfiguration(IConfiguration configuration) {
		this.configuration = configuration;
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

}
