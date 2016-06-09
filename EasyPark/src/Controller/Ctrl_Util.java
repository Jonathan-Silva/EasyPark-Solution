
package Controller;

import javax.swing.text.MaskFormatter;

public class Ctrl_Util {
    
   public static String IdCliente="";
   
   public static MaskFormatter Mascara(String Mascara){
        MaskFormatter F_Mascara = new MaskFormatter();
        try{
            F_Mascara.setMask(Mascara); //Atribui a mascara viu Lucas 
            F_Mascara.setPlaceholderCharacter(' '); //Caracter para preencimento viu Lucas 
        }
        catch (Exception excecao) {
        excecao.printStackTrace();
        } 
        return F_Mascara;
 }
    
}
