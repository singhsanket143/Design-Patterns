package RouteHandler_ChainOfResponsibilityPattern.services;

import RouteHandler_ChainOfResponsibilityPattern.DTO.Request;

public interface TokenService {

    boolean validateToken(Request request);

}
