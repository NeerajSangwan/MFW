package org.ncu.mfw.EcommmerceApp_Spring_jdbc.ServiceLayer;

import java.util.List;

import org.ncu.mfw.EcommmerceApp_Spring_jdbc.Entity.Product;

public interface ProductService {
public void AddProduct(Product product);
public void DeleteProduct(Product product);
public List<Product> SortRecordsA();
public List<Product> SortRecordsD();
public List<Product> PrintRecords();
}
