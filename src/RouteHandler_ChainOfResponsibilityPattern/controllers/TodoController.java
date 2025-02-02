package RouteHandler_ChainOfResponsibilityPattern.controllers;

import RouteHandler_ChainOfResponsibilityPattern.DTO.Request;
import RouteHandler_ChainOfResponsibilityPattern.factory.RequestHandlerFactory;
import RouteHandler_ChainOfResponsibilityPattern.handlers.*;
import RouteHandler_ChainOfResponsibilityPattern.schema.Todo;

import java.util.Arrays;
import java.util.List;

public class TodoController {



    private Todo createTodo(Request request) {
        RequestHandlerFactory.getHandlersForCreateTodo().handle(request);
        // return a new todo
        return new Todo();

    }

}
