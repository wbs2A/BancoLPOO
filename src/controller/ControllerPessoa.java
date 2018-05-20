

import java.util.ArrayList;
import java.util.Objects;

/**
 *
 * @author Harrison
 */
public class ControllerPessoa {

    /**
     * método para a criação de um array de Pessoas
     *
     * @param lista
     * @param pessoas
     * @return
     *
     */
    public static ArrayList<Pessoa> criar(ArrayList<Pessoa> lista, Pessoa pessoas) {

        lista.add(pessoas);

        return lista;
    }
    
    /**
     * Metodo do tipo boolean utilizado para fazer a remoção de um usuario
     * @param lista
     * @param id
     * @return 
     */

    
    public static boolean remove (ArrayList<Pessoa> lista, Long id){
        
       for (Pessoa p : lista){
           if (Objects.equals(p.getId(), id)){
              return lista.remove(p);
           }
       } 
        return false;
        
        
    }

    /**
     *
     * Metodo do tipo pessoa utilizado para buscar pessoas da lista
     *
     * @param lista
     * @param id
     * @return
     */
    public static Pessoa busca(ArrayList<Pessoa> lista, Long id) {

        for (Pessoa p : lista) {
            if (Objects.equals(p.getId(), id)) {
                return p;
            }

        }

        return null;

    }

   /*
    *
    *metodo para imprimir todas as pessoas da lista
    */
    
    public static void mostra(ArrayList<Pessoa> lista) {
        if (lista.isEmpty()) {
            System.out.println("Lista Vazia");
        } else {
            for (Pessoa p : lista) {
                System.out.println(p);
            }
        }
    }

}
