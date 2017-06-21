package com.mikolaj.app;

import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mrunit.mapreduce.MapDriver;
import org.junit.Test;

import java.io.IOException;
import java.io.InterruptedIOException;

/**
 * Created by Mikolaj on 21.06.17.
 */
public class MyMapperTest {

    @Test
    public void processValidRecord() throws IOException, InterruptedIOException {

//        Text value = new Text("");
//
//        new MapDriver<LongWritable, Text, LongWritable, Text>()
//                .withMapper(new MyMapper())
//                .withInput()
//                .withOutput()
//                .runTest();
    }
}
