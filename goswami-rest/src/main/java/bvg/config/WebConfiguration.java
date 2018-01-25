package bvg.config;

import org.apache.cxf.Bus;
import org.apache.cxf.jaxrs.swagger.Swagger2Feature;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;

@Configuration
public class WebConfiguration {
    @Autowired
    private Bus bus;

    @Autowired
    private Environment environment;

    private String basePath;

    @Bean("swagger2Feature")
    public Swagger2Feature swagger2Feature() {
        Swagger2Feature swagger2Feature = new Swagger2Feature();
        swagger2Feature.setTitle("Сервисы Goswami.ru");
        swagger2Feature.setContact("admin@goswami.ru");
        swagger2Feature.setDescription("REST-API Goswami.ru");
        swagger2Feature.setPrettyPrint(true);
        swagger2Feature.setVersion("1.0");
        swagger2Feature.setBasePath(environment.getProperty("cxf.path"));
        return swagger2Feature;
    }
}
