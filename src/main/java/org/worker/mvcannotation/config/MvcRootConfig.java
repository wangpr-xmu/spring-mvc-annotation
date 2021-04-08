package org.worker.mvcannotation.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("org.worker.mvcannotation.service")
public class MvcRootConfig {
}
