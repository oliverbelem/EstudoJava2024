import entities.enums.OrderStatus;
import pedidos.Pedidos;

import java.util.Date;

public class Aplicacao {

    public static void main(String[] args) {

        Pedidos order = new Pedidos(1080, new Date(), OrderStatus.AGUARDANDO_PAGAMENTO);

        System.out.println(order);

        OrderStatus os1 = OrderStatus.valueOf("ENTREGUE");
        System.out.println(os1);

    }
}