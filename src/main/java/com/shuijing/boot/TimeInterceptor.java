package com.shuijing.boot;


import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;


import java.time.Duration;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

@Slf4j
@Component
public class TimeInterceptor implements HandlerInterceptor {
    private final ThreadLocal<LocalTime> threadLocalStart = new ThreadLocal<>();
    private final ThreadLocal<LocalTime> threadLocalEnd = new ThreadLocal<>();
    private final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss:SSS");

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        LocalTime startTime = LocalTime.now();
        threadLocalStart.set(startTime);
        log.info("开始时间:{}",startTime.format(formatter));
        return true;
    }
    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        LocalTime startTime = threadLocalStart.get();
        LocalTime endTime = threadLocalEnd.get();
        log.info("接口执行时间:{}毫秒", Duration.between(startTime,endTime).getNano()/1000000);
    }
    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        LocalTime endTime = LocalTime.now();
        threadLocalEnd.set(endTime);
        log.info("结束时间:{}",endTime.format(formatter));
    }
}
