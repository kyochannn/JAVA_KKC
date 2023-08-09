package Day_09.Ex03_AutoClose;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class FileInputTxt {

	// 스트림
	// : 실제 입력이나 출력이 표현된 데이터 흐름
	
	// 입력 받을 수 있는 데이터
	// : 키보드로부터 입력한 키, 파일 등
	
	// (키보드)(파일) ---> [스트립] ---> [프로그램]
	
	// 입력할 스트림 클래스 : InputStream
	// 파일 스트림 클래스 : FileInputStream
	FileInputStream fis = null;
	
	try {
		fis= new FileInputStream("test.txt");
		
		int read = 0;
		
		// fis.read() : .txt 파일의 데이터를 한 글자씩 읽어오는 메소드
		// 				- 더 이상 읽어올 데이터가 없으면 -1을 반환 (이 메소드의 특징이구나)
		// 가져올 글자가 없을 때가 까지 반복한다.
		while ((read = fis.read() != -1 ) {
			System.out.println((char)read);
			
		}
		
	}
	catch (FileNotFoundException e) {
		// FileNotFoundException : 파일이 없을 때 발생하는 예외
		e.printStackTrace(); // 예외 발생 원인을 찾아 단계별로 예외 메시지를 출력
		System.out.println("파일을 찾을 수 없습니다.");
		
	} catch(IOExecaption e) {
		e.printStackTrace();
		System.out.println("입출력에 관한 예외 발생");
	} 
	finally {
		if (fis != null) {
			fis.close();
		} catch (IOExecaption e) {
			e.printSteakTrace();
		}
	}
}