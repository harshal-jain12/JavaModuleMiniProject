package patternPrintings;

public class AllPatternsCovers {

	public static void main(String[] args) {

		System.out.println("=====================1");

		for (int i = 0; i < 5; i++) {

			for (int j = 1; j <= 5; j++) {

				System.out.print(j + " ");

			}

			System.out.println();

		}

		System.out.println("2=====================2");

		for (int i = 1; i <= 5; i++) {

			for (int j = 1; j <= 5; j++) {

				System.out.print(i + " ");

			}

			System.out.println();

		}

		System.out.println("3=====================3");

		char ch = 'A';

		for (int i = 0; i < 4; i++) {

			for (int j = 0; j < 4; j++) {

				System.out.print((char) (ch + i + j) + " ");

			}

			System.out.println();

		}

		System.out.println("4=====================4");

		for (int i = 0; i < 4; i++) {

			for (int j = 0; j < 4; j++) {

				System.out.print((i + j) % 2 + " ");

			}

			System.out.println();

		}

		System.out.println("5=====================5");

		for (int i = 0; i < 5; i++) {

			for (int j = 0; j <= i; j++) {

				System.out.print("* ");

			}

			System.out.println();

		}

		System.out.println("6=====================6");

		for (int i = 1; i <= 5; i++) {

			for (int j = 0; j < i; j++) {

				System.out.print(i + " ");

			}

			System.out.println();

		}

		System.out.println("7=====================7");

		for (int i = 1; i <= 5; i++) {

			for (int j = 1; j <= i; j++) {

				System.out.print(j);

			}

			System.out.println();

		}

		System.out.println("8=====================8");

		for (int i = 1; i <= 5; i++) {

			for (int j = 0; j < i; j++) {

				System.out.print(i + j + " ");

			}

			System.out.println();

		}

		System.out.println("9=====================9");

		for (int i = 1; i <= 5; i++) {

			for (int j = 0; j < i; j++) {

				System.out.print(i + j + " ");

			}

			System.out.println();

		}

		System.out.println("10=====================10");

		for (int i = 1; i <= 5; i++) {

			for (int j = 0; j < i; j++) {

				System.out.print(i % 2 + " ");

			}

			System.out.println();

		}

		System.out.println("11=====================11");

		for (int i = 1; i < 5; i++) {

			for (int j = 5; j > i; j--) {

				System.out.print("  ");

			}

			for (int k = 0; k < i; k++) {

				System.out.print(" *");

			}

			System.out.println();

		}

		System.out.println("12=====================12");

		for (int i = 1; i < 5; i++) {

			for (int j = 5; j > i; j--) {

				System.out.print("  ");

			}

			for (int k = 0; k < i; k++) {

				System.out.print(" *  ");

			}

			System.out.println();

		}

		int a = 1, j;

		System.out.println("13=====================13");

		for (int i = 1; i < 5; i++) {

			for (j = 5; j > i; j--) {

				System.out.print("    ");

			}

			for (int k = 0; k < i; k++) {

				System.out.print(" " + (a++) + "  ");

			}

			System.out.println();

		}

		System.out.println("14=====================14");

		for (int i = 1; i < 5; i++) {

			for (j = 5; j > i; j--) {

				System.out.print("  ");

			}

			for (int k = 0; k < i; k++) {

				System.out.print(" " + (i + k) + "  ");

			}

			System.out.println();

		}

		System.out.println("15=====================15");

		for (int i = 5; i > 0; i--) {

			for (j = i; j > 0; j--) {

				System.out.print(i);

			}

			System.out.println();

		}

		System.out.println("16=====================16");

		int end = 5;

		for (int i = 5; i > 0; i--) {

			for (j = i; j > 0; j--) {

				System.out.print(end + "");

			}

			end--;

			System.out.println();

		}

		System.out.println("17=====================17");

		for (int i = 1; i < 5; i++) {

			for (j = 5; j > i; j--) {

				System.out.print("  ");

			}

			for (int k = 0; k < i; k++) {

				System.out.print(" " + (i + k) + "  ");

			}

			System.out.println();

		}

		for (int i = 5; i > 0; i--) {

			for (j = 5; j > i; j--) {

				System.out.print("  ");

			}

			for (int k = 0; k < i; k++) {

				System.out.print(" " + (i + k) + "  ");

			}

			System.out.println();

		}

		System.out.println("=======================18");

		for (int i = 1; i <= 6; i++) {

			for (j = 6; j >= i; j--) {

				System.out.print(j);

			}

			System.out.println();

			for (int k = 1; k <= i; k++) {

				System.out.print(" ");

			}

		}

		System.out.println();

		System.out.println("=======================19");

		for (int i = 0; i < 5; i++) {

			for (j = 0; j < 5; j++) {

				if (i == j)

					System.out.print("x ");

				else

					System.out.print("- ");

			}

			System.out.println();

		}

		System.out.println("=======================20");

		for (int i = 0; i < 7; i++) {

			for (j = 0; j < 7; j++) {

				if (i == j || (i + j) == 6)

					System.out.print("x ");

				else

					System.out.print("- ");

			}

			System.out.println();

		}

		System.out.println("=======================20");

		for (int i = 1; i <= 5; i++) {

			for (j = 1; j <= 5; j++) {

				if (i == 1 || j == 1 || j == 5 || i == 5) {

					System.out.print("* ");

				}

				else

					System.out.print("# ");

			}

			System.out.println();

		}

		System.out.println("=======================21");

		for (int i = 1; i <= 5; i++) {

			for (j = 1; j <= 5; j++) {

				if (i == 1 || j == 1 || j == 5 || i == 5) {

					System.out.print("* ");

				}

				else

					System.out.print("  ");

			}

			System.out.println();
		}

	}

}
