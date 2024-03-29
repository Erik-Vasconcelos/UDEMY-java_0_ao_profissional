package br.edu.ifrn.portal.lv.infra;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class FabricaConexao {
	
	public static Connection getConexao() {
		try {
			
			Properties prop = FabricaConexao.getProperties();
			final String URL = prop.getProperty("banco.url");
			final String USUARIO = prop.getProperty("banco.usuario");
			final String SENHA = prop.getProperty("banco.senha");
			return DriverManager.getConnection(URL, USUARIO, SENHA);
			
		} catch (SQLException | IOException e) {
			throw new RuntimeException(e);
		}
		
	}
	
	public static Properties getProperties() throws IOException {
		Properties prop = new Properties();
		String caminho = "/conexao.properties";
		prop.load(FabricaConexao.class.getResourceAsStream(caminho));
		return prop;
	}
	
	/*N�o � uma boa pr�tica colocar as informa��es de conex�o dentro do seu c�digo, porque � uma falha de conex�o*/
}
