package designpattern.pay;

// 支付宝支付
public class AlipayPayService extends AbstractPayService{

    @Override
    public void doPay(PayRequest payRequest) {
        // 支付宝支付逻辑
        System.out.println("支付宝支付逻辑");
    }
}
