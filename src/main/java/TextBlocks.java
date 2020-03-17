public class TextBlocks {
	public static void main(String[] args) {
		String TEXT_BLOCK_JSON = """
				{
				    "name" : "Baeldung",
				    "website" : "https://www.%s.com/"
				}
				""";
		System.err.println(TEXT_BLOCK_JSON);
	}
}
