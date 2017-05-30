package uni.iit.miskolc.lukacs6.ApplicationRegistry.Persist;
import uni.iit.miskolc.lukacs6.ApplicationRegistry.Model.Template;
public interface TemplateDao {
	
	Template getTemplateByName(String neptuncode);
	public void modifyTemplate(Template template);
	public void deleteTemplate(Template template);

}
