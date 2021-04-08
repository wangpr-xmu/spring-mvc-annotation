package org.worker.mvcannotation.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class MvcWebInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
    protected Class<?>[] getRootConfigClasses() {
        return new Class[]{MvcRootConfig.class};
    }

    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{MvcServletConfig.class};
    }

    protected String[] getServletMappings() {
        return new String[]{"/"};
    }
}
