public class TestSwitchCase {
	public static void main(String[] args) {
		char grade = 'e';
		switch (grade)
		{
		case 'a':
			System.out.println("youxiu");
			break;
		case 'b':
		case 'c':
			System.out.println("lianghao");
			break;
		case 'd':
			System.out.println("jige");
			break;
		default :
			System.out.println("bujige");
		}
		System.out.println("dengjishi" + grade);
	}
}