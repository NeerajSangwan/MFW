package org.ncu.mfw.EcommmerceApp_Spring_jdbc.DaoLayer;

import java.util.List;

import org.ncu.mfw.EcommmerceApp_Spring_jdbc.Entity.Cart;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class CartDaoImpl implements CartDao {
	
	@Autowired	
	JdbcTemplate jdbctemp;

	@Override
	public void insert(Cart product) {
		String query ="insert into product values (?,?,?,?)";
		Object [] arr = {product.getPrid(),product.getPrname(),product.getPrtype(),product.getPrprice()};
		jdbctemp.update(query, arr);
		
	}

	@Override
	public void DeleteProduct(Cart product) {
		String query ="delete from product where pid =(?)";
		Object[]arr= {product.getPrid()};
		jdbctemp.update(query, arr);
	}

	@Override
	public List<Cart> FetchRecords() {
		String query ="select * from kart";
		return jdbctemp.query(query,new  CartRowMapper());
		
	}

}
