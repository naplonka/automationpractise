package config;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.api.extension.ParameterContext;
import org.junit.jupiter.api.extension.ParameterResolutionException;
import org.junit.jupiter.api.extension.ParameterResolver;

import java.io.IOException;
import java.net.URL;
import com.fasterxml.jackson.databind.ObjectMapper;

@Slf4j
public class ConfigExtention implements ParameterResolver {
    private final StoreConfig storeConfig;

    public ConfigExtention() throws IOException {
        ClassLoader classLoader = getClass().getClassLoader();
        URL configFile = classLoader.getResource("config.json");
        storeConfig = new ObjectMapper().readValue(configFile, StoreConfig.class);
    }

    @Override
    public boolean supportsParameter(ParameterContext parameterContext, ExtensionContext extensionContext) throws ParameterResolutionException {
        return StoreConfig.class.isAssignableFrom(parameterContext.getParameter().getType());
    }

    @Override
    public Object resolveParameter(ParameterContext parameterContext, ExtensionContext extensionContext) throws ParameterResolutionException {
        return storeConfig;
    }
}
