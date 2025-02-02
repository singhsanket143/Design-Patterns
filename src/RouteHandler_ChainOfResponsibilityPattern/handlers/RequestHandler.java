package RouteHandler_ChainOfResponsibilityPattern.handlers;

import RouteHandler_ChainOfResponsibilityPattern.DTO.Request;

public interface RequestHandler {

    void handle(Request request); // What to do in a handler goes here
}
