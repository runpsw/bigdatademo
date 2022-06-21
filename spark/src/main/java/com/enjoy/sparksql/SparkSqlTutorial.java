package com.enjoy.sparksql;

import org.apache.spark.sql.SparkSession;

/**
 * @author sven
 */
public class SparkSqlTutorial {

    public static void main(String[] args) {

        SparkSession spark = SparkSession.builder()
                .master("local")
                .getOrCreate();

        spark.sql("show databases").show();

        spark.close();
    }
}
