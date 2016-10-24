package hadl;

import hadl.attachement.Attachement;
import hadl.binding.Binding;
import hadl.port.PortConfiguration;

import java.util.List;

public interface IConfiguration {
	
	public List<Composant> getComposants();
	public void setComposants(List<Composant> composants);
	public PortConfiguration getPort();
	public void setPort(PortConfiguration port);
	public List<Connecteur> getConnecteurs();
	public void setConnecteurs(List<Connecteur> connecteurs);
	public List<Attachement> getAttachement();
	public void setAttachement(List<Attachement> attachement);
	public List<Binding> getBinding();
	public void setBinding(List<Binding> binding);

}
