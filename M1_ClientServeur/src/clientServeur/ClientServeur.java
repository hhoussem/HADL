package clientServeur;

import clientServeur.connecteur.RPC;
import clientServeur.port.PortClientServeur;
import hadl.Composant;
import hadl.ConfigurationComposant;

public class ClientServeur  extends ConfigurationComposant {

	private Composant serveur;
	private Composant client;
	private RPC rpc;
	private PortClientServeur portCltSrv;
	private BindingClientServeur bindingCltSrv;
	private AttachementClient attachementClt;
	private AttachementServeur attechementSrv;
	public Composant getServeur() {
		return serveur;
	}
	public void setServeur(Composant serveur) {		
		this.serveur = serveur;
		this.getComposants().add(serveur);
		serveur.setConfiguration(this);
	}
	public Composant getClient() {
		return client;
	}
	public void setClient(Composant client) {
		this.client = client;
		this.getComposants().add(client);
		client.setConfiguration(this);
	}
	public RPC getRpc() {
		return rpc;
	}
	public void setRpc(RPC rpc) {
		this.rpc = rpc;
		this.getConnecteurs().add(rpc);
		rpc.setConfiguration(this);
	}
	public PortClientServeur getPortCltSrv() {
		return portCltSrv;
	}
	public void setPortCltSrv(PortClientServeur portCltSrv) {
		this.portCltSrv = portCltSrv;
		this.setPortConfigurationRequis(portCltSrv);
		portCltSrv.setConfiguration(this);
	}
	public BindingClientServeur getBindingCltSrv() {
		return bindingCltSrv;		
	}
	public void setBindingCltSrv(BindingClientServeur bindingCltSrv) {
		this.bindingCltSrv = bindingCltSrv;
		this.getBinding().add(bindingCltSrv);
		bindingCltSrv.setConfiguration(this);
	}
	public AttachementClient getAttachementClt() {
		return attachementClt;
	}
	public void setAttachementClt(AttachementClient attachementClt) {
		this.attachementClt = attachementClt;
		this.getAttachement().add(attachementClt);
		attachementClt.setConfiguration(this);
	}
	public AttachementServeur getAttechementSrv() {
		return attechementSrv;
	}
	public void setAttechementSrv(AttachementServeur attechementSrv) {
		this.attechementSrv = attechementSrv;
		this.getAttachement().add(attechementSrv);
		attechementSrv.setConfiguration(this);
	}
	
	public void lancerCommunication(String msg){
		System.out.println("************** DEBUT de la communication avec le Message = "+msg+" ****************************");		
		this.serveur.ecrireTrace(); 
		
	}
	
}
