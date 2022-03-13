package chapter2.abstracts;

import chapter2.Apple;

import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class giveMeAbstractApple {
    public static void main(String[] args)
    {
//        List<Apple> inventory = Arrays.asList(new Apple(Color.RED,180));
//        List<Apple> redApples = filter(inventory,(Apple apple) -> Color.RED.equals(apple.getColor()));
//        List<Apple> evenNumbers = filter(numbers,(integer i) -> i % 2 ==0);
    }
    public static <T> List<T> filter(List<T> list, Predicate<T> p){
        List<T> result = new ArrayList<>();
        for(T e: list) {
            if(p.test(e))
            {
                result.add(e);
            }
        }
        return result;
    }
}
