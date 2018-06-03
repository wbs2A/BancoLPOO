package controller;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

import java.io.File;
/*
 * Classe que representa os processo de serializacao e deserializacao de objetos.
 * @author: Nathaly.
 * @author: Wesley B.
 */

abstract class DAO<T>{
    
    /*
    * Metodo para Deserializar um objeto dado seu tipo como parametro.
    *  Ele carrega o objeto encontrado no arquivo do FileInputStream e
    *  e registra as excecoes no Logger da classe.
    * @author: Wesley B.
    * @param: Tipo do objeto, que nomeara o arquivo.
    * @return: Objeto a ser convertido para a classe correta.
    */
    public static Object carregar(String type){
        String PATH = DAO.ensuresPath(type);
        FileInputStream fis;
        Object obj = null;
        if(PATH != null){
	        try{
	        	fis = new FileInputStream(PATH);	
	        	ObjectInputStream ois = new ObjectInputStream(fis);
	            obj = (Object)ois.readObject();
	            ois.close();
	            return obj;
	        } catch (FileNotFoundException ex) {
	            Logger.getLogger(DAO.class.getName()).log(Level.SEVERE, null, ex);
	            return null;
	        } catch (ClassNotFoundException | IOException ex) {
	            Logger.getLogger(DAO.class.getName()).log(Level.SEVERE, null, ex);
	            return null;
	        }
        }else{
        	descarregar(obj);
        	return obj;
        }
    }

    /*
    * Metodo para garantir o caminho e a criacao de um arquivo binario,
    *  cujo nome e o tipo do objeto a ser serializado. Este metodo per-
    *  mite que a aplicacao persista classes em mais de uma plataforma.
    *  As excecoes sao tratadas pelas classes que a utilizam.
    * @author: Wesley B.
    * @param: Tipo do objeto, que nomeara o arquivo.
    * @return: Caminho concatenado com o nome do arquivo a ser utilizado.
    */
    public static String ensuresPath(String type){
        String resourcePath = null;
        String home = System.getProperty("user.home");
        boolean directoryExists;
        System.out.println(type);
        if(System.getProperty("os.name").toLowerCase().contains("windows")){
        	File f = new File(home + "\\BancoLPOO\\app\\");
        	directoryExists = f.exists();
        	if(!directoryExists)
        		f.mkdirs();
	            resourcePath = home + "\\BancoLPOO\\app\\"+type+".dat";
	        }else{
	            File f = new File(home + "/BancoLPOO/app/");
	            directoryExists = f.exists();
	            if(!directoryExists)
	                f.mkdirs();
	            resourcePath = home + "/BancoLPOO/app/"+type+".dat";
	        }
        return resourcePath;
    }

    /*
    * Metodo para Serializar um objeto dado como parametro.
    *  Ele descarrega o objeto no arquivo criado com o
    *  FileInputStream e registra as excecoes no Logger da classe.
    * @author: Wesley B.
    * @param: Objeto a ser serializado.
    * @return: Booleano informando o resultado da operacao.
    */

    public static boolean descarregar(Object obj){
        String PATH = DAO.ensuresPath(obj.getClass().getName());
        try{
        	FileOutputStream fos = new FileOutputStream(PATH);	
        	ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(obj);
            oos.close();
            return true;
            
        } catch (IOException ex) {
            Logger.getLogger(DAO.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
    
    /*
    * Metodo utilizado para converter o objeto lido do arquivo
    *  num dos tipos utilizados no sistema.
    * @author: Wesley B.
    * @param: Objeto a alterar-se com o cast.
    * @return: Objeto no tipo solicitado.
    */
    @SuppressWarnings("unchecked")
    public static <T> T castTo(Object obj) {
        return (T) obj;
    }
}
