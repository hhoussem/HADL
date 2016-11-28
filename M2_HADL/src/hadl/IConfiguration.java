package hadl;

import java.util.List;
import java.util.Observer;

public interface IConfiguration extends Observer {
	
	public List<ElementArchitectural> getElementArchitecturaux();

	public void setElementArchitecturaux(List<ElementArchitectural> elementArchitecturaux);
}
