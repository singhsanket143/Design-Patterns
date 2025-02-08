package RouteHandler_ChainOfResponsibilityPattern.factory;

import RouteHandler_ChainOfResponsibilityPattern.handlers.*;
import RouteHandler_ChainOfResponsibilityPattern.services.RateLimitterService;
import RouteHandler_ChainOfResponsibilityPattern.services.RateLimitterServiceImpl;
import RouteHandler_ChainOfResponsibilityPattern.services.TokenServiceImpl;

public class RequestHandlerFactory {

    public static RequestHandler getHandlersForCreateTodo() {

        return new RateLimittingHandler(new ValidateParamsHandler(
                new ValidateBodyHandler(
                        new AuthorisationHandler(
                                new AuthenticationHandler(
                                        new FinishingHandler(), new TokenServiceImpl()
                                )
                        )
                )
        ), new RateLimitterServiceImpl());
    }

    public static RequestHandler getHandlerForUpdateTodo() {
        return new RateLimittingHandler(new ValidateParamsHandler(
                new HandlerB(
                    new ValidateBodyHandler(
                            new AuthorisationHandler(
                                    new AuthenticationHandler(
                                            new FinishingHandler(), new TokenServiceImpl()
                                    )
                            )
                    )
                )
        ), new RateLimitterServiceImpl());
    }
}
