import hadl.Message;
import serveurDetail.ServeurDetails;
import serveurDetail.composant.Database;


public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Main m = new Main();
		m.run();
	}
	
	public void run(){
		ServeurDetails serveurDetails = new ServeurDetails();
	
		Message msg = new Message(serveurDetails.getConnectionManager(),serveurDetails.getSecurityManager(), "test de CMmanager vers SecManager");
		serveurDetails.getConnectionManager().envoyerMessage(msg);
		
		Message msg2 = new Message(serveurDetails.getDatabase(),serveurDetails.getConnectionManager(), "test  de database vers CMmangaer");
		serveurDetails.getDatabase().envoyerMessage(msg2);
		
		Message msg3 = new Message(serveurDetails.getConnectionManager(),serveurDetails.getDatabase(), "test  de CMmangaer vers database");
		serveurDetails.getConnectionManager().envoyerMessage(msg3);
		
	}

}
