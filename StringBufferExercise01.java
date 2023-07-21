public class StringBufferExercise01 {
    public static void main(String[] args) {
        String str = null;// ok
        StringBuffer sb = new StringBuffer(); //ok
        sb.append(str);
        System.out.println(sb.length());//4
        System.out.println(sb);//null
        StringBuffer sb1 = new StringBuffer(str);
        System.out.println(sb1);
    }
}
