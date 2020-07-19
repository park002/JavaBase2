package Stream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ObjectStreamEx {
	public static void main(String[] args) throws Exception {
		writeList();
		List<Board> list = readList();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		for (Board bb : list) {
			System.out.println(bb.getBno() + "\t" + bb.getContent() + "\t" + bb.getTitle() + "\t" + bb.getWriter()
					+ "\t" + sdf.format(bb.getDate()));
		}
	}

	static void writeList() throws Exception { // 출력
		List<Board> list = new ArrayList<Board>();
		list.add(new Board(1, "제목1", "내용1", "재호", new Date()));
		list.add(new Board(2, "제목2", "내용2", "재호2", new Date()));
		list.add(new Board(3, "제목3", "내용3", "재호3", new Date()));
		list.add(new Board(4, "제목4", "내용4", "재호4", new Date()));
		FileOutputStream fos = new FileOutputStream("C:/Teee/board.db");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(list);
		oos.flush();
		oos.close();
	}

	static List<Board> readList() throws Exception {
		FileInputStream fis = new FileInputStream("C:/Teee/board.db");
		ObjectInputStream ois = new ObjectInputStream(fis);
		List<Board> list = (List<Board>) ois.readObject();
		return list;
	}
}
