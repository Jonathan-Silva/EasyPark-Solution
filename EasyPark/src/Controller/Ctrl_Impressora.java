
package Controller;

import br.com.daruma.jna.DUAL;
import br.com.daruma.jna.UTIL;

public class Ctrl_Impressora {
    public static void ImprimirTexto(String Texto){

        DUAL.iImprimirTexto("<gui></gui>", 0);
                 
    }
    public static boolean CarregarDarumaFrameWork(){
        try {
            System.load("C:\\Projetos\\Solution\\EasyPark-Solution\\EasyPark\\src\\Libraries\\DarumaFrameWork.dll");
             UTIL.eDefinirProduto("DUAL");
            return true;
        } catch (Exception e) {
            return false;
        }
      
    }
}
