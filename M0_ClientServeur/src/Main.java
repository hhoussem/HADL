import clientServeur.ClientServeur;
import serveurDetail.ServeurDetails;


public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Main m = new Main();
		m.run();
	}
	
	public void run(){
		ClientServeur clientServeur = new ClientServeur();
		clientServeur.getClient().envoyerMessage("Voici un message pour le serveur");
		ServeurDetails serveurDetails = new ServeurDetails();
	}

}
