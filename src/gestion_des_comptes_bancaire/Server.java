package gestion_des_comptes_bancaire;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;



public class Server {
	static ArrayList<Compte> listeComptes ;
	
	public static void main(String[] args) throws IOException {
		listeComptes = new ArrayList<Compte>();
		
		ServerSocket soc = new ServerSocket(5000);
		System.out.println("server creer");
		while(true) {
			
		Socket sc =soc.accept();
		Traitement tr = new Traitement(sc);
		tr.start();
		}
	}
}
