package com.hxw.io;  
import java.io.File;  
import java.io.FileInputStream;  
import java.io.IOException;   


public class FileCount {  
   /** 
    * 我们写一个检测文件长度的小程序，别看这个程序挺长的，你忽略try catch块后发现也就那么几行而已。 
    */  
   public static void main(String[] args) {  
      //TODO 自动生成的方法存根  
      int count=0;  //统计文件字节长度  
      
      FileInputStream streamReader = null;   //文件输入流  
      
      try{  
          streamReader =new FileInputStream(new File("D:/00_Java/creat.txt"));  
         
          while(streamReader.read()!=-1) {  //读取文件字节，并递增指针到下一个字节  
             count++;  
          }  
          System.out.println("---长度是： "+count+" 字节");  
      }catch (final IOException e) {  
          //TODO 自动生成的 catch 块  
          e.printStackTrace(); 
      }
      
      finally{  
         try{  
             streamReader.close();  
          }
         catch (IOException e) {  
             //TODO 自动生成的 catch 块  
             e.printStackTrace();  
          }  
      }  
   }  
   
}  