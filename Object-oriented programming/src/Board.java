
public class Board {
	String title;
	String content;
	String writer;
	String date;
	int hitCount;

	Board(String title, String content) {
		this(title, content, "¹ÚÀçÈ£", "2020", 180);

	}

	Board(String title, String content, String writer) {
		this(title, content, writer, "2020", 10);

	}

	Board(String title, String content, String writer, String date) {
		this(title, content, writer, date, 20);
	}

	Board(String title, String content, String writer, String date, int hitCount) {
		this.title = title;
		this.content = content;
		this.writer = writer;
		this.date = date;
		this.hitCount = hitCount;
		System.out.println(this.hitCount);
		// 180 10 20 600
	}

}
