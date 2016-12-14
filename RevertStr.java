public class RevertStr {
	public static void main (String[] args) {
		System.out.println(inverse("hanchunlan"));
	}

	public static String inverse (String str) {
		char[] chars = str.toCharArray();
		for (int i = 0; i < chars.length / 2; i++) {
			char temp = chars[i];
			chars[i] = chars[chars.length - i - 1];
			chars[chars.length - i - 1] = temp;
		}
		return String.copyValueOf(chars);
	}
}