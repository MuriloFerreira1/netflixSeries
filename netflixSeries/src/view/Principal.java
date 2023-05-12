package view;

import controller.netflixController;

public class Principal {

	public static void main(String[] args) {
		netflixController n = new netflixController();
		try {
			n.gerarArquivosGenero();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
