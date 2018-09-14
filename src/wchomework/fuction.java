package wchomework;

import java.io.File;
import java.util.Scanner;

public class fuction {
//通过正则表达式算出代码行数
	public static void readline(String file){
		   String[] array = file.split("\r");
		   int len = array.length;
		   System.out.print("代码行数为：" + len);
	  }
	
//通过字符表达式算出单词数
	public static void readword(String file) {
		int i;
		String[] array = file.split("\\s+");
		   int len = array.length;
		   System.out.print("单词数为：" + len);
	}
	
	//通过正则表达式算出字符数
	  public static void readcharacter(String file) {
		// TODO Auto-generated method stub
		  int i;
			String[] array = file.split("\\w");
			   int len = array.length;
			   System.out.print("字符数为：" + len);
	}
	  
	//  定义一个方法，获取键盘录入的文件路径，并封装成File对象返回
	   // 返回值类型：File
	  public static File getFile() {
		    System.out.println("请录入一个文件路径:");  
	        Scanner sc=new Scanner(System.in);   //创建键盘录入对象
	        while(true) {
	            String line=sc.nextLine();     // 接收键盘录入的路径
	            File file=new File(line);       //封装成File对象，对其进行判断

	            if(!file.exists()) {
	            System.out.println("您录入的文件路径不存在，请重新录入");
	            }else if(file.isDirectory()) {
	                System.out.println("你录入的是文件夹路径，请重新录入");
	            }else {
	            	
	            return file;
	            	
	            }
	      }
	}
	  
	 
	  
}
