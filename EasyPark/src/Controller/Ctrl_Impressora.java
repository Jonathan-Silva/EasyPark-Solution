
package Controller;

import br.com.daruma.jna.DUAL;
import br.com.daruma.jna.UTIL;

public class Ctrl_Impressora {
    public static void ImprimirTexto(Ctrl_Venda Venda, String Nome){

        Ctrl_Impressora.CarregarDarumaFrameWork();
        
        DUAL.iImprimirTexto("<ad>EasyPark ©</ad>",0);
        DUAL.iImprimirTexto("<tc>=</tc>",0);
        DUAL.iImprimirTexto("<b><e><ce>Centercar Estacionamento</ce></e></b>",0);
        DUAL.iImprimirTexto("CNPJ:08.714.106/0001-69",0);
        DUAL.iImprimirTexto("Telefone:(18) 3621-8820",0);
        DUAL.iImprimirTexto("<tc>=</tc>",0);
        DUAL.iImprimirTexto("<s><b><e><ce>ENTRADA</ce></e></b></s>",0);
        DUAL.iImprimirTexto("Responsavel: "+Nome,0);
        DUAL.iImprimirTexto("Id Pessoal: "+ Venda.getId_Motorista(),0);
        DUAL.iImprimirTexto("Codigo da entrada: "+ Venda.getId(),0);
        DUAL.iImprimirTexto("Data: <dt></dt>", 0);
        DUAL.iImprimirTexto("Hora: <hr></hr>", 0);
        DUAL.iImprimirTexto("<l></l>", 0); 
        DUAL.iImprimirTexto("Visite nosso site:",0);
        DUAL.iImprimirTexto("<sl>1</sl>", 0);
        DUAL.iImprimirTexto("<ce><qrcode>https://www.facebook.com/mateusrodriguesfuzetto?fref=ts</qrcode></ce>", 0);
        DUAL.iImprimirTexto("<l></l>", 0); 
        DUAL.iImprimirTexto("<tc>-</tc>",0);
        DUAL.iImprimirTexto("<ce><code128>"+ Venda.getId() +"</code128></ce>",0);
        DUAL.iImprimirTexto("<l></l>", 0);     
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
