package com.convert;

import org.springframework.core.convert.converter.Converter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by ningli on 2018/7/10.
 */
public class DateConvert implements Converter<String,Date> {
    private  String dataPattern ="yyyy-MM-dd HH:mm:ss";
    @Override
    public Date convert(String source){
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(dataPattern);
        try {
            return simpleDateFormat.parse(source);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return null;
    }

}
