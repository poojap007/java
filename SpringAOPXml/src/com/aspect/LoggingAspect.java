package com.aspect;

public class LoggingAspect {

    public void logBefore() {
        System.out.println("[BEFORE] Method execution started...");
    }

    public void logAfterReturning() {
        System.out.println("[AFTER RETURNING] Method executed successfully.");
    }

    public void logAfterThrowing(Exception ex) {
        System.out.println("[AFTER THROWING] Exception occurred: " + ex.getMessage());
    }

    public Object logAround(org.aopalliance.intercept.MethodInvocation invocation) throws Throwable {
        long start = System.currentTimeMillis();
        System.out.println("[AROUND] Method execution started...");
        Object result = invocation.proceed();
        long end = System.currentTimeMillis();
        System.out.println("[AROUND] Method executed in " + (end - start) + " ms.");
        return result;
    }
}
