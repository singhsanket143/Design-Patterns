package RouteHandler_ChainOfResponsibilityPattern.handlers;

import RouteHandler_ChainOfResponsibilityPattern.DTO.Request;

public class AuthorisationHandler implements RequestHandler {
    private final RequestHandler nextHandler;

    public AuthorisationHandler(RequestHandler nextHandler) {
        this.nextHandler = nextHandler;
    }
    @Override
    public void handle(Request request) {
        System.out.println("AuthorisationHandler: Authorising the request");
        this.nextHandler.handle(request);
    }
}
