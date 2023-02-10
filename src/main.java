import java.util.Optional;

public class main {

	public static void main(String[] args) {
		
		String s = "1";
		Optional<Integer> numero = converteEmNumero(s);
		numero.ifPresent(n -> System.out.println(n));
		
	}
	
	public static Optional<Integer> converteEmNumero(String numeroStr) {
		try {
			
			Integer integer = Integer.valueOf(numeroStr);
			return Optional.of(integer);
			
		} catch (Exception e) {
			return Optional.empty();
		}
	}
}