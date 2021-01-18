package com.southwind;
import org.apache.commons.lang.StringUtils;
public class TestMain {
    public static void main(String[] args) {
            String s = " 1";
            System.out.println(StringUtils.isBlank(s));
            System.out.println(s.isEmpty());
    }
}
