package br.com.content4devs.exception.handler;

import br.com.content4devs.exception.BaseBusinessException;
import io.grpc.Status;
import io.grpc.StatusException;
import io.grpc.StatusRuntimeException;
import net.devh.boot.grpc.server.advice.GrpcAdvice;
import net.devh.boot.grpc.server.advice.GrpcExceptionHandler;

@GrpcAdvice
public class ExceptionHandler {

    private static final String INTERNAL_SERVER_ERROR = "Internal server error";

    @GrpcExceptionHandler(BaseBusinessException.class)
    public StatusRuntimeException handleBusinessException(BaseBusinessException e) {
        return e.getStatus().withCause(e.getCause()).withDescription(e.getMessage())
                .asRuntimeException();
    }

    @GrpcExceptionHandler(Exception.class)
    public StatusException handleException(Exception e) {
        return Status.INTERNAL.withCause(e).withDescription(INTERNAL_SERVER_ERROR).asException();
    }
}
