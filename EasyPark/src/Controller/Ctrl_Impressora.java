
package Controller;

import br.com.daruma.jna.DUAL;
import br.com.daruma.jna.UTIL;

public class Ctrl_Impressora {
    public static void ImprimirTexto(String Texto){

       
        DUAL.iImprimirTexto("<sl>3</sl>", 0); 
        DUAL.iImprimirTexto("<ce><qrcode>https://www.facebook.com/mateusrodriguesfuzetto?fref=ts</qrcode></ce>", 0);
        DUAL.iImprimirTexto("<sl>3</sl>", 0); 
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
