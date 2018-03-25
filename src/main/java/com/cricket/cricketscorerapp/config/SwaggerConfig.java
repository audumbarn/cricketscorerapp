
package com.cricket.cricketscorerapp.config;

import java.util.Collections;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @author Audumbar Nevarekar
 *
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig {
	//TODO Configure for required packages only
    @Bean
    public Docket api() { 
        return new Docket(DocumentationType.SWAGGER_2)  
          .select()                                  
          .apis(RequestHandlerSelectors.any())              
          .paths(PathSelectors.any())                          
          .build()
          .apiInfo(apiInfo());                                           
    }
    
    //TODO change following info
    private ApiInfo apiInfo() {
        return new ApiInfo(
          "Spring Boot REST API", 
          "Spring Boot REST API for Cricket Scorer App", 
          "1.0", 
          "Terms of service", 
          new Contact("Audumbar Nevarekar", "www.domainnotreg.com", "audumbarnevarekar@gmail.com"), 
          "Apache License Version 2.0", "https://www.apache.org/licenses/LICENSE-2.0", Collections.emptyList());
   }
}