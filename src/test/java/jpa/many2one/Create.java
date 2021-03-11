package jpa.many2one;

import com.mycompany.SpringClass1130.jpa.entities.many2one.Customer;
import com.mycompany.SpringClass1130.jpa.entities.many2one.Orders;
import jpa.JPATemplate;
import org.junit.Test;


public class Create extends JPATemplate {
    @Test
    public void t1(){
        
        // Customer
        Customer c1 = new Customer();
        c1.setLastName("Mary"); 
        
        // Orders
        Orders o1 = new Orders();
        o1.setOrderName("Cat");
        Orders o2 = new Orders();
        o2.setOrderName("Dog");
        
        // 配置關聯關係
        o1.setCustomer(c1);
        o2.setCustomer(c1);
        
//        // 執行保存動作 - 次序1
//        session.persist(o1);
//        session.persist(o2);
//        session.persist(c1);
        
        // 執行保存動作 - 次序2
        session.persist(c1);
        session.persist(o1);
        session.persist(o2);

        System.out.println("Finish~`");
    }
}
