import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class main {

	public static void main(String[] args) {
		List<Integer> lista = Arrays.asList(3, 4, 1 ,3 ,4, 6, 1 , 4);
		
		String collectSt = lista.stream()
		 .skip(2)	//skip ignora uma quantidade de dados do stream (vai ignorar os 2 primeiros registros)
		 //.limit(1)	//define o limite de dados a serem processados (vai processar só o primeiro registro)
		 .distinct() // não permite o processamento de dados repitidos (hashcode equals)
		 .filter(e -> e % 2 == 0)	//um filtro mais especifico
		 .map(e -> String.valueOf(e)) //o mep não é um filtro como os de cime, ele é para modificar os registros *não modifica a lista original
		 // ^ transformei os valores para string
		 
		 .collect(Collectors.joining()); // joining retorna uma string com os registros cocatenados
		
		System.out.println(collectSt);
	}

}
