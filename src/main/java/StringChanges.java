public class StringChanges {
	public static void main(String[] args) {
		System.out.println("Hello %s!".formatted("World")); // Hello World!

		var s1 = "    foo\n   bar";
		System.out.println(s1.stripIndent());
	}
}
