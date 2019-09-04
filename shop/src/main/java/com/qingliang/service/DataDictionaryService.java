package com.qingliang.service;

import com.qingliang.entity.DataDictionary;
import com.qingliang.util.Msg;

import java.util.List;

public interface DataDictionaryService {

    //查询所有字典数据
    public List<DataDictionary> findAllData();

    //添加字典数据
    public void addData(DataDictionary dd);

    //删除字典数据
    public void delData(Integer id);

    //修改字典数据
    public void updataData(DataDictionary dd);


}
