package uni.iit.miskolc.lukacs6.ApplicationRegistry.PersistImpl.converter;

import uni.iit.miskolc.lukacs6.ApplicationRegistry.PersistImpl.entity.TemplateEntity;
import uni.iit.miskolc.lukacs6.ApplicationRegistry.Model.Template;

public final class TemplateEntityConverter {

	private TemplateEntityConverter() {
	}

	public static Template convertTemplateEntityToModel(TemplateEntity templateEntity) {
		Template template = new Template();
		
		template.setTitle(templateEntity.getTitle());
		template.setValue(templateEntity.getValue());
		template.setRecipient(templateEntity.getRecipient());

		return template;
	}
	public static Template convertTemplateToEntity(Template template) {
		TemplateEntity templateEntity = new TemplateEntity();
		
		templateEntity.setTitle(template.getTitle());
		templateEntity.setValue(template.getValue());
		templateEntity.setRecipient(template.getRecipient());

		return template;
	}
}
