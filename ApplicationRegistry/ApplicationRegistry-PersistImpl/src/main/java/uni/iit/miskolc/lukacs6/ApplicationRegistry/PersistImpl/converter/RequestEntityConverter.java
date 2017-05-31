package uni.iit.miskolc.lukacs6.ApplicationRegistry.PersistImpl.converter;

import java.util.List;
import java.util.ArrayList;
import uni.iit.miskolc.lukacs6.ApplicationRegistry.Model.Request;
import uni.iit.miskolc.lukacs6.ApplicationRegistry.PersistImpl.entity.RequestEntity;

public class RequestEntityConverter {

	private RequestEntityConverter() {
	}
	public static Request convertRequestEntityToModel(RequestEntity requestEntity){
		Request request = new Request();
		request.setId(requestEntity.getId());
		request.setDate(requestEntity.getDate());
		//request.setUser(UserEntityConverter.convertUserEntityToModel(requestEntity.getUser());
		request.setStatus(requestEntity.getStatus());
		request.setComment(requestEntity.getComment());
		request.setTemplate(TemplateEntityConverter.convertTemplateEntityToModel(requestEntity.getTemplate()));
		request.setVerdict(requestEntity.getVerdict());
		
			
		return request;
	}
	
	public static List<Request> convertRequestEntitiesToModels(List<RequestEntity> requestEntities) {
		List<Request> requests = new ArrayList<>();
		
		for(RequestEntity requestEntity : requestEntities) {
			requests.add(convertRequestEntityToModel(requestEntity));
		}
		
		return requests;
	}

}
