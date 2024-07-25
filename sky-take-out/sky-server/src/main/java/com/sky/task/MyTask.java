package com.sky.task;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * 自定义定时任务类
 */
@Component
@Slf4j
public class MyTask {

    /**
     * 定时任务
     */
//    @Scheduled(cron = "0/5 * * * * ?")
    public void execuleTask(){
        log.info("开启定时任务:{}", new Date());
    }

}
