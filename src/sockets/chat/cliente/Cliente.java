package sockets.chat.cliente;

import java.io.IOException;
import java.net.UnknownHostException;

public class Cliente {
	public static void main(String[] args)	throws UnknownHostException,	IOException {
		new Cliente_descricao("127.0.0.1", 12345).executa();
                //new Cliente_descricao("192.168.0.15", 12345).executa();
	}
}