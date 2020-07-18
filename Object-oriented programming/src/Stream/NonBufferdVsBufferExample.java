package Stream;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class NonBufferdVsBufferExample {
	public static void main(String[] args) {
		try {
			String originalFilePath1 = NonBufferdVsBufferExample.class.getResource("originalFile1.jpg").getPath();
			String targetFilePath1 = "C:/Teee/targetFile1.jpg";
			FileInputStream fis = new FileInputStream(originalFilePath1); // 바이트 기반 입력 스트림
			FileOutputStream fos = new FileOutputStream(targetFilePath1); // 바이트기반 출력 스트림
			/////////////////////////////////////////
			String originalFilePath2 = NonBufferdVsBufferExample.class.getResource("originalFile2.jpg").getPath();
			String targetFilePath2 = "C:/Teee/targetFile2.jpg";
			FileInputStream fis2 = new FileInputStream(originalFilePath2); // 바이트기반 입력스트림
			FileOutputStream fos2 = new FileOutputStream(targetFilePath2); // 바이트기반 출력스트림.
			BufferedInputStream bis = new BufferedInputStream(fis2); // 버퍼 보조 스트림 연결
			BufferedOutputStream bos = new BufferedOutputStream(fos2); // 버퍼 보조 스트림 연결.
			long nonBufferTime = copy(fis, fos); // 버퍼보조스트림 연결 안했을 경우 (x)
			System.out.println("버퍼를 사용하지 않았을 경우 : \t" + nonBufferTime + "ns");
			long BufferTime = copy(bis, bos);
			System.out.println("버퍼를 사용했을 경우 : \t" + BufferTime + "ns");
			fis.close();
			fos.close();
			bis.close();
			bos.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	static int data = -1;

	static long copy(InputStream is, OutputStream os) throws Exception {
		long start = System.nanoTime(); // 시작시간 저장
		while (true) { // 바이트 읽고
			data = is.read();
			if (data == -1)
				break;
			os.write(data);
		}
		os.flush(); // 바이트 출력
		long end = System.nanoTime(); // 끝시간 저장
		return end - start;
	}
}
