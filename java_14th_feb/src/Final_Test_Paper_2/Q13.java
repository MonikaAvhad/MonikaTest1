package Final_Test_Paper_2;

public class Q13 {

	public static void main(String[] args)
	{

		int i = 2, j = 5;

		String str;

		int k = i++ * --j;

		str = k< 8 ? "false" : null;

		System.out.println(str.equals(false)? "White":"Black");
	}

}
