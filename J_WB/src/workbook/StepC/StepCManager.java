package workbook.StepC;

import java.util.Scanner;

public class StepCManager {
	public StepCManager() {
		int menu;
		Scanner s = new Scanner(System.in);
		while (true) {
			printf("---------------------\n");
			printf("1. 나이 계산 및 연령대 판정\n");
			printf("2. 물의 온도 구간 판정\n");
			printf("3. 직사각형 형태 판정\n");
			printf("4. 아파트 평형 계산 및 종류 판정\n");
			printf("5. 연중 날짜 계산\n");
			printf("6. 점수 계산\n");
			printf("7. 파일 전송 시간 계산\n");
			printf("8. 3개의 수 중 최댓값과 최솟값 구하기\n");
			printf("9. 소득세 계산\n");
			printf("10. 간단한 사칙연산 계산기\n");
			printf("11. 윤년 판정하기\n");
			printf("=>원하는 메뉴는?(0:exit) :");
			menu = s.nextInt();
			if (menu == 0)
				break;
			switch (menu) {
			case 1:

				break;
			case 2:

				break;
			case 3:

				break;
			case 4:

				break;
			case 5:

				break;
			case 6:

				break;
			case 7:

				break;
			case 8:

				break;
			case 9:

				break;
			case 10:

				break;
			case 11:

				break;
			}
		}

	}

	void printf(String s) {
		System.out.print(s);
	}
}
