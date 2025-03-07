package org.example.exceptions;

public class UnCheckedException {
    public static int calculate(int year,int yearOfBirth) throws Exception{
        if(year< 2000){
            throw new IllegalArgumentException("Year should be above 20000");
        }
        return year-yearOfBirth;
    }
}
