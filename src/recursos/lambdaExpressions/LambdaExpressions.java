package recursos.lambdaExpressions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LambdaExpressions {
	public static void main(String[] args) {
		List<Integer> numeros = new ArrayList<>(Arrays.asList(5, 2, 8, 1, 3));

//		NEW
		Collections.sort(numeros, (a, b) -> a.compareTo(b));
		System.out.println("Ordenação com lambda: " + numeros);

//		OLD
		Collections.sort(numeros, new Comparator<Integer>() {
			@Override
			public int compare(Integer a, Integer b) {
				return a.compareTo(b);
			}
		});
		System.out.println("Ordenação tradicional: " + numeros);
	}
}
