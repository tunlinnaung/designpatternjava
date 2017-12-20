package com.my.java8.default8;

public class FunctionInterfaceTest
{
    public static void main(String[] args) {
//        ConverterImpl<String, Integer> converter = (from) -> Integer.parseInt(from);
        //ConverterImpl<String, Integer> converter = Integer::valueOf;
        Something something = new Something();
        ConverterImpl<String, Integer> converter = something::startWith;
        String converted = converter.convert("Java8");
        System.out.println("Converted String : " + converted);
    }
}

class Something
{
    String startWith(String s) {
        return String.valueOf(s.charAt(0));
    }
}
