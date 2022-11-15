public class Main
{
	public static void main(String[] args) {
	    int a = 5,b = 6, c = 12;
		System.out.println(((a&1)==1)?"odd":"even");
		System.out.println(((b|1)>b)?"even":"odd");
		System.out.println(((c^1)==c+1)?"even":"odd");
	}
}
