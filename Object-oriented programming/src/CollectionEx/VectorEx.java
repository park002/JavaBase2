package CollectionEx;

import java.util.List;
import java.util.Vector;

public class VectorEx {
	public static void main(String[] args) {
		List<Board> list = new Vector<Board>();
		list.add(new Board("제목1", "내용", "글쓴이1")); // 0번지
		list.add(new Board("제목2", "내용", "글쓴이2")); // 1번지
			list.add(new Board("제목3", "내용", "글쓴이3")); // 2번지
		list.add(new Board("제목4", "내용", "글쓴이4")); // 3번지 //2
			list.add(new Board("제목5", "내용", "글쓴이5")); // 4번지 //3
		list.remove(2); // 제목 3 삭제 (뒤의 인덱스는 1씩 앞으로 당겨진다)
		list.remove(3); // 제목 5 삭제

		for (int i = 0; i < list.size(); i++) {
			Board board = list.get(i);
			System.out.println(board.subject + "\t" + board.content + "\t" + board.writer);

		}
	}
}
