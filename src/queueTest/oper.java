package queueTest;

public class oper {
	private double time;
	private String num;
	private String name;
	private part prt;
	private String shop;
	private String uch;
	private String workCenter;
	private int minQty=1;
	private int maxQty;
	
	public double getTime() {
		return time;
	}
	public void setTime(double time) {
		this.time = time;
	}
	public String getNum() {
		return num;
	}
	public void setNum(String num) {
		this.num = num;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public part getPrt() {
		return prt;
	}
	public void setPrt(part prt) {
		this.prt = prt;
	}
	public String getWorkCenter() {
		return workCenter;
	}
	public void setWorkCenter(String workCenter) {
		this.workCenter = workCenter;
	}
	public String getShop() {
		return shop;
	}
	public void setShop(String shop) {
		this.shop = shop;
	}
	public String getUch() {
		return uch;
	}
	public void setUch(String uch) {
		this.uch = uch;
	}
	public int getMinQty() {
		return minQty;
	}
	public void setMinQty(int minQty) {
		this.minQty = minQty;
	}
	public int getMaxQty() {
		return maxQty;
	}
	public void setMaxQty(int maxQty) {
		this.maxQty = maxQty;
	}

}
