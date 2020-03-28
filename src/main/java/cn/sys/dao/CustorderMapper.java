package cn.sys.dao;

import cn.sys.entity.Custorder;
import cn.sys.entity.CustorderExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CustorderMapper {
    int countByExample(CustorderExample example);

    int deleteByExample(CustorderExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Custorder record);

    int insertSelective(Custorder record);

    List<Custorder> selectByExample(CustorderExample example);

    Custorder selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Custorder record, @Param("example") CustorderExample example);

    int updateByExample(@Param("record") Custorder record, @Param("example") CustorderExample example);

    int updateByPrimaryKeySelective(Custorder record);

    int updateByPrimaryKey(Custorder record);
}