package com.willkernel.app.databinding.utils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by willkernel on 2017/1/11.
 * mail:willkerneljc@gmail.com
 */

public class StringUtils {
    private static Pattern sWordPattern = Pattern.compile("\\w+");
    public static String capitalizeSentence(final String sentence) {
        String result = sentence;
        Matcher matcher = sWordPattern.matcher(result);
        while (matcher.find()) {
            String word = matcher.group();
            result = result.replace(word, capitalize(word));
        }
        return result;
    }

    public static String capitalize(final String word) {
        if (word.length() > 1) {
            return String.valueOf(word.charAt(0)).toUpperCase() + word.substring(1);
        }
        return word;
    }
}