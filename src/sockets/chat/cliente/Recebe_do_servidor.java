package sockets.chat.cliente;
import java.io.InputStream;
import java.util.Scanner;

class Recebe_do_servidor implements Runnable {

	private InputStream servidor;

	public Recebe_do_servidor(InputStream servidor) {
		this.servidor = servidor;
	}

        @Override
	public void run() {
		try(Scanner s = new Scanner(this.servidor)){
			while (s.hasNextLine()) {
				System.out.println(s.nextLine());
			}
		}
	}
}
