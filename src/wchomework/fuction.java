package wchomework;

import java.io.File;
import java.util.Scanner;

public class fuction {
//ͨ��������ʽ�����������
	public static void readline(String file){
		   String[] array = file.split("\r");
		   int len = array.length;
		   System.out.print("��������Ϊ��" + len);
	  }
	
//ͨ���ַ����ʽ���������
	public static void readword(String file) {
		int i;
		String[] array = file.split("\\s+");
		   int len = array.length;
		   System.out.print("������Ϊ��" + len);
	}
	
	//ͨ��������ʽ����ַ���
	  public static void readcharacter(String file) {
		// TODO Auto-generated method stub
		  int i;
			String[] array = file.split("\\w");
			   int len = array.length;
			   System.out.print("�ַ���Ϊ��" + len);
	}
	  
	//  ����һ����������ȡ����¼����ļ�·��������װ��File���󷵻�
	   // ����ֵ���ͣ�File
	  public static File getFile() {
		    System.out.println("��¼��һ���ļ�·��:");  
	        Scanner sc=new Scanner(System.in);   //��������¼�����
	        while(true) {
	            String line=sc.nextLine();     // ���ռ���¼���·��
	            File file=new File(line);       //��װ��File���󣬶�������ж�

	            if(!file.exists()) {
	            System.out.println("��¼����ļ�·�������ڣ�������¼��");
	            }else if(file.isDirectory()) {
	                System.out.println("��¼������ļ���·����������¼��");
	            }else {
	            	
	            return file;
	            	
	            }
	      }
	}
	  
	 
	  
}
