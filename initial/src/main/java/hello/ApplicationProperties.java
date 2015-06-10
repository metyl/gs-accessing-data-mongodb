package hello;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import javax.validation.constraints.NotNull;

@Data
@Component
@ConfigurationProperties(prefix = "hello")
public class ApplicationProperties {

    /**
     * Description for hello.defaultName
     */
    @NotNull
    private String defaultName;

}
