import clientServeur.AttachementClient;
import clientServeur.AttachementServeur;
import clientServeur.BindingClientServeur;
import clientServeur.ClientServeur;
import clientServeur.composant.Client;
import clientServeur.composant.Serveur;
import clientServeur.connecteur.RPC;
import clientServeur.connecteur.RPCCalled;
import clientServeur.connecteur.RPCCaller;
import clientServeur.connecteur.RPCGlue;
import clientServeur.port.PortClientRequis;
import clientServeur.port.PortClientServeur;
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
		AttachementClient attachementClt = new AttachementClient();
		
		PortClientRequis prtCltRequis = new PortClientRequis();
		client.setPortComposantRequis(prtCltRequis);
		
		
		Serveur serveur = new Serveur();
		ReceiveRequest rcRequest = new ReceiveRequest();
		
		RPC rpc = new RPC();
		RPCGlue rpcGlue = new RPCGlue();
		rpc.setGlue(rpcGlue);
		RPCCalled rpcCalled = new RPCCalled();
		rpc.setRolefournis(rpcCalled);
		RPCCaller rpcCaller = new RPCCaller();
		rpc.setRolerequis(rpcCaller);
		
		AttachementServeur attachementServeur = new AttachementServeur();
		
		
		ClientServeur clientServeur = new ClientServeur();
		
		/*
		 * Ajout des composants de la configuration ClientServeur
		 */
		clientServeur.setServeur(serveur);		
		clientServeur.setClient(client);	
		clientServeur.setSendRequest(sdRequest);
		clientServeur.setAttachementClt(attachementClt);		
		clientServeur.setRpcCaller(rpcCaller);
		clientServeur.setRpc(rpc);
		clientServeur.setRpcCalled(rpcCalled);
		clientServeur.setAttechementSrv(attachementServeur);
		clientServeur.setRcRequest(rcRequest);
		
		PortClientServeur 	portClientServeur = new PortClientServeur();
		clientServeur.setPortCltSrv(portClientServeur);
		
		BindingClientServeur bindingCltSrv = new BindingClientServeur();
		clientServeur.setBindingCltSrv(bindingCltSrv);
		
		
		client.envoyerMessage("Voici un message pour le serveur");
		
	}

}
