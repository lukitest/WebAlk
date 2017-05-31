package uni.iit.miskolc.lukacs6.ApplicationRegistry.ServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import uni.iit.miskolc.lukacs6.ApplicationRegistry.Model.Template;
import uni.iit.miskolc.lukacs6.ApplicationRegistry.Persist.TemplateDao;
import uni.iit.miskolc.lukacs6.ApplicationRegistry.Persist.exception.InvalidTemplateException;
import uni.iit.miskolc.lukacs6.ApplicationRegistry.Service.TemplateService;

@Service
public class TemplateServiceImpl implements TemplateService {

	@Autowired
	private TemplateDao templateDao;

	public TemplateServiceImpl() {
	}

	@Override
	public Template getTemplateByTitle(String title) throws InvalidTemplateException {
		if (this.templateDao.getTemplateByTitle(title) == null) {
			throw new InvalidTemplateException();
		} else {
			Template template = this.getTemplateByTitle(title);
			return template;
		}
	}

	@Override
	public void createTemplate(String title, String value, String recipient) throws InvalidTemplateException {
		if(this.templateDao.getTemplateByTitle(title) != null) {
			throw new InvalidTemplateException();
		} else {
			Template template = new Template();
			template.setTitle(title);
			template.setValue(value);
			template.setRecipient(recipient);
			
			this.templateDao.createTemplate(template);
		}
	}

}
