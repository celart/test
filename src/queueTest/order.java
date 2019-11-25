package queueTest;

import java.util.UUID;

public class order {
	
	private part prt;
	private String id;
	private int qty=5;
	private order parentOrder;
	
	public order() {
		super();
		if (this.id == null) {
			genId();
			}
	}
	
	public order(part prt) {
		super();
		if (this.id == null) {
			genId();
			}
		this.prt=prt;
	}
	
	public order(part prt, int qty) {
		super();
		if (this.id == null) {
			genId();
			}
		this.prt=prt;
		this.qty=qty;
	}

	private void genId() {
		this.id = UUID.randomUUID().toString();
	}
	
	public part getPrt() {
		return prt;
	}

	public void setPrt(part prt) {
		this.prt = prt;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

	public order getParentOrder() {
		return parentOrder;
	}

	public void setParentOrder(order parentOrder) {
		this.parentOrder = parentOrder;
	}

}
