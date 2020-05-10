
public class ArrayInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] mathScores = new int[2][3];
		int[][] mathScores2 = { { 1, 2, 3 }, { 1, 4, 5 } };
		for (int i = 0; i < mathScores.length; i++) { // За
			for (int j = 0; j < mathScores[i].length; j++) {// ї­
				System.out.println("mathScores[" + i + "][" + j + "] =" + mathScores[i][j]);
				// 0,0
				// 0,1
				// 0,2
				// 1,0
				// 1,1
				// 1,2
			}
		}
		System.out.println();
		int[][] EnglishScores = { {}, {} };
		System.out.println(EnglishScores.length);
		EnglishScores[0] = new int[3];
		EnglishScores[1] = new int[4];

		for (int i = 0; i < EnglishScores.length; i++) {
			for (int j = 0; j < EnglishScores[i].length; j++) {
				System.out.println("EnglishScore[" + i + "][" + j + "] = " + EnglishScores[i][j]);
			}
		}
		System.out.println();
		int[][] JavaScores = { { 95, 100 }, { 100, 89, 97 } };
		System.out.println(JavaScores.length);
		for (int i = 0; i < JavaScores.length; i++) {
			for (int j = 0; j < JavaScores[i].length; j++) {
				System.out.println("JavaScores[" + i + "][" + j + "] = " + JavaScores[i][j]);
			}
		}

	}

}
