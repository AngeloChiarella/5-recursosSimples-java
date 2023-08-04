package recursos.textBlocks;

public class TextBlocks {
	public static void main(String[] args) {
//		OLD
		String oldTextBlock = "<html>\n" + 
				" <body>\n" + 
				"  <em>Bad Java String Block</em>\n" + 
				" </body>\n" +
				"</html>\n";
//		NEW
		String newTextBlock = """
				<html>
				 <body>
				  <em>Bad Java String Block</em> 
				 </body>
				</html>
				""";
		System.out.println(oldTextBlock);
		System.out.println(newTextBlock);
	}
}
