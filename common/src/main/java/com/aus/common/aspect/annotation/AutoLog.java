package com.aus.common.aspect.annotation;

import com.aus.common.constant.BoConstant;

import java.lang.annotation.*;

/**
 * @Author WongChy
 * @Date 2020/10/25 17:37
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface AutoLog {

    /**
     * 日志内容
     *
     * @return
     */
    String value() default "";

    /**
     * 日志类型
     */
    int logType() default BoConstant.LOG_TYPE_1;

    /**
     * 操作日志类型
     *
     * @return （1查询，2添加，3修改，4删除）
     */
    int operateType() default 0;

}
