package springbootswagger.springbootswagger;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.Collection;
import java.util.Collections;

@SpringBootApplication
@EnableSwagger2
public class SpringBootSwaggerApplication {


    private ApiInfo  getApiInfo(){
        return new ApiInfo(
                "Address Book Api Documentation CREATED BY ME ",
                "simple api to use as a trail",
                "1.0",
                "free to use ",
                 new springfox.documentation.service.Contact("Hill Aiss", "http://hillaiss.com", "hill@hil.com"),
                "Api licence",
                "http:hill-licenceUrl",
                 Collections.emptyList()
        );


    }

    @Bean // this here is to configure swagger
    public Docket swaggerConfig(){
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .paths(PathSelectors.ant("/api/address/*"))
                .apis(RequestHandlerSelectors.basePackage("springbootswagger"))
                .build()
                .apiInfo(getApiInfo());

    }




    public static void main(String[] args) {
        SpringApplication.run(SpringBootSwaggerApplication.class, args);
        System.out.println(" ==== spring boot swagger is running ==== ");
    }




}
