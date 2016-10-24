package hadl;


public class ConfigurationFactory {
	public static IConfiguration getConfiguration(ConfigurationType confType) throws Exception {
		if (confType == ConfigurationType.COMPOSANT) {
			return new ConfigurationComposant();
		} else if (confType == ConfigurationType.CONNECTEUR) {
			return new ConfigurationConnecteur();
		}
		else{
			throw new Exception("Invalid type of Configuration");
		}
			
	}
	
	public enum ConfigurationType {
		CONNECTEUR,
		COMPOSANT
	}

}
