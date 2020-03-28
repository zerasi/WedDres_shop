package cn.sys.service;

import java.io.IOException;
import java.util.List;

import cn.sys.entity.Product;
import cn.sys.entity.ProductDes;
import cn.sys.entity.ProductExample;
import cn.sys.utils.PageResult;

public interface ProductService {

	List<Product> findAll();

	void add(Product Product);

	void update(Product Product);

	PageResult findPage(ProductExample example, Integer page, Integer rows);

	Product findOne(Integer id);

	void delete(int parseInt);

	List<Product> findAll(ProductExample example);

    void editProductDes(ProductDes productDes) throws IOException;

    List<ProductDes> getProductDesByPid(ProductDes productDes);

    void deleteProductDesAllByPid(ProductDes productDes);
}
