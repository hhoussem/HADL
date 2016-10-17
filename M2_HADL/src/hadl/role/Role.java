package hadl.role;

import hadl.Connecteur;
import hadl.Interface;

public abstract class Role extends Interface {
	private Connecteur connecteur;

	public Connecteur getConnecteur() {
		return connecteur;
	}

	public void setConnecteur(Connecteur connecteur) {
		this.connecteur = connecteur;
	}

}
