public class GreaterLessThan {
	public static void main(String[] args) {   
		double creditsEarned = 176.5;
    double creditsOfSeminar = 8;
    double creditsToGraduate = 180;
    boolean isOrTrue1 = creditsEarned > creditsToGraduate ;
    System.out.println(isOrTrue1);
    double creditsAfterSeminar = creditsEarned + creditsOfSeminar;
    boolean isOrTrue2 = creditsAfterSeminar > creditsToGraduate ;
    System.out.println(isOrTrue2);
	}
}