package swagger.config.Swagger;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
import static springfox.documentation.builders.PathSelectors.regex;

@Configuration
@EnableSwagger2
public class Config {
    @Bean
    public Docket postsApi(){

        return new Docket(DocumentationType.SWAGGER_2).groupName("rousselsprojects").apiInfo(apiInfo()).select()
                .paths(regex("/user.*")).build();

    }

    private ApiInfo apiInfo(){
        return new ApiInfoBuilder().title("NeatWork API")
                .description("API Documentation Generated for the Project Management tools NEAT-WORK ")
                .termsOfServiceUrl("https://www.neatwork.com")
                .license("NeatWork Rest API License")
                .licenseUrl("https://www.neatwork/license.com").version("1.0").build();
    }

}
