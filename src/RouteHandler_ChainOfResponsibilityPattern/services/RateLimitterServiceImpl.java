package RouteHandler_ChainOfResponsibilityPattern.services;

public class RateLimitterServiceImpl implements RateLimitterService {

    @Override
    public void doRateLimiting() {
        System.out.println("Rate Limiting Algorithm");
    }
}
