package org.ncu.mfw.EcommmerceApp_Spring_jdbc.Entity;

public class Product {
	private String prname;
	private String prtype;
	private int prid;
	private int prprice;
	private boolean selected;
	public String getPrname() {
		return prname;
	}
	public void setPrname(String prname) {
		this.prname = prname;
	}
	public String getPrtype() {
		return prtype;
	}
	public void setPrtype(String prtype) {
		this.prtype = prtype;
	}
	public int getPrid() {
		return prid;
	}
	public void setPrid(int prid) {
		this.prid = prid;
	}
	public int getPrprice() {
		return prprice;
	}
	public void setPrprice(int prprice) {
		this.prprice = prprice;
	}
	
	
	public boolean isSelected() {
		return selected;
	}
	public void setSelected(boolean selected) {
		this.selected = selected;
	}
	@Override
	public String toString() {
		return "Product [prname=" + prname + ", prtype=" + prtype + ", prid=" + prid + ", prprice=" + prprice + ", selected=" + selected + "]";
	}
	public Product(String prname, String prtype, int prid, int prprice,boolean selected) {
		super();
		this.prname = prname;
		this.prtype = prtype;
		this.prid = prid;
		this.prprice = prprice;
		this.selected = selected;
	}
	
	public Product() {
		
	}
}
