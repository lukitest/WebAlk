package uni.iit.miskolc.lukacs6.ApplicationRegistry.Service;

import uni.iit.miskolc.lukacs6.ApplicationRegistry.Model.Template;
import uni.iit.miskolc.lukacs6.ApplicationRegistry.Persist.exception.InvalidTemplateException;

public interface TemplateService {

	Template getTemplateByTitle(String title) throws InvalidTemplateException;

	void createTemplate(String title, String value, String recipient) throws InvalidTemplateException;

}
