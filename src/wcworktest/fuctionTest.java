package wcworktest;

import static org.junit.Assert.*;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.junit.Test;

import wchomework.fuction;
import wchomework.wc;

public class fuctionTest {

	File file = new File("D:/javadesign/question/src/char_12/book.txt");
	@Test
	public void testReadline() throws IOException {
		
	    fuction.readline("D:/javadesign/question/src/char_12/book.txt");
	}

	@Test
	public void testReadword() throws IOException {
	    fuction.readword("D:/javadesign/question/src/char_12/book.txt");
	}

	@Test
	public void testReadcharacter() throws IOException {
	    fuction.readcharacter("D:/javadesign/question/src/char_12/book.txt");
	}

	@Test
	public void testGetFile() throws IOException {
		File file=fuction.getFile();
		BufferedInputStream bis=new BufferedInputStream(new FileInputStream(file));
	}

}

