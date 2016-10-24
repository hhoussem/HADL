import clientServeur.ClientServeur;
import clientServeur.composant.Client;
import clientServeur.composant.Serveur;
import clientServeur.connecteur.RPC;
import clientServeur.connecteur.RPCCalled;
import clientServeur.connecteur.RPCCaller;
import clientServeur.connecteur.RPCGlue;
import clientServeur.port.PortClientRequis;
import clientServeur.port.ReceiveRequest;
import clientServeur.port.SendRequest;


public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Main m = new Main();
		m.run();
	}
	
	public void run(){
		
		Client client = new Client();
		SendRequest sdRequest = new SendRequest();
		client.setPortComposantFourni(sdRequest);
		PortClientRequis prtCltRequis = new PortClientRequis();
		client.setPortComposantRequis(prtCltRequis);
		
		
		Serveur serveur = new Serveur();
		ReceiveRequest rcRequest = new ReceiveRequest();
		serveur.setPortComposantRequis(rcRequest);
		
		RPC rpc = new RPC();
		RPCGlue rpcGlue = new RPCGlue();
		rpc.setGlue(rpcGlue);
		RPCCalled rpcCalled = new RPCCalled();
		rpc.setRolefournis(rpcCalled);
		RPCCaller rpcCaller = new RPCCaller();
		rpc.setRolerequis(rpcCaller);
		
		
		ClientServeur clientServeur = new ClientServeur();
		clientServeur.getComposants().add(serveur);
		serveur.setConfiguration(clientServeur);
		
		
		
		
	}

}
