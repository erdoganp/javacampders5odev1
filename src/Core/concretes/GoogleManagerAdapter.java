package Core.concretes;

import Core.abstracts.AuthService;
import JExternalService.GoogleManager;

public class GoogleManagerAdapter implements AuthService {

	@Override
	public void registerToSystem(String message) {
		
		GoogleManager googleManager  = new GoogleManager();
		googleManager.register(message);
		
	}

}
