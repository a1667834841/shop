package com.qingliang.test;


import com.qingliang.dao.DataDictionaryDao;
import com.qingliang.entity.DataDictionary;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.List;
import java.util.UUID;

@RunWith(SpringJUnit4ClassRunner.class)//使用的是spring的单元测试
@ContextConfiguration(locations={"classpath:applicationContext.xml"})
public class Demo {

    @Resource
    private DataDictionaryDao am;

    @Test
    public void demo1(){
        List<DataDictionary> allData = am.findAllData();
        System.out.println(allData);
    }

    /*字典插入*/
    @Test
    public void demo2(){
        for (int i=0;i<10;i++){
            DataDictionary dictionary = new DataDictionary();
            dictionary.setTypecode("1");
            dictionary.setTypename("证件类");
            dictionary.setValueid(1);
            dictionary.setValuename(String.valueOf(new UUID(1l,10l)));
            am.addData(dictionary);
        }

    }

    /*字典更新*/
    @Test
    public void demo3(){
        DataDictionary dictionary = new DataDictionary();
        dictionary.setId(1);
        dictionary.setTypecode("1");
        dictionary.setTypename("证件类");
        dictionary.setValueid(1);
        dictionary.setValuename("身份证");
        am.updateData(dictionary);
    }

    /*字典删除*/
    @Test
    public void dem4(){
            am.delData(4);
    }
}
