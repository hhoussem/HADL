
	package hadl;

	import hadl.attachement.Attachement;
	import hadl.binding.Binding;
	import hadl.port.PortConfiguration;

	import java.util.List;
	public class ConfigurationConnecteur extends Connecteur implements IConfiguration{
		
		private List<Composant> composants;
		private List<Connecteur> connecteurs;

		private List<Binding> binding;
		private List<Attachement> attachement;
		
		private PortConfiguration port;
		
		public List<Composant> getComposants() {
			return composants;
		}
		public void setComposants(List<Composant> composants) {
			this.composants = composants;
		}
		public PortConfiguration getPort() {
			return port;
		}
		public void setPort(PortConfiguration port) {
			this.port = port;
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
	}

