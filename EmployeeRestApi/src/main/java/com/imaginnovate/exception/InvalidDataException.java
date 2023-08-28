package com.imaginnovate.exception;

public class InvalidDataException extends RuntimeException {
   
	private static final long serialVersionUID = 1L;
	
	private Long id;
    private String msg;

    public InvalidDataException(Long id, String msg) {
        this.id = id;
        this.msg = msg;
    }

    public Long getId() {
        return id;
    }

    public String getMsg() {
        return msg;
    }
}

