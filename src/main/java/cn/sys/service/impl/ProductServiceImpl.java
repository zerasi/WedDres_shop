package cn.sys.service.impl;

import java.util.List;

import cn.sys.entity.ProductDes;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;

import cn.sys.dao.ProductMapper;
import cn.sys.dao.CategoryMapper;
import cn.sys.dao.UserMapper;
import cn.sys.entity.Product;
import cn.sys.entity.ProductExample;
import cn.sys.service.ProductService;
import cn.sys.utils.PageResult;

@Service
@Transactional
public class ProductServiceImpl implements ProductService{
	
	@Autowired
	private ProductMapper mapper;
	
	@Autowired
	private CategoryMapper cmapper;

	
	public List<Product> findAll() {
		return mapper.selectByExample(new ProductExample());
	}

	
	public void add(Product Product) {
		mapper.insertSelective(Product);
	}

	
	public void update(Product Product) {
		
		mapper.updateByPrimaryKeySelective(Product);
		
	}

	
	public PageResult findPage(ProductExample example, Integer page, Integer rows) {
		PageHelper.startPage(page,rows);
		Page<Product> pages = (Page<Product>)this.mapper.selectByExample(example);
		List<Product> list =  pages.getResult();
		for (int i = 0; i < list.size(); i++) {
			list.get(i).setCategory(this.cmapper.selectByPrimaryKey(list.get(i).getCid()));
		}
		return new PageResult(pages.getTotal(),list);
	}

	
	public Product findOne(Integer id) {
		Product p = mapper.selectByPrimaryKey(id);
		p.setCategory(this.cmapper.selectByPrimaryKey(p.getCid()));
		return p;
	}

	
	public void delete(int parseInt) {
		mapper.deleteByPrimaryKey(parseInt);
	}

	
	public List<Product> findAll(ProductExample example) {
		List<Product> list = this.mapper.selectByExample(example);
		for (int i = 0; i < list.size(); i++) {
			list.get(i).setCategory(this.cmapper.selectByPrimaryKey(list.get(i).getCid()));
		}
		return list ;
	}

	@Override
	public void editProductDes(ProductDes productDes) {
		this.mapper.insertProductDes(productDes);

	}

	@Override
	public List<ProductDes> getProductDesByPid(ProductDes productDes) {
		return this.mapper.getProductDesByPid(productDes);
	}

	@Override
	public void deleteProductDesAllByPid(ProductDes productDes) {
		this.mapper.deleteProductDesAllByPid(productDes);
	}

}
