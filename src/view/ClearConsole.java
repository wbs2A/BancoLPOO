package view;

/**
 * Classe responsavel por limpar a tela
 * @author michael_douglas
 *
 */
public class ClearConsole {
	
	/**
	 * Metodo que verifica qual o sistema (linux ou windows) para limpar a tela de acordo com o sistema operacional.
	 */
	public final static void clearConsole(){

        try{
            final String os = System.getProperty("os.name");

            if (os.contains("Windows")){
                Runtime.getRuntime().exec("cls");

            }else{
                Runtime.getRuntime().exec("clear");
            }
        }
        catch (final Exception e){
        //  Tratar Exceptions
        }
    }
}
