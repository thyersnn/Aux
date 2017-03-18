package Auxilium;
import Service.ConversationApi;
import java.util.*;
import Model.Resposta;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws Exception {
    {   
    	
    	Resposta pergunta = new Resposta();
    	pergunta.setDescResposta("Teste");
    	
    	Resposta Result =  ConversationApi.GetResposa(pergunta);
    	 Result =  ConversationApi.GetResposa(pergunta);
    
        System.out.println( "Hello World!" );
    }
}
}
