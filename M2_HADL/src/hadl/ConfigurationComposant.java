package hadl;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;

public class ConfigurationComposant extends Composant implements IConfiguration{
	
	private List<ElementArchitectural> elementArchitecturaux = new ArrayList<ElementArchitectural>();
	
	public List<ElementArchitectural> getElementArchitecturaux() {
		return elementArchitecturaux;
	}

	public void setElementArchitecturaux(List<ElementArchitectural> elementArchitecturaux) {
		this.elementArchitecturaux = elementArchitecturaux;
	}
	
	@Override
	public void update(Observable o, Object arg) {
	}

	
}
