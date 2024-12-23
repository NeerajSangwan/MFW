package org.ncu.mfw.EcommmerceApp_Spring_jdbc.DaoLayer;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.ncu.mfw.EcommmerceApp_Spring_jdbc.Entity.Product;
import org.springframework.jdbc.core.RowMapper;

public class ProductDaoRowMapper implements RowMapper<Product> {

	@Override
	public Product mapRow(ResultSet rs, int rowNum) throws SQLException {
		Product p=new Product();
		p.setPrid(rs.getInt(1));
		p.setPrname(rs.getString(2));
		p.setPrtype(rs.getString(3));
		p.setPrprice(rs.getInt(4));
		return p;
	}

}
