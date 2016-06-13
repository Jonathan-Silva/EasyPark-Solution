
package Controller;

import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.HtmlEmail;

public class Ctrl_Email {
    public static void EnviarEmail(String CorpoMsg, String destinatario, String Assunto) throws EmailException{
        String html = new  String();
        html = "\n" +
                "	<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\n" +
                "<html xmlns=\"http://www.w3.org/1999/xhtml\" lang=\"pt-br\" xml:lang=\"pt-br\">\n" +
                "  <head>\n" +
                "    <meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\"/>\n" +
                "    <meta name=\"viewport\" content=\"width=device-width, initial scale=1.0\"/>\n" +
                "	\n" +
                "    <title>EasyPark</title>\n" +
                "	<style type=\"text/css\">\n" +
                "    .ExternalClass {width:100%;}\n" +
                "    .ExternalClass, .ExternalClass td {line-height: 100%;}\n" +
                "    table {border-collapse: collapse; mso-table-lspace:0pt; mso-table-rspace:0pt; }\n" +
                "    table td {border-collapse: collapse;}\n" +
                "    td {margin: 0; padding: 0; font-size: 0px; line-height: 0px;}\n" +
                "    img {display: block; max-width: 100%; outline: none; text-decoration: none; -ms-interpolation-mode: bicubic;}\n" +
                "	@media only screen and (max-width: 600px) {\n" +
                "    table[class=\"content-wrap\"] {\n" +
                "    width: 70%!important;\n" +
                "	@media print { }\n" +
                "	@media only screen and (min-width: 480px) {body { font-size: 60%; }}\n" +
                "	@media only screen and (min-width: 600px) {body { font-size: 70%; }}\n" +
                " \n" +
                "	@media only screen and (-webkit-min-device-pixel-ratio: 1.5),\n" +
                "	only screen and (min--moz-device-pixel-ratio: 1.5),\n" +
                "	only screen and (-o-min-device-pixel-ratio: 3/2),\n" +
                "	only screen and (min-device-pixel-ratio: 1.5) { }\n" +
                "  }\n" +
                "}	\n" +
                "  </style>\n" +
                "  </head>\n" +
                "  <body style=\"margin:0 !important; background-color:#0C0C0C !important\">\n" +
                "	<table id=Corpo width =\"100%\" cellpadding=\"0\" cellspacing=\"0\" border=\"0\" style=\"background-color:#0C0C0C; min-height: 600; min-width: 250px\">\n" +
                "	<!-- Borda Superior -->\n" +
                "	<tr>\n" +
                "		<td width=\"100%\" height=\"25\" style=\"background-color:#0C0C0C; min-height: 25px !important; min-width: 150px\">\n" +
                "		\n" +
                "		</td>\n" +
                "	</tr>\n" +
                "	<!-- Espaço antes da Logo -->\n" +
                "	<tr>\n" +
                "		<td width=\"100%\" height=\"30\" style=\"background-color:#1e1e1e; min-heigth:30px !important; min-width: 150px\">\n" +
                "		\n" +
                "		</td>\n" +
                "	</tr>\n" +
                "	<!-- Logo do E-Mail -->\n" +
                "	<tr>\n" +
                "		<td width=\"100%\" style=\"background-color:#1e1e1e\">	\n" +
                "		<h1 style=\"background-color:#1e1e1e; padding: 5px 0px 5px 0px; margin:0px 0px 0px 0px; font-style: normal;font-weight: normal;color: #8E9092; font-size: 38px;line-height: 20px;text-align: center; font-family:monospace; min-height: 15px; min-width: 250px\">\n" +
                "		EasyPark\n" +
                "		</h1>			\n" +
                "		</td>\n" +
                "	</tr>\n" +
                "	<!-- Espaço antes do Corpo -->\n" +
                "	<tr>\n" +
                "		<td width=\"100%\" height=\"30\" style=\"background-color:#1e1e1e; min-height: 30px !important;  min-width: 150px\">\n" +
                "		\n" +
                "		</td>\n" +
                "	</tr>\n" +
                "	<!-- Corpo do E-Mail -->	\n" +
                "	<tr>\n" +
                "		<td width=\"100%\" height=\"190\" style=\"background-color:#1e1e1e; padding : 0 10%; min-width: 150px \"> \n" +
                "		<table width=\"100%\" cellpadding=\"0\" cellspacing=\"0\" border=\"0\" align=\"center\" class=\"content-wrap\" height=\"190\" style=\"background-color:#212A32; min-width: 350px \">\n" +
                "			<tr>\n" +
                "				<td width=\"100%\" height=\"30\">\n" +
                "				<h1 style=\"background-color:#212A32; padding: 20px 0px 0px 0px; margin:0px 0px 0px 0px; font-style: normal;font-weight: normal;color: #d49344; font-size: 25px;line-height: 20px;text-align: center; text-justify: inter-word; font-family:monospace; min-height: 15px; min-width: 250px\">\n" +
                "				Sistema EasyPark Informa !\n" +
                "				</h1>\n" +
                "				</td>\n" +
                "			</tr>\n" +
                "			<tr>\n" +
                "				<td width=\"100%\" height=\"100\">\n" +
                "				<h1 style=\"background-color:#212A32; padding: 20px 25px 20px 25px; margin:0px 0px 0px 0px; font-style: normal;font-weight: normal;color: #F1ECEC; font-size: 20px;line-height: 20px;text-align: center; font-family:monospace; min-height: 15px; min-width: 250px\">\n" +
                
                 CorpoMsg.replace("À", "&#192").replace("Á", "&#193").replace("Â", "&#194").replace("Ã", "&#195").replace("Ä", "&#196").replace("Å", "&#197").replace("Ç", "&#199").replace("È", "&#200").replace("É", "&#201").replace("Ê", "&#202").replace("Ë", "&#203").replace("Ì", "&#204").replace("Í", "&#205").replace("Î", "&#206").replace("Ï", "&#207").replace("Ñ", "&#209").replace("Ò", "&#210").replace("Ó", "&#211").replace("Ô", "&#212").replace("Õ", "&#213").replace("Ö", "&#214").replace("Ù", "&#217").replace("Ú", "&#218").replace("Û", "&#219").replace("Ü", "&#220").replace("Ý", "&#221").replace("à", "&#224").replace("á", "&#225").replace("â", "&#226").replace("ã", "&#227").replace("ä", "&#228").replace("å", "&#229").replace("ç", "&#231").replace("è", "&#232").replace("é", "&#233").replace("ê", "&#234").replace("ë", "&#235").replace("ì", "&#236").replace("í", "&#237").replace("î", "&#238").replace("ï", "&#239").replace("ñ", "&#241").replace("ò", "&#242").replace("ó", "&#243").replace("ô", "&#244").replace("õ", "&#245").replace("ö", "&#246").replace("ù", "&#249").replace("ú", "&#250").replace("û", "&#251").replace("ü", "&#252").replace("ý", "&#253").replace("ÿ", "&#255") +
                "				</h1>\n" +
                "				</td>\n" +
                "			</tr>\n" +
                "			<tr>\n" +
                "				<td width=\"100%\" height=\"20\">\n" +
                "			\n" +
                "				</td>\n" +
                "			</tr>\n" +
                "		</table>\n" +
                "		</td>\n" +
                "	<!-- Fundo do E-Mail -->\n" +
                "	</tr>\n" +
                "		<tr>\n" +
                "		<td width=\"100%\" height=\"100\" style=\"background-color:#1e1e1e; min-height: 60px !important; min-width: 150px\">\n" +
                "		\n" +
                "		</td>\n" +
                "	</tr>\n" +
                "	</tr>\n" +
                "		<tr>\n" +
                "		<td width=\"100%\" height=\"100\" style=\"background-color:#0C0C0C; min-height: 100px !important; min-width: 150px\">\n" +
                "		\n" +
                "		</td>\n" +
                "	</tr>\n" +
                "	</table>\n" +
                "  </table>\n" +
                "  </table>\n" +
                "  </body>\n" +
                "</html>";
    Enviar(html ,destinatario, Assunto);
    }

    private static void Enviar(String html, String destinatario, String Assunto) throws EmailException{
        HtmlEmail email= new HtmlEmail();
        email.setSmtpPort(587);
        email.setHostName("smtp.live.com");
        email.setAuthentication("easypark62@hotmail.com","k78b9c7de");
        email.setStartTLSEnabled(true);
        email.setDebug(true);
        email.setFrom("easypark62@hotmail.com");
        email.setSubject("EasyPark - " + Assunto);
        email.setHtmlMsg(html);
        email.addTo(destinatario);
        email.send();
     }  
}
