package com.demo.test.testcases.search;

import com.demo.test.base.BaseParpare;
import com.demo.test.pageshelper.SearchPageHelper;
import org.testng.annotations.Test;

import java.util.Map;


public class Search_001_Search_Test extends BaseParpare{

    @Test(dataProvider="testData")
    public void searchTest(Map<String, String> data){
        //输入后点击查询
        SearchPageHelper.search(seleniumUtil,data.get("KEYWORD"));

    }
}
