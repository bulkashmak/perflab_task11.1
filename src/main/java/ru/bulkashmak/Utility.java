package ru.bulkashmak;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Utility {

    public String convert(int[] intArray) {

        String result = Arrays.stream(intArray)
                .mapToObj(String::valueOf)
                .reduce( (o1, o2) -> o1.concat(" ").concat(o2))
                .get();

        return result;
    }
}
