package com.example.basic;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateCheck {
    public java.sql.Timestamp validateAndFormat(String raw, String formatStr) throws Exception {
        Date javaDate = null;
        java.sql.Timestamp sqlDate;
        try {
            SimpleDateFormat sdf = new SimpleDateFormat(formatStr);
            sdf.setLenient(false);
            javaDate = sdf.parse(raw);
            sqlDate = new java.sql.Timestamp(javaDate.getTime());
        } catch (ParseException e) {
            throw new Exception(e);
        }
        return sqlDate;
    }

    public java.sql.Timestamp validateAndFormatLenient(String raw, String formatStr) throws Exception {
        Date javaDate = null;
        java.sql.Timestamp sqlDate;
        try {
            SimpleDateFormat sdf = new SimpleDateFormat(formatStr);
            sdf.setLenient(true);
            javaDate = sdf.parse(raw);
            sqlDate = new java.sql.Timestamp(javaDate.getTime());
        } catch (ParseException e) {
            throw new Exception(e);
        }
        return sqlDate;
    }

}
