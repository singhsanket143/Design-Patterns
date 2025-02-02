package RouteHandler_ChainOfResponsibilityPattern.factory;

import RouteHandler_ChainOfResponsibilityPattern.handlers.*;
import RouteHandler_ChainOfResponsibilityPattern.services.TokenServiceImpl;

public class RequestHandlerFactory {

    public static RequestHandler getHandlersForCreateTodo() {

        return new ValidateParamsHandler(
                new ValidateBodyHandler(
                        new AuthorisationHandler(
                                new AuthenticationHandler(
                                        new FinishingHandler(), new TokenServiceImpl()
                                )
                        )
                )
        );
    }

    public static RequestHandler getHandlerForUpdateTodo() {
        return new ValidateParamsHandler(
                new HandlerB(
                    new ValidateBodyHandler(
                            new AuthorisationHandler(
                                    new AuthenticationHandler(
                                            new FinishingHandler(), new TokenServiceImpl()
                                    )
                            )
                    )
                )
        );
    }
}
