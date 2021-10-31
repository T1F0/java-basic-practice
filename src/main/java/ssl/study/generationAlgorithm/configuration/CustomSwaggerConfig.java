package com.supconit.study.generationAlgorithm.configuration;
import com.google.common.base.Predicate;
import com.google.common.base.Predicates;
import com.supconit.study.generationAlgorithm.generationOpration.controller.InitializationController;
import com.supconit.study.generationAlgorithm.scheme.controller.SchemeController;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.RequestHandler;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class CustomSwaggerConfig {
        @Value("${swagger2.title}")
        private String title;
        @Value("${swagger2.description}")
        private String description;
        @Value("${swagger2.contact.name}")
        private String contactName;
        @Value("${swagger2.contact.url}")
        private String contactUrl;
        @Value("${swagger2.contact.email}")
        private String contactEmail;
        @Value("${swagger2.version}")
        private String version;

        @Bean
        public Docket schemeApi(){
            Predicate<RequestHandler> display = RequestHandlerSelectors.basePackage(SchemeController.class.getPackage().getName());
            Predicate<RequestHandler> apiOperation = RequestHandlerSelectors.withMethodAnnotation(ApiOperation.class);
            return new Docket(DocumentationType.SWAGGER_2)
                    .groupName("初始方案管理")
                    .useDefaultResponseMessages(false)
                    .apiInfo(apiInfo())
                    .select()
                    .apis(Predicates.and(display, apiOperation))
                    .build();
        }

        @Bean
        public Docket displayApi(){
                Predicate<RequestHandler> display = RequestHandlerSelectors.basePackage(InitializationController.class.getPackage().getName());
                Predicate<RequestHandler> apiOperation = RequestHandlerSelectors.withMethodAnnotation(ApiOperation.class);
                return new Docket(DocumentationType.SWAGGER_2)
                        .groupName("迭代管理")
                        .useDefaultResponseMessages(false)
                        .apiInfo(apiInfo())
                        .select()
                        .apis(Predicates.and(display, apiOperation))
                        .build();
        }

        private ApiInfo apiInfo() {
                return new ApiInfoBuilder()
                        .title(title)
                        .description(description)
                        .contact(new Contact(contactName, contactUrl, contactEmail))
                        .version(version)
                        .build();
        }
}