package Classwork;

public class NumberPattern {
//  1
  //        22
  //        333
  //        4444
  //        55555
  //        4444
  //        333
  //        22
  //        1

	public static void main(String[] args) {
		 for (int i = 1;i< 6; i++) {
		for (int j = 1; j <=i; j++) {
				System.out.print(i);
		}
		System.out.println();

		}
		for (int i = 5;i>0; i--) {
			for (int j = 1; j <=i; j++) {
				System.out.print(i);
			}
		System.out.println();

		}

	}
}