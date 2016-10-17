package hadl;

import hadl.port.PortComposantFourni;
import hadl.port.PortComposantRequis;


public class Composant extends ElementArchitectural {
	
	private PortComposantRequis portComposantRequis;
	private PortComposantFourni portComposantFourni;
	
	public PortComposantRequis getPortComposantRequis() {
		return portComposantRequis;
	}
	public void setPortComposantRequis(PortComposantRequis portComposantRequis) {
		this.portComposantRequis = portComposantRequis;
	}
	public PortComposantFourni getPortComposantFourni() {
		return portComposantFourni;
	}
	public void setPortComposantFourni(PortComposantFourni portComposantFourni) {
		this.portComposantFourni = portComposantFourni;
	}
	
}
