package com.aus.system.exception;

/**
 * @Author WongChy
 * @Date 2020/10/25 15:39
 */
public class AusException extends RuntimeException{

    private static final long serialVersionUID = 1L;

    public AusException(String message){
        super(message);
    }

    public AusException(Throwable cause)
    {
        super(cause);
    }

    public AusException(String message,Throwable cause)
    {
        super(message,cause);
    }

}
