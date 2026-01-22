package designpattern.pay;

// 微信支付
public class WechatPayService extends AbstractPayService{
    @Override
    public void doPay(PayRequest payRequest) {
        // 微信支付逻辑
        System.out.println("微信支付逻辑");
    }
}
