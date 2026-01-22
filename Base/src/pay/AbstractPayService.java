package pay;

public abstract class AbstractPayService implements PayService{
    @Override
    public void pay(PayRequest payRequest) {
        // 前置检查
        validateRequest(payRequest);
        // 支付核心逻辑
        doPay(payRequest);
        // 后置处理
        postPay(payRequest);
    }

    public abstract void doPay(PayRequest payRequest);

    // 支付成功的后置方法
    private void postPay(PayRequest payRequest){
        System.out.println("调用后置方法");
    }

    private void validateRequest(PayRequest payRequest){
        // 参数检查
        System.out.println("参数检查");
    }
}
