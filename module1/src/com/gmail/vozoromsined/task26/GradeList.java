package com.gmail.vozoromsined.task26;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class GradeList {
    public static void main(String[] args) {
        List<Integer> marks=new ArrayList<>();
        Random random=new Random();
        for(int i=0;i<10;i++){
            marks.add(random.nextInt(10)+1);
        }
        System.out.println(marks);

        Iterator<Integer> iterator = marks.iterator();
        while (iterator.hasNext()) {
            Integer mark = iterator.next();
            if (mark < 4) iterator.remove();
        }
        System.out.println(marks);

        marks.clear();
        for(int i=0;i<10;i++){
            marks.add(random.nextInt(10)+1);
        }
        System.out.println(marks);

        marks = marks.stream().filter(i -> i >= 4).collect(Collectors.toList());
        System.out.println(marks);
    }
}
