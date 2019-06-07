package com.gmail.vozoromsined.task28;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class GradeList {
    public static void main(String[] args) {
        List<Integer> marks = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            marks.add(random.nextInt(10) + 1);
        }
        System.out.println(marks);

        int maxMark = -1;
        Iterator<Integer> iterator = marks.iterator();
        if (iterator.hasNext()) {
            maxMark = iterator.next();
        }

        while (iterator.hasNext()) {
            Integer mark = iterator.next();
            if (mark > maxMark) maxMark = mark;
        }
        System.out.println(maxMark);

    }
}
