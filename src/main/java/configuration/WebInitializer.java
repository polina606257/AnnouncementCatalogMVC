package configuration;

import com.sun.istack.Nullable;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class WebInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
    @Nullable
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return null;
    }

    @Nullable
    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[] {ConfigApp.class};
    }

    @Override
    protected String[] getServletMappings() {
        return new String[] {"/ad/*"};
    }
}

