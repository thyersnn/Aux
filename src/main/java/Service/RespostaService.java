package Service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import Model.Resposta;  
public class RespostaService {  
	
	@GET 
	@Path("/resposta") 
	@Produces(MediaType.APPLICATION_XML) 

	public Resposta getResposta(@QueryParam(value = "r") String perguntaParametro)throws Exception {
		
		Resposta pergunta = new Resposta();
		pergunta.setDescResposta(perguntaParametro);
		
		return ConversationApi.GetResposa(pergunta);


	}  
  
}