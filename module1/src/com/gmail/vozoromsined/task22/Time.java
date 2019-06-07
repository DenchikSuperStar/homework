package com.gmail.vozoromsined.task22;

public class Time {

    public static void main(String[] args) {
        Time time = new Time(3601L);
        System.out.println(time);
    }

    private int sec;
    private int min;
    private int hour;

    public int getSec() {
        return sec;
    }

    public int getMin() {
        return min;
    }

    public int getHour() {
        return hour;
    }

    public Time(int sec, int min, int hour) {
        if (sec < 0 || sec >= 60) throw new IllegalArgumentException();
        this.sec = sec;
        if (min < 0 || min >= 60) throw new IllegalArgumentException();
        this.min = min;
        this.hour = hour;
    }

    public Time(long sec) {
        hour = (int) (sec / 3600);
        if (hour > 0) {
            sec -= hour * 3600;
        }
        min = (int) (sec / 60);
        if (min > 0) {
            sec -= min * 60;
        }
        this.sec = (int) sec;
    }

    public long getSecTotal() {
        return sec + min * 60 + hour * 3600L;
    }

    @Override
    public String toString() {
        return "Time{" +
                "sec=" + sec +
                ", min=" + min +
                ", hour=" + hour +
                '}';
    }
}
