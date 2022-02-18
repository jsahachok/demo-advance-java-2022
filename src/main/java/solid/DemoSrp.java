package solid;

public class DemoSrp {
    public static void main(String[] args) {
        PaymentService paymentService = new PaymentService() {
            @Override
            public void doSth() {
                System.out.println("Not real, for testing");
            }
        };
        // Dependency Injection
        // 1. Constructor Injection
        // required dependency ของ class นั้นๆ
        OrderBusiness orderBusiness = new OrderBusiness(paymentService);
        // 2. Setter/Field Injection
        // optional ใช้ได้ตามความจำเป็น >> มักจะถูกเลือกใช้มากกว่า
        // orderBusiness.setPaymentService(paymentService);
        // 3. Method Injection
        // เฉพาะ method ที่ใช้ >> ไม่ค่อยได้ใช้ >> ควรส่งแค่ Param มากกว่า
        //orderBusiness.process(paymentService);
        // 4. Interface Injection
        orderBusiness.process();
    }
}

class OrderBusiness {
    private final PaymentService paymentService;

    public OrderBusiness(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    void process() {
        paymentService.doSth();
    }
}

class PaymentService {
    public void doSth() {
        throw new RuntimeException("Not done");
    }
}