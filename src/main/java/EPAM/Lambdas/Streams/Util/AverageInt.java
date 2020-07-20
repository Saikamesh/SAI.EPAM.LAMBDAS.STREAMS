package EPAM.Lambdas.Streams.Util;

import java.util.*;

public class AverageInt {
	public Double averageOfIntegers(List<Integer> list) {
		OptionalDouble average = list.stream().mapToInt(value -> value).average();
		return average.isPresent() ? average.getAsDouble() : null;
	}
}
