package CollectionEx;

import java.util.ArrayList;
import java.util.List;

public class BoardDao {
	List getBoardList() {
		List<Board> list = new ArrayList<Board>();
		list.add(new Board("제목1", "내용1")); // 0번
		list.add(new Board("제목2", "내용2")); // 1번
		list.add(new Board("제목3", "내용3")); // 2번 인덱스
		return list;
	}

}
