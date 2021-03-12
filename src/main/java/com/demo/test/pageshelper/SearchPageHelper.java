package com.demo.test.pageshelper;


import com.demo.test.pages.SearchPage;
import com.demo.test.utils.SeleniumUtil;
import org.apache.log4j.Logger;


public class SearchPageHelper {

    /**
     * 提供本类中日志输出对象
     */
    public static Logger logger = Logger.getLogger(SearchPageHelper.class);

    /**
     * 搜索输入框封装
     */
    public static void search(SeleniumUtil seleniumUtil,String keyWord){
        //清空输入框
        seleniumUtil.clear(SearchPage.SEARCH_INPUT);
        //输入关键字输入框
        seleniumUtil.type(SearchPage.SEARCH_INPUT,keyWord);
        //点击搜索按钮
        seleniumUtil.clear(SearchPage.SERRCH_BUTTON);

    }

}
