import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;

public class LuckyNumbe {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		LuckyNumbe(scan);
	}
	public static void LuckyNumbe(Scanner input) {
		System.out.println("Tôi đang nghĩ một khoảng từ 0 đến 100");
		
		int num;
		String answer;
		/*Tạo biến đếm count = 1 */
		int luckyNum;
		int totalGuess = 0;
		int totalGame = 0;
		double guesAvg;
		
		/* Dùng hàm random() để sinh ra số ngẫu nhiên */
		Random rand = new Random();
		
		do  {
			totalGame++;
			/*Bắt ramdom số ngẫu nhiên từ 0 đến 100 */
			luckyNum = rand.nextInt(100);
			do {
				totalGuess++;
				/*in ra chuỗi "Tôi đoán" */
				System.out.print("Tôi đoán?");
				/* Yêu cầu nhập số dự đoán */
				num = input.nextInt();
				
				/*Kiểm tra xem số nhập vào nhỏ hơn số may mắn */
				if (num < luckyNum) {
					/*thì hiển thị thông báo: số may mắn lớn hơn số dự đoán của bạn.*/
					System.out.println("số may mắn lớn hơn số dự đoán của bạn");
				}
				/* Kiểm tra xem số nhập vào lớn hơn số may mắn */
				else if (num > luckyNum) {
					/*thì hiển thị thông báo: số may mắn nhỏ hơn số dự đoán của bạn. */
					System.out.println("số may mắn nhỏ hơn số dự đoán của bạn.");
				} else {
					/* Kiểm tra xem số nhập vào chính là số may mắn thì hiển thị thông báo: chúc mừng bạn đã dự đoán đúng con số may mắn.*/
					System.out.println("chúc mừng bạn đã dự đoán đúng con số may mắn sau" + " " + totalGuess + " " + "lần dự đoán!");
				}
	
			}
			/* Dùng lệnh if để kiểm tra xem số người dùng nhập vào có trùng với số lucky hay không */
			while (luckyNum != num);
			System.out.println("Bạn muốn chơi tiếp: ");
			answer = input.next();
		} while (answer.equalsIgnoreCase("y") || answer.equalsIgnoreCase("yes"));
		    System.out.println("Tổng số lần dự đoán:" + totalGuess);
		    System.out.println("Tổng số lần chơi là:" + totalGame);
		    guesAvg = totalGuess/totalGame;
		    System.out.println("Số lần dự đoán trung bình mỗi đợt:" + guesAvg);
		
	}

}
