/**Classe para objetos do tipo ShowMensage, onde serão contidos,
 * variáveis e métodos para mostrar as mensagens no terminal.
 * @author Fabiano de Araujo
 * @version 1.0
 * @since Release 01 da aplicação
 */
public class ShowMensage {
	private String m;
	private String s;
        
        
        /** Método para mostrar no terminal a variável m
        *@author Alice        
        */
        
	public void show(){
		System.out.println(m);
	}
        
        /** Método para concatenar e mostrar no terminal as variáveis m e s
        * @author Alice        
        */
        
	public void ConcatenarEMostrar(){
		System.out.println(m+s);
	}
        
        /** Método para verificar se as variáveis m e s são íguais
        * em seguida mostra o resultado no terminal
        * @author Alice        
        */
	public void igual(){
		System.out.println(m.equals(s));
	}
}
