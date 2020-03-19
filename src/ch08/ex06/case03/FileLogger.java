package ch08.ex06.case03;

import java.util.logging.FileHandler;
import java.util.logging.Handler;
import java.util.logging.Logger;

public class FileLogger {
	private final Logger logger = Logger.getLogger(FileLogger.class.getName());
	
	public void log() throws Exception{
		Handler handler = new FileHandler("c:/DEV/ch08.ex06.case03.xml");
		logger.addHandler(handler);
		
		logger.info("로깅 시작");
		logger.severe("심각 레벨");
		logger.info("로깅 끝");
		
		handler.flush();
		handler.close();
	}
	
	public static void main(String[] args) throws Exception{
		new FileLogger().log();
	}
}

//close()를 안쓸라면 try with resource 사용

//프로세서 - 메모리 공간 = 작업장,프로세서는 작업장+작업
//작업을 하는 주체를 쓰레드라고한다.
//jsp로 만들면 멀티 쓰레드
