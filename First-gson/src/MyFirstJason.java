import java.util.Date;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class MyFirstJason {

	public static void main(String[] args) {

		EscolaDeSamba escolaDeSamba = new EscolaDeSamba("Vai vai", "Neno", "Clélia", new Date());
//		escolaDeSamba.setNome("Vai vai");
//		escolaDeSamba.setNomeMestreSala("Neno");
//		escolaDeSamba.setPortaBandeira("Clélia");
//		escolaDeSamba.setDataFundacao(new Date());

//		System.out.println(escolaDeSamba);
		
		
		Titulo titulo1 = new Titulo("Ganhamos pela primeira vez, nem da para acreditar", new Date());
		escolaDeSamba.getTitulos().add(titulo1);
		

//		Precisa fazer para conseguir utilizar a biclioteca GSON
		GsonBuilder builder = new GsonBuilder().setDateFormat("yyyy-MM-dd:mm:ssX");
		Gson gson = builder.create();

		String jsonOutput = gson.toJson(escolaDeSamba);

		System.out.println(jsonOutput);

		String jsonInput = "{\"nome\":\"Gaviões da Fiel\",\"nomeMestreSala\":\"Wagner Lima\",\"portaBandeira\":\"Gabriela Mondjian\",\"dataFundacao\":\"1969-07-01T00:00:00-03\"}";

		EscolaDeSamba escolaDeSambaFromJson = gson.fromJson(jsonInput, EscolaDeSamba.class);

		System.out.println(escolaDeSambaFromJson);
	}

}
