package RouteHandler_ChainOfResponsibilityPattern.handlers;

import RouteHandler_ChainOfResponsibilityPattern.DTO.Request;

public class ValidateBodyHandler implements RequestHandler {

    private final RequestHandler nextHandler;

    public ValidateBodyHandler(RequestHandler nextHandler) {
        this.nextHandler = nextHandler;
    }
    @Override
    public void handle(Request request) {
        // Above the next handler call, whatever is written is executed before
        System.out.println("ValidateBodyHandler: Validating the request body");

        this.nextHandler.handle(request);

        // below the handler, whatever is written is executed after the next handler
    }
}
