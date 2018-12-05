
public class ParserDemo {

	private static String file2 = "D:\\Desktop\\Tests\\prog2.jay";
	private static String file3 = "D:\\Desktop\\Tests\\prog3.jay";
	private static String file4 = "D:\\Desktop\\Tests\\prog4.jay";
	private static String file5 = "D:\\Desktop\\Tests\\prog5.jay";
	private static String file6 = "D:\\Desktop\\Tests\\prog6.jay";
	private static String file7 = "D:\\Desktop\\Tests\\prog7.jay";
			
	public static void main(String[] args) {
		TokenStream tStream = new TokenStream(file2);
		System.out.println("test1");
		ConcreteSyntax cSyntax = new ConcreteSyntax(tStream);
		System.out.println("test2");
		Program p = cSyntax.program();
		System.out.println(p.display());
		System.out.println("test");
	}

}
