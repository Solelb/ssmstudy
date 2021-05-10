package com.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import com.entity.Xuanzhe;
public interface XuanzheMapper {
    //添加
    public int insert(Xuanzhe xuanzhe);  
    //删除
    public void delete(int id);  
    //根据id获取数据
    public Xuanzhe get(int id);  
    //修改
    public int update(Xuanzhe xuanzhe);   
     //列表
    public List<Xuanzhe> list(@Param("where") String where);
    //分页
    public List<Xuanzhe> sealist(@Param("where") String where);
    //统计
    public int total(); 
public void updatesql(@Param("value")String value);
   public void deletesql(@Param("value")String value);
	
}