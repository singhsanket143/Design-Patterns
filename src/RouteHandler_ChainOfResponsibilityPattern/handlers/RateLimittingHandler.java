package RouteHandler_ChainOfResponsibilityPattern.handlers;

import RouteHandler_ChainOfResponsibilityPattern.DTO.Request;
import RouteHandler_ChainOfResponsibilityPattern.services.RateLimitterService;

public class RateLimittingHandler implements RequestHandler {

    private final RequestHandler nextHandler;
    private final RateLimitterService rateLimitterService;

    public RateLimittingHandler(RequestHandler nextHandler, RateLimitterService rateLimitterService) {
        this.nextHandler = nextHandler;
        this.rateLimitterService = rateLimitterService;
    }

    @Override
    public void handle(Request request) {
        rateLimitterService.doRateLimiting();
        System.out.println("This is a Rate Limitting Handler");
        this.nextHandler.handle(request);
    }
}
