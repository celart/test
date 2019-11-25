package queueTest;

import java.util.UUID;

public class party {
	
	private part prt;
	private String id;
	private int qty=5;
	
	public party() {
		super();
		if (this.id == null) {
			genId();
			}
	}
	
	public party(part prt) {
		super();
		if (this.id == null) {
			genId();
			}
		this.prt=prt;
	}
	
	public party(part prt, int qty) {
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

}
