
/**Classe para objetos do tipo Operacao, onde serão contidas,
 * duas variáveis do tipo int, que serão usadas para as operações matemáticas.
 * @author Jefferson
 * @version 1.0
 * @since Release 01 da aplicação
 */

public class Operacao {
	private int n1;
	private int n2;
        
        /**Método para somar as variáveis n1 e n2
        * @author Marcos        
        * @return int - resultado da soma
        */
        
	public int somar(){
		return n1+n2;
	}
        
        /**Método para multiplicar as variáveis n1 e n2
        * @author Jefferson        
        * @return int - resultado da multiplicação
        */
        
	public int multiplicar(){
		return n1*n2;
	}
        
        /**Método para subtrair as variáveis n1 e n2
        * @author Marcos        
        * @return int - resultado da subtração
        */
        
	public int subtrair(){
		return n1-n2;
	}
        
        /**Método para dividir as variáveis n1 e n2
        * @author Jefferson        
        * @return int - resultado da divisão
        */
        
	public int dividir(){
		return n1/n2;
	}
}
