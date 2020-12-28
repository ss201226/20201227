package stream.decorator;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopyTest {

	public static void main(String[] args) {
		long millisecond=0;
		try(FileInputStream fis=new FileInputStream("a.zip");
				FileOutputStream fos=new FileOutputStream("cozy.zip")) {
			millisecond=System.currentTimeMillis();
			int i;
			while((i=fis.read()) !=-1) {
				fos.write(i);
			}
			millisecond=System.currentTimeMillis()-millisecond;
		}catch(IOException e) {
			e.printStackTrace();
		}
		System.out.println("파일복사하는데 "+millisecond+"milliseconds 소요되었습니다");
				

	}

}
