/**Classe para objetos do tipo ManipularString, onde terá,
 * uma variável do tipo String e métodos para manipulá-la.
 * @author Fabiano de Araujo
 * @version 1.0
 * @since Release 01 da aplicação
 */
public class ManipularString {
	private String s;
        
        /**Método para pegar a primeira letra da String
        * @author fabiano         
        * @return char - primeira letra da String
        */
        
	public char getFistLetter(){
		return s.charAt(0);
	}
        
        /**Método para pegar a última letra da String
        * @author fabiano         
        * @return char - última letra da String
        */
        
	public char getLastLetter(){
		return s.charAt(s.length()-1);
	}
        
        /**Método para verficar se contém a String passada por parâmetro na variável s
        * @author fabiano         
        * @param  l String - valor para verificar.
        * @return boolean - Contém ou não
        */
        
	public boolean ContemLetra(String l){
		return s.contains(l);
	}
}
