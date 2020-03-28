package cn.sys.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;

import cn.sys.dao.CategoryMapper;
import cn.sys.dao.ProductMapper;
import cn.sys.entity.Category;
import cn.sys.entity.CategoryExample;
import cn.sys.entity.Product;
import cn.sys.entity.ProductExample;
import cn.sys.service.CategoryService;
import cn.sys.utils.PageResult;

@Service
@Transactional
public class CategoryServiceImpl implements CategoryService{
	
	@Autowired
	private CategoryMapper CategoryMapper;
	
	@Autowired
	private ProductMapper productMapper;

	
	public List<Category> findAll(CategoryExample example) {
		return CategoryMapper.selectByExample(example);
	}

	
	public void add(Category Category) {
		this.CategoryMapper.insertSelective(Category);
		
	}

	
	public void update(Category Category) {
		this.CategoryMapper.updateByPrimaryKeySelective(Category);
		
	}

	
	public PageResult findPage(CategoryExample example, Integer page, Integer rows) {
		PageHelper.startPage(page,rows);
		List<Category> list = this.CategoryMapper.selectByExample(example);
		Page<Category> pages = (Page<Category>) list;
		return new PageResult(pages.getTotal(), pages.getResult());
	}

	
	public Category findOne(Integer id) {
		return this.CategoryMapper.selectByPrimaryKey(id);
	}

	
	public void delete(int parseInt) {
		this.CategoryMapper.deleteByPrimaryKey(parseInt);
		
	}

	
	public List<Category> findAllfive(CategoryExample categoryExample) {
		List<Category> list = CategoryMapper.selectByExample(categoryExample);
		for(Category category:list){
			ProductExample productExample = new ProductExample();
			ProductExample.Criteria  criteria = productExample.createCriteria();
			productExample.setOrderByClause("id DESC");
			criteria.andCidEqualTo(category.getId());
			PageHelper.startPage(1,5);
			Page<Product> pages = (Page<Product>)this.productMapper.selectByExample(productExample);
			category.setProducts(pages.getResult());
		}
		return list;
	}

}
