package queueTest;

import java.util.UUID;

public class orderOper {
	private String id;
	private oper op;
	private order ord;
	
	public orderOper() {
		super();
		if (this.id == null) {
			genId();
			}
	}
	private void genId() {
		this.id = UUID.randomUUID().toString();
	}	
	public oper getOper() {
		return op;
	}
	public void setOper(oper op) {
		this.op = op;
	}
	public order getOrder() {
		return ord;
	}
	public void setOrder(order ord) {
		this.ord = ord;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}

}
