import java.util.Arrays;
public class IDE{
	public static void main(String[] args) {
		int [] arr = {-1, 20, 2, 13, 3};
		Arrays.sort(arr);
		for(int i = 0; i < arr.length ; i++) {
			System.out.print(arr[i] + "\t");
		}
	}
}