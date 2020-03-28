package cn.sys.dao;

import cn.sys.entity.Product;
import cn.sys.entity.ProductDes;
import cn.sys.entity.ProductExample;
import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface ProductMapper {
    int countByExample(ProductExample example);

    int deleteByExample(ProductExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Product record);

    int insertSelective(Product record);

    List<Product> selectByExample(ProductExample example);

    Product selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Product record, @Param("example") ProductExample example);

    int updateByExample(@Param("record") Product record, @Param("example") ProductExample example);

    int updateByPrimaryKeySelective(Product record);

    int updateByPrimaryKey(Product record);

    @Delete("DELETE from product_des where pid = #{pid}")
    int deleteProductDesAllByPid(ProductDes productDes);

    @Insert("INSERT INTO product_des(id,pid,img_base,lookIndex,img_format,create_time) " +
            "VALUES(#{id},#{pid},#{img_base},#{lookIndex},#{img_format},#{create_time})")
    int insertProductDes(ProductDes productDes);

    @Select("select id,pid,img_base,img_format,lookIndex from product_des where pid = #{pid} order by lookIndex")
    List<ProductDes> getProductDesByPid(ProductDes productDes);
}