package wchomework;

import java.io.*;
import java.util.Scanner;

public class wc {   //在控制台录入一个文件的路径，将文件拷贝到当前项目下

public static void main(String[] args) throws IOException {
    File file=fuction.getFile();    //获取文件
    
    
    BufferedInputStream bis=new BufferedInputStream(new FileInputStream(file)); //读取文件
    
    FileReader reader = new FileReader(file);
    int fileLen = (int)file.length();
    char[] chars = new char[fileLen];
    reader.read(chars);
    String txt = String.valueOf(chars);
    System.out.println("请输入命令:"); 
    
    Scanner sc=new Scanner(System.in);  //创建键盘录入对象
    String line = sc.nextLine();       //具体输入实例对象
    switch(line) {
    case"-l":
    	fuction.readline(txt); 
    	break;
    case"-w":
    	fuction.readword(txt);
    	break;
    case"-c":
    	fuction.readcharacter(txt);
    	break;
   
    }
    
    bis.close();       //关流释放资源
}

}