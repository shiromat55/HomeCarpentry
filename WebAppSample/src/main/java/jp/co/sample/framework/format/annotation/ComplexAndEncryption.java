package jp.co.sample.framework.format.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import jp.co.sample.framework.web.servlet.handler.NormalInterceptor;

/**
 * 【プロパティ複合化・暗号化】注釈
 * @see ComplexAndEncryption
 * @see NormalInterceptor
 * @author shiromat55
 *
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD, ElementType.PARAMETER})
@Documented
public @interface ComplexAndEncryption {
}
