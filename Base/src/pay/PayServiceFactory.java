package pay;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class PayServiceFactory {
    public static Map<String,PayService> payServiceMap = new ConcurrentHashMap<>();

    public PayService getPayService(String payChannel){
        // alipay ->alipayPayService
        // wechat->wechatPayService
        return payServiceMap.get(payChannel + "Service");
    }
}
