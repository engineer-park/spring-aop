package net.zerocoding.tutorials.util;

import java.time.Duration;
import java.time.Instant;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

/**
 * Simple APM Utility
 * 
 * @since 2016.07.11
 * @version ver0.1
 * @author YoungSu Park
 *
 */
@Aspect
public class ApmUtil {
	
	@Around("execution(* net.zerocoding.tutorials.SimpleCalculator.*(..))")
	public void ElapsedTimeChekcer(ProceedingJoinPoint joinPoint) throws Throwable{
		Instant start = Instant.now();
		joinPoint.proceed();
		Instant end = Instant.now();
		long ns = Duration.between(start,end).toNanos();
		System.out.println(ns + "nano seconds");
	}
}
