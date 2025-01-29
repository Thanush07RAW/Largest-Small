import java.util.Scanner;

public class Largestsmall {
    public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
int n = scanner.nextInt();
int[] a = new int[n];

for (int i = 0; i < n; i++) {
a[i] = scanner.nextInt();
}
int l = a[0];
int s = a[0];

for (int i = 1; i < n; i++) {
if (a[i] > l) {
l= a[i];
}
if (a[i] < s) {
s = a[i];
}
}
System.out.println("The largest element is: " + l);
System.out.println("The smallest element is: " + s);
}

}

