package org.ncu.mfw.EcommmerceApp_Spring_jdbc.DaoLayer;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.ncu.mfw.EcommmerceApp_Spring_jdbc.Entity.Cart;
import org.ncu.mfw.EcommmerceApp_Spring_jdbc.Entity.Product;
import org.springframework.jdbc.core.RowMapper;

public class CartRowMapper  implements RowMapper<Cart> {
	
	@Override
	public Cart mapRow(ResultSet rs, int rowNum) throws SQLException {
		Cart p=new Cart();
		p.setPrid(rs.getInt(1));
		p.setPrname(rs.getString(2));
		p.setPrtype(rs.getString(3));
		p.setPrprice(rs.getInt(4));
		return p;
	}


}
