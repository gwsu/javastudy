package com.hxw.io;  
import java.io.*;  
   
public class FileExample{  
    public static void main(String[] args) {  
       
        createFile();  
    }  
   
  /** 
   * �ļ�����ʾ�� 
   */  
  public static void createFile() {  
     File file_handle=new File("D:/00_java/creat.txt");  
     
        try{  
        	
        	file_handle.createNewFile();  //���ҽ��������ھ��д˳���·����ָ�����Ƶ��ļ�ʱ�����ɷֵش���һ���µĿ��ļ���  
            System.out.println("�÷�����С"+file_handle.getTotalSpace()/(1024*1024*1024)+"G"); //�����ɴ˳���·������ʾ���ļ���Ŀ¼�����ơ�  
            file_handle.mkdirs();  //�����˳���·����ָ����Ŀ¼���������б��赫�����ڵĸ�Ŀ¼��  
            
            System.out.println("�ļ���  "+file_handle.getName());  //  �����ɴ˳���·������ʾ���ļ���Ŀ¼�����ơ�  
            System.out.println("�ļ���Ŀ¼�ַ��� "+file_handle.getParent());// ���ش˳���·������Ŀ¼��·�����ַ����������·����û��ָ����Ŀ¼���򷵻� null��  
             
        }
        
        catch (Exception e) {  
            e.printStackTrace();  
        }  
  }  
}  