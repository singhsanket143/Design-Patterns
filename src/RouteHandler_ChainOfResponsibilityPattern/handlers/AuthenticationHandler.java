package RouteHandler_ChainOfResponsibilityPattern.handlers;

import RouteHandler_ChainOfResponsibilityPattern.DTO.Request;
import RouteHandler_ChainOfResponsibilityPattern.services.TokenService;

public class AuthenticationHandler implements RequestHandler {

    private final RequestHandler nextHandler;
    private final TokenService tokenService;

    public AuthenticationHandler(RequestHandler nextHandler, TokenService tokenService) {
        this.nextHandler = nextHandler;
        this.tokenService = tokenService;
    }

    @Override
    public void handle(Request request) {
        this.tokenService.validateToken(request);
        System.out.println("AuthenticationHandler: Authenticating the request");

        this.nextHandler.handle(request);
    }
}
