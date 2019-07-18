import java.util.Random;


public class Asach2 {

	public static void main(String[] args) {

		System.err.println(firstFactorial(4));
		
		Random random = new Random();
		int cheese = 53 + random.nextInt(477);
		int mouseX = random.nextInt(23);
		int mouseY = random.nextInt(23);

		int[][] room = new int[23][23];

		for(int i = 0; i< room.length; i++) {
			for (int j = 0; j < room.length; j++) {
				room[i][j] = 0; //empty room

				for (int l = 0; l <= cheese; l++) {
					int m = random.nextInt(23);
					int n = random.nextInt(23);
					room[m][n] = 1; //cheese
				}
				room[mouseY][mouseX] = 2;// mouse

				System.out.print(room[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("Cheese amount: " + cheese);
		System.out.println("Mouse position: " + mouseY + ", " + mouseX);

		for(int i = 0; i < room.length; i++){
			for(int j = 0; j < room.length; j++){
				System.out.print(room[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	public static int firstFactorial(int num)
    {
        return (num == 1 ? 1 : num * firstFactorial(num - 1 ) );
    }
}
