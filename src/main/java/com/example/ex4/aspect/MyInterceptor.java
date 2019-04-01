package com.example.ex4.aspect;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Documented
@Retention(RUNTIME)
@Target({TYPE, METHOD})
public @interface MyInterceptor {
    AuthorityType[] value() default AuthorityType.USER;

    public static enum AuthorityType {
        USER, ADMIN, SUPERADMIN;
    }
}
