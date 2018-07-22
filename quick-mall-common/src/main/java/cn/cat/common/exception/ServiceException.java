package cn.cat.common.exception;

/**
 * @Author: cat-lin
 * @Description:
 * @Date: Created in 23:24 18/7/21
 * @Modified by:
 */
public class ServiceException extends RuntimeException{

    public ServiceException(){

    }

    public ServiceException(String message){
        super(message);
    }

    public ServiceException(String message ,Throwable t){
        super(message ,t);
    }


}
