package org.ncu.mfw.EcommmerceApp_Spring_jdbc.DaoLayer;

import java.util.List;

import org.ncu.mfw.EcommmerceApp_Spring_jdbc.Entity.Cart;



public interface CartDao {
	public void insert(Cart product);
	public void DeleteProduct(Cart product);
	public List<Cart> FetchRecords();

	}


