package hadl;

import hadl.attachement.Attachement;
import hadl.binding.Binding;
import hadl.port.PortConfiguration;
import hadl.port.PortConfigurationFourni;
import hadl.port.PortConfigurationRequis;

import java.util.List;

public interface IConfiguration {
	
	public List<Composant> getComposants();
	public void setComposants(List<Composant> composants);
	public List<Connecteur> getConnecteurs();
	public void setConnecteurs(List<Connecteur> connecteurs);
	public List<Attachement> getAttachement();
	public void setAttachement(List<Attachement> attachement);
	public List<Binding> getBinding();
	public void setBinding(List<Binding> binding);
	public PortConfigurationRequis getPortConfigurationRequis();
	public void setPortConfigurationRequis(PortConfigurationRequis portConfigurationRequis);
	public PortConfigurationFourni getPortConfigurationFourni();
	public void setPortConfigurationFourni(PortConfigurationFourni portConfigurationFourni);

}
