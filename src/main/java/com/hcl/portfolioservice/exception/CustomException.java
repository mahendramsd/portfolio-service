package com.hcl.portfolioservice.exception;


import com.hcl.portfolioservice.utils.CustomErrorCodes;

/**
 * @author mahendrasridayarathna
 * @created 27/04/2024 - 11:34 am
 * @project IntelliJ IDEA
 */
public class CustomException extends RuntimeException {

    private CustomErrorCodes customErrorCodes;

    public CustomException(String message) {
        super(message);
    }


    public CustomException(String message, Throwable cause) {
        super(message, cause);
    }

    public CustomException(CustomErrorCodes customErrorCodes) {
        this.customErrorCodes = customErrorCodes;
    }

    public CustomErrorCodes getCustomErrorCodes() {
        return customErrorCodes;
    }

}
