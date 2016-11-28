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

public class ClientServeur extends ConfigurationComposant {

	private Serveur serveur;
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

	public Composant getServeur() {
		return serveur;
	}

	public void setServeur(Serveur serveur) {
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
			} else if (o instanceof Serveur) {
				System.out.println("LE MESSAGE EST ARRIVE!!! MERCI!");
			}
		}
	}

}
