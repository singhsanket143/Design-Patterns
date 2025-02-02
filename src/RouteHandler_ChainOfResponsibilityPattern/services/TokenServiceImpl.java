package RouteHandler_ChainOfResponsibilityPattern.services;

import RouteHandler_ChainOfResponsibilityPattern.DTO.Request;

public class TokenServiceImpl implements TokenService {

    @Override
    public boolean validateToken(Request request) {
        System.out.println("TokenServiceImpl: Validating token");
        // fetches token from header
        // if token is not found return 404 token missing
        // validates the token using the key
        // if token is invalid then return not authenticated
        return true;
    }
}
