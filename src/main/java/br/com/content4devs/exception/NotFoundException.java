package br.com.content4devs.exception;

import io.grpc.Status;

public class NotFoundException extends BaseBusinessException {

    private final Long id;
    private static final String ERROR_MESSAGE = "Produto com ID %s não encontrado.";

    public NotFoundException(Long id) {
        super(String.format(ERROR_MESSAGE, id));
        this.id = id;
    }

    @Override
    public Status getStatus() {
        return Status.NOT_FOUND;
    }

    @Override
    public String getMessage() {
        return String.format(ERROR_MESSAGE, this.id);
    }
}
