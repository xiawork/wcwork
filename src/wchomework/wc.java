package wchomework;

import java.io.*;
import java.util.Scanner;

public class wc {   //�ڿ���̨¼��һ���ļ���·�������ļ���������ǰ��Ŀ��

public static void main(String[] args) throws IOException {
    File file=fuction.getFile();    //��ȡ�ļ�
    
    
    BufferedInputStream bis=new BufferedInputStream(new FileInputStream(file)); //��ȡ�ļ�
    
    FileReader reader = new FileReader(file);
    int fileLen = (int)file.length();
    char[] chars = new char[fileLen];
    reader.read(chars);
    String txt = String.valueOf(chars);
    System.out.println("����������:"); 
    
    Scanner sc=new Scanner(System.in);  //��������¼�����
    String line = sc.nextLine();       //��������ʵ������
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
    
    bis.close();       //�����ͷ���Դ
}

}