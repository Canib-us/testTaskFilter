package org.itk.testtaskfilter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

@SpringBootApplication
public class TestTaskFilter {

    public static void main(String[] args) {
        SpringApplication.run(TestTaskFilter.class, args);
        Double[] doubles = {0.182, 1.382, 2.342, 3.942, 4.4364, 5.252};
        Double[] filteredDoubles = ArrayUtil.filter(doubles, Math::floor);
        System.out.println(Arrays.toString(doubles)+"\n"+
                Arrays.toString(filteredDoubles)+"\n");

        String[] strings = {"beforeFilter"};
        String[] filteredStrings = ArrayUtil.filter(strings, String::toUpperCase);
        System.out.println(Arrays.toString(strings)+"\n"+
                Arrays.toString(filteredStrings)+"\n");
    }

}
