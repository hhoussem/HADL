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
	
		Message msg = new Message(serveurDetails.getSecurityManager(),serveurDetails.getConnectionManager(), "test");
		serveurDetails.getConnectionManager().envoyerMessage(msg);

		
	}

}
