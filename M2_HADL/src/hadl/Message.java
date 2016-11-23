package hadl;


public class Message {
	
	private Composant sender;
	private Composant receiver;
	private String msg =null;
	
	public Message(Composant sender, Composant receiver, String msg) {
		super();
		this.sender = sender;
		this.receiver = receiver;
		this.msg = msg;
	}
	public Composant getSender() {
		return sender;
	}
	public void setSender(Composant sender) {
		this.sender = sender;
	}
	public Composant getReceiver() {
		return receiver;
	}
	public void setReceiver(Composant receiver) {
		this.receiver = receiver;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}


}
