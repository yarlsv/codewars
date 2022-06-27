package org.example;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TimeFormatter {
    public static String formatDuration(int seconds) {
        if(seconds == 0) return "now";

        String result = Arrays.stream( new String[] {
                timeFormat("year", seconds / 31_536_000),
                timeFormat("day", seconds / 86_400 % 365),
                timeFormat("hour", seconds / 3600 % 24),
                timeFormat("minute", seconds / 60 % 60),
                timeFormat("second", seconds %3600 % 60)})
                .filter(s -> s != "")
                .collect(Collectors.joining(", "));

        return result.replaceAll(", (?!.+,)", " and ");
    }

    public static String timeFormat (String name, int time) {
        if (time == 0) return "";
        return time + " " + name + (time > 1 ? "s" : "") ;
    }
}
