package com.cra.springmongodb.services.exception;

public class ObjectNotFoundException extends RuntimeException {
    private static final long serialVersionUID = 7011285823775332153L;

    public ObjectNotFoundException(String msg){
        super(msg);
    }
}
