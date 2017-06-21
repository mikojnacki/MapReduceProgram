package com.mikolaj.app;

import org.apache.hadoop.io.DoubleWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mrunit.mapreduce.ReduceDriver;
import org.junit.Test;

import java.io.IOException;

/**
 * Created by Mikolaj on 21.06.17.
 */
public class MyReducerTest {

    @Test
    public void returnsMaximumIntegerInValues() throws IOException, InterruptedException {

//        new ReduceDriver<Text, DoubleWritable, Text, DoubleWritable>()
//                .withReducer(new MyReducer())
//                .withInput()
//                .withOutput()
//                .runTest();
    }
}