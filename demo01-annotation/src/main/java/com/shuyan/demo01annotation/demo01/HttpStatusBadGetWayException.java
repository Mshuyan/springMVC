package com.shuyan.demo01annotation.demo01;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * @author will
 * 功能：用于测试 @ResponseStatus 注解
 */
@ResponseStatus(HttpStatus.BAD_GATEWAY)
public class HttpStatusBadGetWayException extends RuntimeException{
    private static final long serialVersionUID = 1L;

    public HttpStatusBadGetWayException(String message) {
        super(message);
    }
}
