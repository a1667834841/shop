package com.qingliang.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.qingliang.entity.DataDictionary;
import com.qingliang.service.DataDictionaryService;
import com.qingliang.util.Msg;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/data")
@ResponseBody
public class DataDictionaryController {

    @Autowired
    private DataDictionaryService dds;

    //分页查询所有字典数据
    @RequestMapping("/findAllData")
    public Msg findAllData(@RequestParam(value = "pn", defaultValue = "1") Integer pn) {

        try {
            PageHelper.startPage(pn, 5);
            List<DataDictionary> list = dds.findAllData();
            PageInfo pageInfo = new PageInfo(list, 7);
            return Msg.success().add("pageInfo", pageInfo);
        } catch (Exception e) {
            e.printStackTrace();
            return Msg.fail();
        }

    }

    ;

    //添加字典数据
    @RequestMapping("addData")
    public Msg addData(DataDictionary dd) {
        try {
            dds.addData(dd);
            return Msg.success();
        } catch (Exception e) {
            e.printStackTrace();
            return Msg.fail();
        }
    }

    //删除字典数据
    @RequestMapping("delData")
    public Msg delData(Integer id) {
        try {
            dds.delData(id);
            return Msg.success();
        } catch (Exception e) {
            e.printStackTrace();
            return Msg.fail();
        }
    }

    //修改字典数据
    @RequestMapping("updataData")
    public Msg updataData(DataDictionary dd) {
        try {
            dds.updataData(dd);
            return Msg.success();
        } catch (Exception e) {
            e.printStackTrace();
            return Msg.fail();
        }
    }
}