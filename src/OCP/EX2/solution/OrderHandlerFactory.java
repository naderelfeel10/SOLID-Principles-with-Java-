package OCP.EX2.solution;

import java.util.Map;

public class OrderHandlerFactory {

    private final Map<String, OrderValidator> validatorMap;
    private final Map<String, OrderCalculator> calculatorMap;

    public OrderHandlerFactory(){
        validatorMap = Map.of(
                "ONLINE", new OnlineOrderValidator(),
                "STORE", new StoreOrderValidator()
        );
        calculatorMap = Map.of(
                "ONLINE", new OnlineOrderClaculator(),
                "STORE", new StoreOrderClaculator()
        );
    }

    public OrderValidator getValidator(String orderType){
        OrderValidator orderValidator = validatorMap.get(orderType);
        if (orderValidator == null) {
            throw new IllegalArgumentException("Unsupported order type: " + orderType);
        }
        return orderValidator;
    }

    public OrderCalculator getCalculator(String orderType){
        OrderCalculator orderCalculator = calculatorMap.get(orderType);
        if (orderCalculator == null) {
            throw new IllegalArgumentException("Unsupported order type: " + orderType);
        }
        return orderCalculator;
    }







}
