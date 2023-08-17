package recursos;

import java.util.Optional;

public class Java8_Optional {
	public static void main(String[] args) {

//		String s = "um";
		String s = "";
//		Optional<Integer> numero = converteEmNumero(s);
//		numero.ifPresent(n -> System.out.println(n));

//		ifPresent - um if disfarcado que retorna se tem valor ou null
		converteEmNumero(s).ifPresent(System.out::println);

//		orElse - Caso converter retorna o numero, caso nao retorna o dafault "2" (orElse)
		System.out.println(
				converteEmNumero(s)
				.orElse(2)
				);

//		orElseGet - igual orElse mas Recebe funcao Lambda
		System.out.println( 
				converteEmNumero(s)
				.orElseGet(() -> 5)
				);
		
//		orElseThrow - lanca Exception caso seja vazio
		System.out.println( 
				converteEmNumero(s)
				.orElseThrow(() -> new NullPointerException("Valor vazio!"))
				);
		
		
		
	}

	private static Optional<Integer> converteEmNumero(String numeroStr) {
		
		try {
			Integer integer = Integer.valueOf(numeroStr);
			return Optional.of(integer);
		} catch (Exception e) {
			return Optional.empty();
		}
//		return Optional.ofNullable(numeroStr);

	}
}
