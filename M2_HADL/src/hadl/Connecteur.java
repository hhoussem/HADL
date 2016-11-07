package hadl;

import hadl.role.RoleFourni;
import hadl.role.RoleRequis;


public class Connecteur extends ElementArchitectural {
	
	private RoleFourni rolefournis;
	private RoleRequis rolerequis;
	private Glue glue;

	
	public Glue getGlue() {
		return glue;

	}

	public void setGlue(Glue glue) {
		this.glue = glue;
		this.glue.setConnecteur(this);
	}

	public RoleFourni getRolefournis() {
		return rolefournis;
	}

	public void setRolefournis(RoleFourni rolefournis) {
		this.rolefournis = rolefournis;
		this.rolefournis.setConnecteur(this);
	}

	public RoleRequis getRolerequis() {
		return rolerequis;
	}

	public void setRolerequis(RoleRequis rolerequis) {
		this.rolerequis = rolerequis;
		this.rolerequis.setConnecteur(this);
	}

}
