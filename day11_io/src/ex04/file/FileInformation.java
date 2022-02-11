package ex04.file;

import java.io.File;

public class FileInformation {

	public static void main(String[] args) throws Exception {
		
		File file = null;
		byte[] fileName = new byte[100];
		
		String strName;
		System.out.print("file name = "); // 상대경로로 읽기
		//System.in.read(fileName);
		
		System.in.read(fileName); // 예외 발생
		strName = new String(fileName).trim();
		
		file = new File(strName); // PATH 뿐 아니라, URL이나 부모/자식 이용으로도 가능
		
		System.out.println("절대경로: "+file.getAbsolutePath());
		System.out.println("표준경로: "+file.getCanonicalPath());
		System.out.println("최종 수정일: "+file.lastModified());
		System.out.println("파일크기: "+file.length());
		System.out.println("읽기속성: "+file.canRead());
		System.out.println("쓰기속성: "+file.canWrite());
		System.out.println("파일경로: "+file.getPath());
		System.out.println("숨김속성: "+file.isHidden());
	}

}
