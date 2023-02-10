import java.util.Arrays;
import java.util.List;

public class main {

	public static void main(String[] args) {
		List<Integer> lista = Arrays.asList(3, 4, 1 ,3 ,4, 6, 1 , 4);
		
		lista.stream()
		 .skip(2)	//skip ignora uma quantidade de dados do stream (vai ignorar os 2 primeiros registros)
		 //.limit(1)	//define o limite de dados a serem processados (vai processar s� o primeiro registro)
		 .distinct() // n�o permite o processamento de dados repitidos (hashcode equals)
		 .filter(e -> e % 2 == 0)	//um filtro mais especifico
		 .map(e -> e * 2) //o mep n�o � um filtro como os de cime, ele � para modificar os registros *n�o modifica a lista original
		 .forEach(System.out::println);

	}

}
