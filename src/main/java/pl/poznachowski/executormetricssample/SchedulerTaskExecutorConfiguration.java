package pl.poznachowski.executormetricssample;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.concurrent.ThreadPoolTaskScheduler;

@Configuration(proxyBeanMethods = false)
class SchedulerTaskExecutorConfiguration {

    @Bean
    public ThreadPoolTaskScheduler pubsubSubscriberThreadPool() {
        ThreadPoolTaskScheduler scheduler = new ThreadPoolTaskScheduler();
        scheduler.setPoolSize(4);
        scheduler.setThreadNamePrefix("gcp-pubsub-subscriber");
        scheduler.setDaemon(true);
        return scheduler;
    }
}
