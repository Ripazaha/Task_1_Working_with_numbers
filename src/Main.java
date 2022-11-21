import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import java.util.*;

public class Main {

    public static List<Integer> collectionActions(List<Integer> intList) {
        List<Integer> newList = new ArrayList<>();
        for (int number : intList) {
            if (number > 0) {
                newList.add(number);
            }
        }
        newList.removeIf(number -> number % 2 != 0);
        Collections.sort(newList);
        return newList;
    }

    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);
        for (int number : collectionActions(intList)){
            System.out.print(number + " ");
        }
    }
}
