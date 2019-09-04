package com.qingliang.service.impl;

import com.github.pagehelper.PageHelper;
import com.qingliang.dao.DataDictionaryDao;
import com.qingliang.entity.DataDictionary;
import com.qingliang.service.DataDictionaryService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class DataDictionaryServiceImpl implements DataDictionaryService {

    @Autowired
    private DataDictionaryDao ddDao;

    @Override
    public List<DataDictionary> findAllData() {
        try {
            List<DataDictionary> list = ddDao.findAllData();
            return list;
        } catch (Exception e) {
            return null;
        }

    }

    @Override
    public void addData(DataDictionary dd) {

        try {
            ddDao.addData(dd);

        } catch (Exception e) {
            
        }
    }

    @Override
    public void delData(Integer id) {
        try {
            ddDao.delData(id);
        
        } catch (Exception e) {
         
        }
    }

    @Override
    public void updataData(DataDictionary dd) {
        try {
            ddDao.updateData(dd);
      
        } catch (Exception e) {
         
        }
    }
}
