package View;

import java.io.IOException;

import Controller.SteamController;

public class Principal {

	public static void main(String[] args) {

		String path = "C:\\Users\\User\\Desktop\\ExerciciocSteam";
		String nome = "SteamCharts.csv";
		SteamController cont = new SteamController(path, nome);
		try {
			cont.leitor();
		} catch (IOException e) {
			e.printStackTrace();
		}		
	}
}