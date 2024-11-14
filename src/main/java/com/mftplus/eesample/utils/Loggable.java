package com.mftplus.eesample.utils;

import jakarta.interceptor.InterceptorBinding;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@InterceptorBinding
@Target(value = {ElementType.METHOD, ElementType.TYPE})
public @interface Loggable {
}
