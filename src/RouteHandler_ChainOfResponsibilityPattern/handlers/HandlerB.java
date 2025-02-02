package RouteHandler_ChainOfResponsibilityPattern.handlers;

import RouteHandler_ChainOfResponsibilityPattern.DTO.Request;

public class HandlerB implements RequestHandler {

    private RequestHandler nextHandler;

    public HandlerB(RequestHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    @Override
    public void handle(Request request) {
        System.out.println("HandlerB is handling the request");
        nextHandler.handle(request);
    }
}
