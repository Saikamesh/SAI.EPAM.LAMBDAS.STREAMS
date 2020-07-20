package EPAM.Lambdas.Streams.Util;

import java.util.*;
import java.util.stream.Collectors;

public class SubStr3a {

	public List<String> filter3astr(List<String> list) {
		return list.stream().filter(str -> str.startsWith("a")).filter(str -> str.length() == 3)
				.collect(Collectors.toList());
	}
}
