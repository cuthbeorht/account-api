package org.davidsciacchettano.services.web.account.exception;

public class NotFoundException extends RuntimeException {
    private String message;

    public NotFoundException() {
        super();
    }

    public NotFoundException(String message) {
        super(message);
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
