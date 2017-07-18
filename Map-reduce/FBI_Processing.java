package training;

import java.io.IOException;  
import java.util.*;  
import org.apache.hadoop.fs.Path;  
import org.apache.hadoop.io.*;  
import org.apache.hadoop.mapred.*;  


public class FBI_Processing{  

 public static class Map extends MapReduceBase implements Mapper<LongWritable, Text, Text,IntWritable> {  
   
   private Text word = new Text();
 
   public void map(LongWritable key, Text value, OutputCollector<Text, IntWritable> output, Reporter reporter) throws IOException {  
     String line = value.toString().toLowerCase();
     String[] a=line.split("\t");
     word.set(a[0]);
     IntWritable word1 = new IntWritable(Integer.parseInt(a[1]));
       output.collect(word, word1);  
   }  
 }  	
	
 public static class Reduce extends MapReduceBase implements Reducer<Text, IntWritable, Text, IntWritable> {  
   public void reduce(Text key, Iterator<IntWritable> values, OutputCollector<Text, IntWritable> output, 
 		  Reporter reporter) throws IOException {  
    	 int sum = 0;  
         while (values.hasNext()) {  
           sum += values.next().get();  
         }  
     output.collect(key, new IntWritable(sum));  
   }  
 }  


 public static void main(String[] args) throws Exception {  
   JobConf conf = new JobConf(FBI_Processing.class);  
   conf.setJobName("wordcount");  


   conf.setOutputKeyClass(Text.class);  
   conf.setOutputValueClass(IntWritable.class);  

   conf.setMapperClass(Map.class);  
   conf.setCombinerClass(Reduce.class);  
   conf.setReducerClass(Reduce.class);  


   conf.setInputFormat(TextInputFormat.class);  
   conf.setOutputFormat(TextOutputFormat.class);    
   
   FileInputFormat.setInputPaths(conf, new Path("hdfs://quickstart.cloudera:8020/user/hive/warehouse/result_tb"));
   
   FileOutputFormat.setOutputPath(conf, new Path("hdfs://quickstart.cloudera:8020/user/hive/warehouse/output/"));  


   JobClient.runJob(conf);  
 }  
}  




