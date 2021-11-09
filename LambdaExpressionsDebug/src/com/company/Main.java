package com.company;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main
{
    public static void main(String[] args)
    {
        List<String> list = List.of("Peter", "Lisa", "Rahul", "Ahmed", "Paul")
                .stream()
                .map(name -> name  )
                .filter(name -> name.startsWith("P"))
                .sorted()
                .collect(Collectors.toList());

        System.out.println("list =" + list);
    }
}
