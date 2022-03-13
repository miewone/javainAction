package chapter2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class givemeapple {
    public static void main(String[] args)
    {
        List<Apple> inventory = Arrays.asList(
                new Apple(Color.GREEN,80),
                new Apple(Color.GREEN,155),
                new Apple(Color.RED,120)
                );
        List<Apple> heavyApples = filterApples(inventory, new AppleHeavyWeightPredicate());
        List<Apple> greenApples = filterApples(inventory, new AppleGreenColrPredicate());

//        List<Apple> redApples = filterApples(inventory, new ApplePredicate() {
//            @Override
//            public boolean test(Apple apple) {
//                return Color.RED.equals(apple.getColor());
//            }
//        });
//
        List<Apple> result = filterApples(inventory,(Apple apple) -> Color.RED.equals(apple.getColor()));
    }
    public static List<Apple> filterApples(List<Apple> inventory, ApplePredicate p)
    {
        List<Apple> result = new ArrayList<>();
        for(Apple apple: inventory)
        {
            if(p.test(apple))
            {

                result.add(apple);
            }
        }
        return result;
    }

}