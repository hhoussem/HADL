package clientServeur;

import java.util.Observable;

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
import hadl.Composant;
import hadl.ConfigurationComposant;
import hadl.Message;
import serveurDetail.ServeurDetails;
import serveurDetail.binding.BindingServeur;
import serveurDetail.port.ExternalSocket;

public class ClientServeur extends ConfigurationComposant {

	private ServeurDetails serveur;
	private Client client;
	private RPC rpc;
	private PortClientServeur portCltSrv;
	private BindingClientServeur bindingCltSrv;
	private AttachementClient attachementClt;
	private AttachementServeur attechementSrv;

	private SendRequest sendRequest;
	private PortClientRequis prtCltRequis;
	private ReceiveRequest rcRequest;
	private RPCGlue rpcGlue;
	private RPCCalled rpcCalled;
	private RPCCaller rpcCaller;
	
	private BindingServeur bindingServeur;
	private ExternalSocket externalSocket;

	public ClientServeur()
	{
		super();
		
		this.client = new Client();
		this.setClient(client);
		
		this.sendRequest = new SendRequest();
		this.setSendRequest(sendRequest);
		
		this.attachementClt = new AttachementClient();
		this.setAttachementClt(attachementClt);
		
		this.attechementSrv = new AttachementServeur();
		this.setAttechementSrv(attechementSrv);
		
		this.prtCltRequis = new PortClientRequis();
		this.setPortComposantRequis(prtCltRequis);
		
		
		this.serveur = new ServeurDetails();
		this.setServeur(serveur);
		
		this.rcRequest = new ReceiveRequest();
		this.setRcRequest(rcRequest);
		
		this.rpc = new RPC();
		this.setRpc(rpc);
		
		this.rpcGlue = new RPCGlue();
		this.setRpcGlue(rpcGlue);
		
		this.rpcCalled = new RPCCalled();
		this.setRpcCalled(rpcCalled);
		rpc.setRolefournis(rpcCalled);
		
		this.rpcCaller = new RPCCaller();
		this.setRpcCaller(rpcCaller);
		rpc.setRolerequis(rpcCaller);
		
		this.portCltSrv = new PortClientServeur();
		this.setPortCltSrv(portCltSrv);
		
		this.bindingCltSrv = new BindingClientServeur();
		this.setBindingCltSrv(bindingCltSrv);
		
		this.bindingServeur = new BindingServeur();
		this.setBindingServeur(bindingServeur);
		
		this.externalSocket = new ExternalSocket();
		this.setExternalSocket(externalSocket);
		
		
	}
	
	public Composant getServeur() {
		return serveur;
	}

	public void setServeur(ServeurDetails serveur) {
		this.serveur = serveur;
		this.getElementArchitecturaux().add(serveur);
		serveur.setConfiguration(this);
	}

	public Composant getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
		this.getElementArchitecturaux().add(client);
		client.setConfiguration(this);
	}

	public RPC getRpc() {
		return rpc;
	}

	public void setRpc(RPC rpc) {
		this.rpc = rpc;
		this.getElementArchitecturaux().add(rpc);
		rpc.setConfiguration(this);
	}

	public PortClientServeur getPortCltSrv() {
		return portCltSrv;
	}

	public void setPortCltSrv(PortClientServeur portCltSrv) {
		this.portCltSrv = portCltSrv;
		this.getElementArchitecturaux().add(portCltSrv);
		portCltSrv.setConfiguration(this);
	}

	public BindingClientServeur getBindingCltSrv() {
		return bindingCltSrv;
	}

	public void setBindingCltSrv(BindingClientServeur bindingCltSrv) {
		this.bindingCltSrv = bindingCltSrv;
		this.getElementArchitecturaux().add(bindingCltSrv);
		this.bindingCltSrv.setConfiguration(this);
	}

	public AttachementClient getAttachementClt() {
		return attachementClt;
	}

	public void setAttachementClt(AttachementClient attachementClt) {
		this.attachementClt = attachementClt;
		this.getElementArchitecturaux().add(attachementClt);
		this.attachementClt.setConfiguration(this);
	}

	public AttachementServeur getAttechementSrv() {
		return attechementSrv;
	}

	public void setAttechementSrv(AttachementServeur attechementSrv) {
		this.attechementSrv = attechementSrv;
		this.getElementArchitecturaux().add(attechementSrv);
		this.attechementSrv.setConfiguration(this);
	}

	public SendRequest getSendRequest() {
		return sendRequest;
	}

	public void setSendRequest(SendRequest sendRequest) {
		this.sendRequest = sendRequest;
		this.sendRequest.setConfiguration(this);
	}

	public PortClientRequis getPrtCltRequis() {
		return prtCltRequis;
	}

	public void setPrtCltRequis(PortClientRequis prtCltRequis) {
		this.prtCltRequis = prtCltRequis;
		this.prtCltRequis.setConfiguration(this);
	}

	public ReceiveRequest getRcRequest() {
		return rcRequest;
	}

	public void setRcRequest(ReceiveRequest rcRequest) {
		this.rcRequest = rcRequest;
		this.rcRequest.setConfiguration(this);
	}

	public RPCGlue getRpcGlue() {
		return rpcGlue;
	}

	public void setRpcGlue(RPCGlue rpcGlue) {
		this.rpcGlue = rpcGlue;
		this.rpcGlue.setConfiguration(this);
	}
	
	public RPCCalled getRpcCalled() {
		return rpcCalled;
	}

	public void setRpcCalled(RPCCalled rpcCalled) {
		this.rpcCalled = rpcCalled;
		this.rpcCalled.setConfiguration(this);
	}

	public RPCCaller getRpcCaller() {
		return rpcCaller;
	}

	public void setRpcCaller(RPCCaller rpcCaller) {
		this.rpcCaller = rpcCaller;
		this.rpcCaller.setConfiguration(this);
	}
	
	public ExternalSocket getExternalSocket() {
		return externalSocket;
	}
	
	public void setExternalSocket(ExternalSocket externalSocket) {
		this.externalSocket = externalSocket;
		externalSocket.setConfiguration(this);
	}
	
	public BindingServeur getBindingServeur() {
		return bindingServeur;
	}
	
	public void setBindingServeur(BindingServeur bindingServeur) {
		this.bindingServeur = bindingServeur;
		bindingServeur.setConfiguration(this);
	}

	public void lancerCommunication(String msg) {
		System.out
				.println("************** DEBUT de la communication avec le Message = "
						+ msg + " ****************************");
		this.serveur.ecrireTrace();

	}

	public void update(Observable o, Object arg) {
		if (arg != null) {
			String msg = (String) arg;
			if (o instanceof Client) {
				sendRequest.envoyerMessage(msg);
			} else if (o instanceof SendRequest) {
				attachementClt.envoyerMessage(msg);
			} else if (o instanceof AttachementClient) {
				rpcCaller.envoyerMessage(msg);
			} else if (o instanceof RPCCaller) {
				rpc.envoyerMessage(msg);
			} else if (o instanceof RPC){
				rpcCalled.envoyerMessage(msg);
			}else if (o instanceof RPCCalled) {
				this.attechementSrv.envoyerMessage(msg);
			} else if (o instanceof AttachementServeur) {
				rcRequest.envoyerMessage(msg);
			} else if (o instanceof ReceiveRequest) {
				serveur.envoyerMessage(msg);
			} else if (o instanceof ServeurDetails) {
				System.out.println("LE MESSAGE EST RECU PAR LE SERVEUR! IL VA ETRE PASSE AU CONNECTION MANAGER MAINTENANT!");
				this.bindingServeur.envoyerMessage(msg);	
			} 	else if (o instanceof BindingServeur) {
				this.externalSocket.envoyerMessage(msg);
			} 	else if (o instanceof ExternalSocket) {
				this.serveur.getConnectionManager().envoyerMessage(new Message(this.serveur.getConnectionManager(), this.serveur.getSecurityManager(), msg));
			}
		}
	}

}
