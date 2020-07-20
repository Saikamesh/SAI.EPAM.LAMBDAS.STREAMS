package EPAM.Lambdas.Streams.Util;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class PalindromeStr {
	private static boolean isPalindrome(String str) {
		String tempStr = str.replaceAll("\\s", "").toLowerCase();
		return IntStream.range(0, tempStr.length() / 2)
				.noneMatch(i -> tempStr.charAt(i) != tempStr.charAt(tempStr.length() - i - 1));
	}

	public List<String> filterpalindromes(List<String> list) {
		return list.stream().filter(str -> isPalindrome(str)).collect(Collectors.toList());
	}
}
