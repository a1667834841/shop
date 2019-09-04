package com.qingliang.dao;

import com.qingliang.entity.DataDictionary;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DataDictionaryDao {
    /*查询所有字典数据*/
    public List<DataDictionary> findAllData();
    /*插入字典数据*/
    public void addData(DataDictionary dd);
    /*更新字典数据*/
    public void updateData(DataDictionary dd);
    /*删除字典数据*/
    public void delData(Integer id);
}
