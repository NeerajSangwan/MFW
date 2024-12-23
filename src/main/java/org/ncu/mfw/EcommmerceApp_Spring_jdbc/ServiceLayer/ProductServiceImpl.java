package org.ncu.mfw.EcommmerceApp_Spring_jdbc.ServiceLayer;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.ncu.mfw.EcommmerceApp_Spring_jdbc.DaoLayer.ProductDaoImpl;
import org.ncu.mfw.EcommmerceApp_Spring_jdbc.Entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService {
@Autowired	
ProductDaoImpl prdao;

@Override
public void AddProduct(Product product) {
	prdao.AddProduct(product);	
}

@Override
public void DeleteProduct(Product product) {
	prdao.DeleteProduct(product);	
}


class sortbypricea implements Comparator<Product>{
	public int compare(Product a,Product b) {
		return a.getPrprice()-b.getPrprice();
	}
}
class sortbypriced implements Comparator<Product>{
	public int compare(Product a,Product b) {
		return b.getPrprice()-a.getPrprice();
	}
}

@Override
public List<Product> SortRecordsA() {
	List<Product> book = prdao.FetchRecords();
	Collections.sort(book,new sortbypricea());
	return book;
}

@Override
public List<Product> SortRecordsD() {
	List<Product> book = prdao.FetchRecords();
	Collections.sort(book,new sortbypriced());
	return book;
}

@Override
public List<Product> PrintRecords() {
	return prdao.FetchRecords();
}

}
