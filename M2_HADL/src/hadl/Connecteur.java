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
	}

	public RoleFourni getRolefournis() {
		return rolefournis;
	}

	public void setRolefournis(RoleFourni rolefournis) {
		this.rolefournis = rolefournis;
	}

	public RoleRequis getRolerequis() {
		return rolerequis;
	}

	public void setRolerequis(RoleRequis rolerequis) {
		this.rolerequis = rolerequis;
	}

}
