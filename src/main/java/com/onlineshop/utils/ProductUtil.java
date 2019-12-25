package com.onlineshop.utils;

import java.util.Arrays;
import java.util.List;

/**
 * @author JunedQQ
 * @create 2019/12/24
 * @since 1.0.0
 */
public class ProductUtil {


    /**
     * 处理商品详情信息
     * @param desc
     * @return
     */
    public static List<String> productDescManage(String desc){
        //根据,来划分字符串
        String[] split = desc.split("。");
        //转化为list
        List<String> result = Arrays.asList(split);
        return result;

    }

}