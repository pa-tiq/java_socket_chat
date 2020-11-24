
package sockets.chat.servidor;

import java.io.IOException;

public class Servidor {

	public static void main(String[] args) 
			throws IOException {
		new Servidor_descricao(12345).executa();
	}
}