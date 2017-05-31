package uni.iit.miskolc.lukacs6.ApplicationRegistry.Persist;
import uni.iit.miskolc.lukacs6.ApplicationRegistry.Model.Template;
import uni.iit.miskolc.lukacs6.ApplicationRegistry.Persist.exception.InvalidTemplateException;
public interface TemplateDao {
	
	Template getTemplateByTitle(String title);	
	void createTemplate(Template template) throws InvalidTemplateException;

}
