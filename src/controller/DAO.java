package controller;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;


/**
 * Classe que representa os processo de serializacao e deserializacao de
 * objetos.
 * 
 * @author: Nathaly.
 * @author: Wesley B.
 */

abstract class DAO<T> {

	/**
	 * Metodo para Deserializar um objeto dado seu tipo como parametro. Ele
	 * carrega o objeto encontrado no arquivo do FileInputStream e e registra as
	 * excecoes no Logger da classe.
	 * 
	 * @author: Wesley B.
	 * @param: Nome do arquivo
	 * @return: Objeto a ser convertido para a classe correta.
	 */
	public static Object carregar(String type) {

		try {
			FileInputStream fis = new FileInputStream(type);
			ObjectInputStream ois = new ObjectInputStream(fis);
			Object obj = (Object) ois.readObject();
			ois.close();
			return obj;
		} catch (FileNotFoundException ex) {
			
			return null;
		} catch (ClassNotFoundException | IOException ex) {
			return null;
		}

	}

	/**
	 * Metodo para Serializar um objeto dado como parametro. Ele descarrega o
	 * objeto no arquivo criado com o FileInputStream e registra as excecoes no
	 * Logger da classe.
	 * 
	 * @author: Wesley B.
	 * @param: Nome do arquivo e Objeto a ser serializado.
	 * @return: Booleano informando o resultado da operacao.
	 */

	public static boolean descarregar(String type, Object obj) {
		try {
			FileOutputStream fos = new FileOutputStream(type);
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(obj);
			oos.close();
			return true;

		} catch (FileNotFoundException ex) {
			
			return false;
		} catch (IOException ex) {
			
			return false;
		}
	}

	/**
	 * Metodo utilizado para converter o objeto lido do arquivo num dos tipos
	 * utilizados no sistema.
	 * 
	 * @author: Wesley B.
	 * @param: Objeto a alterar-se com o cast.
	 * @return: Objeto no tipo solicitado.
	 */
	@SuppressWarnings("unchecked")
	public static <T> T castTo(Object obj) {
		return (T) obj;
	}
}
