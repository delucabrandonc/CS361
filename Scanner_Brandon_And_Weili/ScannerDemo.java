/**
 * @author Christelle
 * 
 */
public class ScannerDemo {

	private static String file1 = "D:\\Desktop\\prog2.jay";
	private static int counter = 1;

	public static void main(String args[]) {

		TokenStream ts = new TokenStream(file1);
		Token token;
		System.out.println(file1);

		while (!ts.isEndofFile()) {
			token = ts.nextToken();
			System.out.println("Token " + counter + " - Type: " + token.getType() + " - " + "Value: " + token.getValue());
			counter += 1;
		}
	}
}
