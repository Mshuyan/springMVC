package com.shuyan.demo01annotation.demo03.customer;

import org.springframework.beans.TypeMismatchException;
import org.springframework.beans.propertyeditors.PropertiesEditor;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Pattern;

/**
 * @author will
 * 功能：自定义的类型转换器，支持多种日期格式字符串转换为日期格式
 * 说明：用于测试 @InitBinder 的自定义格式转换器
 *      该类必须继承 PropertiesEditor
 */
public class MyCustomerEditor extends PropertiesEditor {
    /**
     * 说明：重写 setAsText 或 setAsValue 方法
     * @param text 前台传过来的字符串
     * @throws IllegalArgumentException
     */
    @Override
    public void setAsText(String text) throws IllegalArgumentException {
        SimpleDateFormat sdf=getDate(text);
        try {
            // 使用该方法将转换后的结果返回
            setValue(sdf.parseObject(text));
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
    private SimpleDateFormat getDate(String source) {
        SimpleDateFormat sdf;
        if (Pattern.matches("^\\d{4}-\\d{2}-\\d{2}$", source)) {
            sdf=new SimpleDateFormat("yyyy-MM-dd");
        }else if (Pattern.matches("^\\d{4}/\\d{2}/\\d{2}$", source)) {
            sdf=new SimpleDateFormat("yyyy/MM/dd");
        }else if (Pattern.matches("^\\d{4}\\d{2}\\d{2}$", source)) {
            sdf=new SimpleDateFormat("yyyyMMdd");
        }else {
            throw new TypeMismatchException("", Date.class);
        }
        return sdf;
    }
}
