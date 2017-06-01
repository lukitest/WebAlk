package uni.iit.miskolc.lukacs6.ApplicationRegistry.Controller.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import uni.iit.miskolc.lukacs6.ApplicationRegistry.PersistImpl.*;
import uni.iit.miskolc.lukacs6.ApplicationRegistry.ServiceImpl.configuration.ServiceApplicationContextConfig;;

@EnableWebMvc
@Configuration
@ComponentScan("uni.iit.miskolc.lukacs6.ApplicationRegistry.Controller.configuration")
@Import({SecurityConfiguration.class, DaoApplicationContextConfig.class, ServiceApplicationContextConfig.class})
public class WebAppConfiguration extends WebMvcConfigurerAdapter {

	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		registry.addResourceHandler("/resources/**").addResourceLocations("/resources/");
	}
}