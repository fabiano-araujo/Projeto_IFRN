
/**Classe para objetos do tipo Converter, onde terá,
 * uma variável do tipo String e métodos para convertê-la.
 * @author Fabiano de Araujo
 * @version 1.0
 * @since Release 01 da aplicação
 */

public class Converter {
	private String s;
        
        /**Método para converter de String para double
        * @author Alice         
        * @return double - Valor convertido
         */
        
	public double converterParaDouble(){
		return Double.parseDouble(s);
	}
        
        /**Método para converter de String para int
        * @author Jefferson         
        * @return int - Valor convertido
         */
        
	public int converterParaInt(){
		return Integer.parseInt(s);
	}
        
        /**Método para converter de String para float
        * @author Jefferson         
        * @return float - Valor convertido
         */
        
	public float converterParaFloat(){
		return Float.parseFloat(s);
	}
}
