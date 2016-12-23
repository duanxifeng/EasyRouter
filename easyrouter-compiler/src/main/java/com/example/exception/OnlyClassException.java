package com.example.exception;

import javax.lang.model.element.ElementKind;

/**
 * Created by Zane on 2016/12/23.
 * Email: zanebot96@gmail.com
 * Blog: zane96.github.io
 */

public class OnlyClassException extends Exception{

    public OnlyClassException(String kind) {
        super(String.format("@Route shouldn't use in %s", kind));
    }
}
