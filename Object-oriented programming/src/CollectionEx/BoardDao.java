package CollectionEx;

import java.util.ArrayList;
import java.util.List;

public class BoardDao {
	List getBoardList() {
		List<Board> list = new ArrayList<Board>();
		list.add(new Board("����1", "����1")); // 0��
		list.add(new Board("����2", "����2")); // 1��
		list.add(new Board("����3", "����3")); // 2�� �ε���
		return list;
	}

}
