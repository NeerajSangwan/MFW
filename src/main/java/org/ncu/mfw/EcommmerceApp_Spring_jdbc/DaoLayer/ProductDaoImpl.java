package org.ncu.mfw.EcommmerceApp_Spring_jdbc.DaoLayer;

import java.util.List;

import org.ncu.mfw.EcommmerceApp_Spring_jdbc.Entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class ProductDaoImpl implements ProductDao {
@Autowired	
JdbcTemplate jdbctemp;

@Override
public void AddProduct(Product product) {
	String query ="insert into product values (?,?,?,?)";
	Object [] arr = {product.getPrid(),product.getPrname(),product.getPrtype(),product.getPrprice()};
	jdbctemp.update(query, arr);
}

@Override
public void DeleteProduct(Product product) {
	String query ="delete from product where pid =(?)";
	Object[]arr= {product.getPrid()};
	jdbctemp.update(query, arr);
}

@Override
public List<Product> FetchRecords() {
		String query ="select * from product";
	return jdbctemp.query(query,new ProductDaoRowMapper());
}

}
