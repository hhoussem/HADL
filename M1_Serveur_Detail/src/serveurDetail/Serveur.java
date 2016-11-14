package serveurDetail;


import serveurDetail.attachement.AttachementCMgrDb;
import serveurDetail.attachement.AttachementCMgrSec;
import serveurDetail.attachement.AttachementDbCM;
import serveurDetail.attachement.AttachementDbSec;
import serveurDetail.attachement.AttachementSecMgrCM;
import serveurDetail.attachement.AttachementSecMgrDb;
import serveurDetail.binding.BindingServeur;
import serveurDetail.port.CQuery;
import serveurDetail.port.DBQuery;
import serveurDetail.port.ExternalSocket;
import serveurDetail.port.QueryInt;
import serveurDetail.port.ReceiveRequest;
import serveurDetail.port.SecurityAuth;
import serveurDetail.port.SecurityCheck;
import serveurDetail.port.SecurityMgmt;
import serveurDetail.role.ClearenceRequestCalled;
import serveurDetail.role.ClearenceRequestCaller;
import serveurDetail.role.SQLRequestCalled;
import serveurDetail.role.SQLRequestCaller;
import serveurDetail.role.SecurityQueryCalled;
import serveurDetail.role.SecurityQueryCaller;
import hadl.Composant;
import hadl.ConfigurationComposant;
import hadl.Connecteur;

public class Serveur extends ConfigurationComposant {

	private Composant database;
	private Composant connectionManager;
	private Composant securityManager;
	private Connecteur clearenceRequest;
	private Connecteur securityQuery;
	private Connecteur sqlRequest;
	private ReceiveRequest receiveRequest;
	
	private ClearenceRequestGlue clearenceRequestGlue;
	private SecurityQueryGlue securityQueryGlue;
	private SQLRequestGlue sqlRequestGlue;
	private AttachementCMgrDb attachementCMgrDb;
	private AttachementCMgrSec attachementCMgrSec;
	private AttachementDbCM attachementDbCM;
	private AttachementDbSec attachementDbSec;
	private AttachementSecMgrCM attachementSecMgrCM;
	private AttachementSecMgrDb attachementSecMgrDb;
	private BindingServeur bindingServeur;
	private CQuery cQuery;
	private DBQuery dbQuery;
	private ExternalSocket externalSocket;
	private QueryInt queryInt;
	private SecurityAuth securityAuth;
	private SecurityCheck securityCheck;
	private SecurityMgmt securityMgmt;
	private ClearenceRequestCalled clearenceRequestCalled;
	private ClearenceRequestCaller clearenceRequestCaller;
	private SecurityQueryCalled securityQueryCalled;
	private SecurityQueryCaller securityQueryCaller;
	private SQLRequestCalled sqlRequestCalled;
	private SQLRequestCaller sqlRequestCaller;
	
	
	public Composant getDatabase() {
		return database;
	}
	public void setDatabase(Composant database) {
		this.database = database;
		this.getComposants().add(database);
		database.setConfiguration(this);
	}
	
	public Composant getConnectionManager() {
		return connectionManager;
	}
	public void setConnectionManager(Composant connectionManager) {
		this.connectionManager = connectionManager;
		this.getComposants().add(connectionManager);
		connectionManager.setConfiguration(this);
	}
	
	public Composant getSecurityManager() {
		return securityManager;
	}
	public void setSecurityManager(Composant securityManager) {
		this.securityManager = securityManager;
		this.getComposants().add(securityManager);
		securityManager.setConfiguration(this);
	}
	
	public Connecteur getClearenceRequest() {
		return clearenceRequest;
	}
	public void setClearenceRequest(Connecteur clearenceRequest) {
		this.clearenceRequest = clearenceRequest;
		this.getConnecteurs().add(clearenceRequest);
		clearenceRequest.setConfiguration(this);

	}
	
	public Connecteur getSecurityQuery() {
		return securityQuery;
	}
	public void setSecurityQuery(Connecteur securityQuery) {
		this.securityQuery = securityQuery;
		this.getConnecteurs().add(securityQuery);
		securityQuery.setConfiguration(this);
	}
	
	public Connecteur getSqlRequest() {
		return sqlRequest;
	}
	public void setSqlRequest(Connecteur sqlRequest) {
		this.sqlRequest = sqlRequest;
		this.getConnecteurs().add(sqlRequest);
		sqlRequest.setConfiguration(this);
	}
	
	public ReceiveRequest getReceiveRequest() {
		return receiveRequest;
	}
	public void setReceiveRequest(ReceiveRequest receiveRequest) {
		this.receiveRequest = receiveRequest;
		this.setPortConfigurationRequis(receiveRequest);
		receiveRequest.setConfiguration(this);
	}
	
	public ClearenceRequestGlue getClearenceRequestGlue() {
		return clearenceRequestGlue;
	}
	public void setClearenceRequestGlue(ClearenceRequestGlue clearenceRequestGlue) {
		this.clearenceRequestGlue = clearenceRequestGlue;
		clearenceRequestGlue.setConfiguration(this);

	}
	
	public SecurityQueryGlue getSecurityQueryGlue() {
		return securityQueryGlue;
	}
	public void setSecurityQueryGlue(SecurityQueryGlue securityQueryGlue) {
		this.securityQueryGlue = securityQueryGlue;
		securityQueryGlue.setConfiguration(this);

	}
	
	public SQLRequestGlue getSqlRequestGlue() {
		return sqlRequestGlue;
	}
	public void setSqlRequestGlue(SQLRequestGlue sqlRequestGlue) {
		this.sqlRequestGlue = sqlRequestGlue;
		sqlRequestGlue.setConfiguration(this);
	}
	
	public AttachementCMgrDb getAttachementCMgrDb() {
		return attachementCMgrDb;
	}
	public void setAttachementCMgrDb(AttachementCMgrDb attachementCMgrDb) {
		this.attachementCMgrDb = attachementCMgrDb;
		attachementCMgrDb.setConfiguration(this);
	}
	
	public AttachementCMgrSec getAttachementCMgrSec() {
		return attachementCMgrSec;
	}
	public void setAttachementCMgrSec(AttachementCMgrSec attachementCMgrSec) {
		this.attachementCMgrSec = attachementCMgrSec;
		attachementCMgrSec.setConfiguration(this);
	}
	
	public AttachementDbCM getAttachementDbCM() {
		return attachementDbCM;
	}
	public void setAttachementDbCM(AttachementDbCM attachementDbCM) {
		this.attachementDbCM = attachementDbCM;
		attachementDbCM.setConfiguration(this);
	}
	
	public AttachementDbSec getAttachementDbSec() {
		return attachementDbSec;
	}
	public void setAttachementDbSec(AttachementDbSec attachementDbSec) {
		this.attachementDbSec = attachementDbSec;
		attachementDbSec.setConfiguration(this);
	}
	
	public AttachementSecMgrCM getAttachementSecMgrCM() {
		return attachementSecMgrCM;
	}
	public void setAttachementSecMgrCM(AttachementSecMgrCM attachementSecMgrCM) {
		this.attachementSecMgrCM = attachementSecMgrCM;
		attachementSecMgrCM.setConfiguration(this);
	}
	
	public AttachementSecMgrDb getAttachementSecMgrDb() {
		return attachementSecMgrDb;
	}
	public void setAttachementSecMgrDb(AttachementSecMgrDb attachementSecMgrDb) {
		this.attachementSecMgrDb = attachementSecMgrDb;
		attachementSecMgrDb.setConfiguration(this);
	}
	
	public CQuery getcQuery() {
		return cQuery;
	}
	public void setcQuery(CQuery cQuery) {
		this.cQuery = cQuery;
		cQuery.setConfiguration(this);
	}
	
	public ExternalSocket getExternalSocket() {
		return externalSocket;
	}
	public void setExternalSocket(ExternalSocket externalSocket) {
		this.externalSocket = externalSocket;
		externalSocket.setConfiguration(this);
	}
	
	public BindingServeur getBindingServeur() {
		return bindingServeur;
	}
	public void setBindingServeur(BindingServeur bindingServeur) {
		this.bindingServeur = bindingServeur;
		bindingServeur.setConfiguration(this);
	}
	
	public DBQuery getDbQuery() {
		return dbQuery;
	}
	public void setDbQuery(DBQuery dbQuery) {
		this.dbQuery = dbQuery;
		dbQuery.setConfiguration(this);
	}
	
	public QueryInt getQueryInt() {
		return queryInt;
	}
	public void setQueryInt(QueryInt queryInt) {
		this.queryInt = queryInt;
		queryInt.setConfiguration(this);
	}
	
	public SecurityAuth getSecurityAuth() {
		return securityAuth;
	}
	public void setSecurityAuth(SecurityAuth securityAuth) {
		this.securityAuth = securityAuth;
		securityAuth.setConfiguration(this);
	}
	
	public SecurityCheck getSecurityCheck() {
		return securityCheck;
	}
	public void setSecurityCheck(SecurityCheck securityCheck) {
		this.securityCheck = securityCheck;
		securityCheck.setConfiguration(this);
	}
	
	public SecurityMgmt getSecurityMgmt() {
		return securityMgmt;
	}
	public void setSecurityMgmt(SecurityMgmt securityMgmt) {
		this.securityMgmt = securityMgmt;
		securityMgmt.setConfiguration(this);
	}
	
	public ClearenceRequestCalled getClearenceRequestCalled() {
		return clearenceRequestCalled;
	}
	public void setClearenceRequestCalled(ClearenceRequestCalled clearenceRequestCalled) {
		this.clearenceRequestCalled = clearenceRequestCalled;
		clearenceRequestCalled.setConfiguration(this);
	}
	
	public ClearenceRequestCaller getClearenceRequestCaller() {
		return clearenceRequestCaller;
	}
	public void setClearenceRequestCaller(ClearenceRequestCaller clearenceRequestCaller) {
		this.clearenceRequestCaller = clearenceRequestCaller;
		clearenceRequestCaller.setConfiguration(this);
	}
	
	public SecurityQueryCalled getSecurityQueryCalled() {
		return securityQueryCalled;
	}
	public void setSecurityQueryCalled(SecurityQueryCalled securityQueryCalled) {
		this.securityQueryCalled = securityQueryCalled;
		securityQueryCalled.setConfiguration(this);
	}
	
	public SecurityQueryCaller getSecurityQueryCaller() {
		return securityQueryCaller;
	}
	public void setSecurityQueryCaller(SecurityQueryCaller securityQueryCaller) {
		this.securityQueryCaller = securityQueryCaller;
		securityQueryCaller.setConfiguration(this);
	}
	
	public SQLRequestCalled getSqlRequestCalled() {
		return sqlRequestCalled;
	}
	public void setSqlRequestCalled(SQLRequestCalled sqlRequestCalled) {
		this.sqlRequestCalled = sqlRequestCalled;
		sqlRequestCalled.setConfiguration(this);
	}
	
	public SQLRequestCaller getSqlRequestCaller() {
		return sqlRequestCaller;
	}
	public void setSqlRequestCaller(SQLRequestCaller sqlRequestCaller) {
		this.sqlRequestCaller = sqlRequestCaller;
		sqlRequestCaller.setConfiguration(this);
	}
	
	
}
