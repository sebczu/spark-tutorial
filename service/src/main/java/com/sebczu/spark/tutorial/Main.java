package com.sebczu.spark.tutorial;

import org.apache.spark.SparkConf;
import org.apache.spark.api.java.JavaSparkContext;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        SparkConf conf = new SparkConf().setAppName("test").setMaster("local");
        JavaSparkContext sparkContext = new JavaSparkContext(conf);

        long count = sparkContext.parallelize(Arrays.asList("111", "222", "333"))
                .filter(str -> !str.equals("222"))
                .count();

        System.out.println("count: " + count);

        sparkContext.stop();
    }

}
