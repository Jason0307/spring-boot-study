package org.zhubao.boot.schedule;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
@Configurable
@EnableScheduling
public class ScheduledTasks{

    @Scheduled(fixedRate = 1000 * 30)
    public void reportCurrentTime(){
    }

    @Scheduled(cron = "0 */1 *  * * * ")
    public void reportCurrentByCron(){
    }

}