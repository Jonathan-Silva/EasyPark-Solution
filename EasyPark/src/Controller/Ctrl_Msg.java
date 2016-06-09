
package Controller;

import javax.swing.JOptionPane;

public class Ctrl_Msg {
    public static String MsgQuestiona = "EasyPark Questiona:";
    public static String MsgInforma = "EasyPark Informa:";
    public static String MsgQLimpar = "Deseja limpar todos os campos?  "; 
    public static String MsgNaoFazer = "Não há nada a fazer.  ";  
    public static String MsgQFechar = "Deseja realmente sair? "; 
    public static String MsgQFecharS = "Deseja fechar o sistema ? "; 
    public static String MsgQSalvar = "Deseja salvar esse registro ?";
    public static String MsgQDeletar = "Deseja excluir esse registro ?";
    public static String MsgQEditar = "Deseja editar esse registro ?";
    public static String MsgIDeledado = "Registro deletado com sucesso.";
    public static String MsgISalvo = "Registro salvo com sucesso.";
    public static String MsgICampos = "Há campos não preenchidos";
    public static String MsgIEditado = "Registro alterado com sucesso.";
    public static String MsgErro = "Lamentamos informar, mas não foi possivel completar essta operação :(. Falha na comunicação com o banco de dados. Por favor entre em contato com a equipe de desenvolvimento.";   
    public static String MsgIEdicao = "Para editar ou deletar um registro você deve clicar em 'EDITAR' primeiro.";
    public static String MsgVagaEmUso = "Lamentamos em informar, mas está vaga já esta em uso. :(";
    public static String MsgJaExiste = "Este registro já existe.";
    public static String MsgSelecioneCliente = "Por favor selecione um cliente.";

     
    public static boolean  Questiona(String msg){
        
        Object[] botoes = {"Sim", "Não"};
        int resp = JOptionPane.showOptionDialog(
            null,
            msg,
            Ctrl_Msg.MsgQuestiona,
            JOptionPane.DEFAULT_OPTION,
            JOptionPane.WARNING_MESSAGE,
            null,
            botoes,
            botoes[1]
        );
        if (resp == 0)
        {
             return true;
        }
        else
        {
             return false;
        } 
    }
    
        public static void  Informa(String msg){
        
        Object[] botoes = {"Ok"};
        int resp = JOptionPane.showOptionDialog(
            null,
            msg,
            Ctrl_Msg.MsgInforma,
            JOptionPane.DEFAULT_OPTION,
            JOptionPane.INFORMATION_MESSAGE,
            null,
            botoes,
            botoes[0]
        );
      
    }
}

