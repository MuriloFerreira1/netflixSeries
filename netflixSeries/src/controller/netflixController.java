package controller;

import java.io.*;
import br.edu.fateczl.lista.listaObj.Lista;
import model.Serie;
import br.edu.fateczl.filaobj.Fila;

public class netflixController implements iNetflixController {
	
	private File Netflix = new File("C:\\TEMP","netflixSeries.csv");
	

	@Override
	public void gerarArquivosGenero() throws Exception {
		Fila majorGenre=geraFila();
		String genero="";
		File arquivo=new File("C:\\TEMP");
		FileWriter writer = new FileWriter(arquivo);
		String linha="";
		while(!majorGenre.isEmpty()){
			Serie buffer = (Serie) majorGenre.remove();
			if(!genero.equals(buffer.majorGenre)) {
				genero=buffer.majorGenre;
				arquivo = new File("C:\\TEMP",genero+".csv");
				String cabecalho="Major Genre;Title;Subgenre;Premiere Year;Episodes;imdb Rating";
				writer.append(cabecalho);
			}
			linha=buffer.toString();
			writer.append(linha);
		}
	}

	@Override
	public void gerarArquivosAno() throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void gerarTabelaImdb() throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void buscarTabela() throws Exception {
		// TODO Auto-generated method stub
		
	}

	private Fila geraFila() throws IOException{
		Fila f = new Fila();
		FileInputStream fluxo = new FileInputStream(Netflix);
		InputStreamReader reader = new InputStreamReader(fluxo);
		BufferedReader buffer = new BufferedReader(reader);
		buffer.readLine();
		String linha = buffer.readLine();
		String[] elementos;
		while (linha!=null) {
			elementos = linha.split(";");
			System.out.println(elementos[0]);
			Serie s = new Serie(elementos[0], elementos[1], elementos[2], 
					Integer.parseInt(elementos[4]), elementos[9], 
					elementos[6], Integer.parseInt(elementos[11]));
			f.insert(s);
			linha = buffer.readLine();
		}
		buffer.close();
		reader.close();
		fluxo.close();
		return f;
	}
	
	private Lista geraLista() throws IOException{
		Lista l=new Lista();
		FileInputStream fluxo = new FileInputStream(Netflix);
		InputStreamReader reader = new InputStreamReader(fluxo);
		BufferedReader buffer = new BufferedReader(reader);
		buffer.readLine();
		String linha = buffer.readLine();
		String[] elementos;
		while (linha!=null) {
			elementos = linha.split(";");
			
		}
		buffer.close();
		reader.close();
		fluxo.close();
		return l;
	}


}
