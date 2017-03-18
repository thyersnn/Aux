package Service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import Model.Resposta;  
@Path("/RespostaService") 

public class RespostaService {  
	
	@GET 
	@Path("/resposta") 
	@Produces(MediaType.APPLICATION_XML) 
	public Resposta getResposta(){ 
		Resposta resposta = new Resposta();
		
		return resposta;
	}  
	   
}