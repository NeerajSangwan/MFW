package org.ncu.mfw.EcommmerceApp_Spring_jdbc.DaoLayer;

import java.util.List;

import org.ncu.mfw.EcommmerceApp_Spring_jdbc.Entity.Product;

public interface ProductDao {
public void AddProduct(Product product);
public void DeleteProduct(Product product);
public List<Product> FetchRecords();

}
