package com.jcp.dynamic.route.config;

import com.google.common.base.Predicates;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @author jcp
 * @since 2019/6/24
 */
@Configuration
@EnableSwagger2
public class Swagger2Config {

	@Bean
	public Docket adminApiConfig(){
		return new Docket(DocumentationType.SWAGGER_2)
				.groupName("dynamicRouteApi")
				.apiInfo(adminApiInfo())
				.select()
				//.paths(Predicates.and(PathSelectors.regex("/route/*")))
				.build();
	}


	private ApiInfo adminApiInfo(){

		return new ApiInfoBuilder()
				.title("动态路由API文档")
				.description("本文档描述了动态路由接口定义")
				.version("1.0")
				.contact(new Contact("Jcp", "http://www.baidu.com", "1833910061@qq.com"))
				.build();
	}

}
