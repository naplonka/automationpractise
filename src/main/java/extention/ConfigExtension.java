package extention;

import com.fasterxml.jackson.databind.ObjectMapper;
import config.StoreConfig;
import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.api.extension.ParameterContext;
import org.junit.jupiter.api.extension.ParameterResolutionException;
import org.junit.jupiter.api.extension.ParameterResolver;

import java.io.IOException;
import java.net.URL;

public class ConfigExtension implements ParameterResolver {
    protected StoreConfig storeConfig;

    public ConfigExtension() {
        ClassLoader classLoader = getClass().getClassLoader();
        URL configFile = classLoader.getResource("config.json");
        try {
            storeConfig = new ObjectMapper().readValue(configFile, StoreConfig.class);
        } catch (IOException e) {
            System.out.println("Can not read value in config file.");
            System.out.println(e.getMessage());
        }
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
