package com.gmail.vozoromsined.task23;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class Bankomat {
    public static void main(String[] args) {
        Bankomat bankomat = new Bankomat(4, 1, 1);
        System.out.printf("420: %b\n", bankomat.take(420));
        System.out.println(bankomat);

        bankomat.addBanknotes(0, 0, 5);

        System.out.printf("420: %b\n", bankomat.take(420));
        System.out.println(bankomat);
    }


    private TreeMap<Integer, Long> banknotes = new TreeMap<>(getIntComparator().reversed());

    private static Comparator<Integer> getIntComparator() {
        return Integer::compareTo;
    }

    public Bankomat(long qty20, long qty50, long qty100) {
        if (qty20 < 0 || qty50 < 0 || qty100 < 0) throw new IllegalArgumentException();
        banknotes.put(20, qty20);
        banknotes.put(50, qty50);
        banknotes.put(100, qty100);
    }

    void addBanknotes(long qty20, long qty50, long qty100) {
        if (qty20 < 0 || qty50 < 0 || qty100 < 0) throw new IllegalArgumentException();
        banknotes.computeIfPresent(20, (integer, aLong) -> aLong + qty20);
        banknotes.computeIfPresent(50, (integer, aLong) -> aLong + qty50);
        banknotes.computeIfPresent(100, (integer, aLong) -> aLong + qty100);
    }

    boolean take(long value) {
        TreeMap<Integer, Long> tmp = new TreeMap<>(banknotes);
        long oldValue = value;
        do {
            oldValue = value;

            for (Integer nominal : tmp.navigableKeySet()) {
                if (value > 0) {
                    Long qty = tmp.get(nominal);
                    if (qty > 0 && value >= nominal && value % nominal == 0) {
                        value -= nominal;
                        qty--;
                        tmp.put(nominal, qty);
                        break;
                    }
                }
            }
            //System.out.printf("new value: %d\n", value);
        } while (oldValue != value);

        if (value == 0) {
            banknotes = tmp;
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return banknotes.toString();
    }
}
