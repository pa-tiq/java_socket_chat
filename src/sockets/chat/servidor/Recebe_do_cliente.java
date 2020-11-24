package sockets.chat.servidor;

import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

class Recebe_do_cliente implements Runnable {

	private Socket cliente;
	private Servidor_descricao servidor;

	public Recebe_do_cliente(Socket cliente, Servidor_descricao servidor) {
		this.cliente = cliente;
		this.servidor = servidor;
	}

        @Override
	public void run() {
		try(Scanner s = new Scanner(this.cliente.getInputStream())) {
			while (s.hasNextLine()) {
				servidor.distribuiMensagem(this.cliente, s.nextLine());
                                System.out.println("mensagem recebida: "+s.nextLine());
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}