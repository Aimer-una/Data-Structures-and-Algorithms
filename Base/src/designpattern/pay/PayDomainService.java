package designpattern.pay;

public class PayDomainService {
    PayServiceFactory payServiceFactory;
    public PayDomainService(PayServiceFactory payServiceFactory){
        this.payServiceFactory = payServiceFactory;
    }

    public void pay(String payChannel,PayRequest payRequest){
        payServiceFactory.getPayService(payChannel).pay(payRequest);
    }

}
