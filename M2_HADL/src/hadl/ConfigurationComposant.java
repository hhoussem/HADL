package hadl;

import hadl.attachement.Attachement;
import hadl.binding.Binding;
import hadl.port.PortConfigurationFourni;
import hadl.port.PortConfigurationRequis;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;

public class ConfigurationComposant extends Composant implements IConfiguration{
	
	private List<Composant> composants = new ArrayList<Composant>();
	private List<Connecteur> connecteurs = new ArrayList<Connecteur>();

	private List<Binding> binding = new ArrayList<Binding>();
	private List<Attachement> attachement = new ArrayList<Attachement>();
	
	private PortConfigurationRequis portConfigurationRequis;	
	private PortConfigurationFourni portConfigurationFourni;
	
	public List<Composant> getComposants() {
		return composants;
	}
	public void setComposants(List<Composant> composants) {
		this.composants = composants;
	}
	public List<Connecteur> getConnecteurs() {
		return connecteurs;
	}
	public void setConnecteurs(List<Connecteur> connecteurs) {
		this.connecteurs = connecteurs;
	}
	public List<Attachement> getAttachement() {
		return attachement;
	}
	public void setAttachement(List<Attachement> attachement) {
		this.attachement = attachement;
	}
	public List<Binding> getBinding() {
		return binding;
	}
	public void setBinding(List<Binding> binding) {
		this.binding = binding;
	}
	public PortConfigurationRequis getPortConfigurationRequis() {
		return portConfigurationRequis;
	}
	public void setPortConfigurationRequis(PortConfigurationRequis portConfigurationRequis) {
		this.portConfigurationRequis = portConfigurationRequis;
	}
	public PortConfigurationFourni getPortConfigurationFourni() {
		return portConfigurationFourni;
	}
	public void setPortConfigurationFourni(PortConfigurationFourni portConfigurationFourni) {
		this.portConfigurationFourni = portConfigurationFourni;
	}
	
	@Override
	public void update(Observable o, Object arg) {
	}
}
