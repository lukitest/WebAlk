package uni.iit.miskolc.lukacs6.ApplicationRegistry.PersistImpl;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import uni.iit.miskolc.lukacs6.ApplicationRegistry.Model.Template;
import uni.iit.miskolc.lukacs6.ApplicationRegistry.Persist.TemplateDao;
import uni.iit.miskolc.lukacs6.ApplicationRegistry.Persist.exception.InvalidTemplateException;
import uni.iit.miskolc.lukacs6.ApplicationRegistry.PersistImpl.converter.TemplateEntityConverter;
import uni.iit.miskolc.lukacs6.ApplicationRegistry.PersistImpl.entity.TemplateEntity;

@Repository
@Transactional

public class TemplateDaoImpl implements TemplateDao {

	@PersistenceContext
	private EntityManager entityManager;

	public TemplateDaoImpl(){}

	@Override
	public Template getTemplateByTitle(String title) {
		String select = "SELECT t FROM Template t WHERE t.title = :title";
		TypedQuery<TemplateEntity> query = this.entityManager.createQuery(select, TemplateEntity.class);
		query.setParameter("title", title);
		
		TemplateEntity templateEntity = query.getSingleResult();
		
		return TemplateEntityConverter.convertTemplateEntityToModel(templateEntity);
	
	}

	@Override
	public void createTemplate(Template template) throws InvalidTemplateException {
		if (this.entityManager.find(TemplateEntity.class, template.getTitle()) != null) {
			TemplateEntity templateEntity = new TemplateEntity();

			templateEntity.setTitle(template.getTitle());
			templateEntity.setValue(template.getValue());
			templateEntity.setRecipient(template.getRecipient());
			
			this.entityManager.persist(templateEntity);
		} else {
			throw new InvalidTemplateException();
		}

	}

}
