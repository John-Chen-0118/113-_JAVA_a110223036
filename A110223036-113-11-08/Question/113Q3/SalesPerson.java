import com.sun.nio.sctp.AbstractNotificationHandler;

import java.util.ArrayList;
import java.util.Arrays;

public class SalesPerson {
    private String id;
    private String name;
    private double grossSales;
    private double commissionRate;

    private Order[] orderArray = new Order[1];
    private int orderCount = 0;

    public SalesPerson(String id, String name) {
        //預設commissionRate = 0.01
        this(id, name, 0.01); // 呼叫另一個建構子，並將 commissionRate 預設為 0.01
    }

    public SalesPerson(String id, String name, double commissionRate) {
        this.id = id;
        this.name = name;
        setCommissionRate(commissionRate); // 使用 setter 方法設定並檢查 commissionRate
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setCommissionRate(double commissionRate) {
        if (commissionRate >= 0 && commissionRate <= 1) {
            this.commissionRate = commissionRate;
        } else {
            System.out.println("獎金比例必須在 0 和 1 之間。");
        }
    }

    public void setOrderArray(String itemName, double itemPrice, int amount) {
        if (orderCount >= orderArray.length) {
            orderArray = Arrays.copyOf(orderArray, orderArray.length * 2);
        }

        orderArray[orderCount] = new Order(itemName, itemPrice, amount);
        orderCount++; // 訂單數量加 1
    }

    public double getGrossSales() {
        double totalSales = 0;
        for (int i = 0; i < orderCount; i++) {
            totalSales += orderArray[i].totalSale(); // 累加每筆訂單的總金額
        }
        this.grossSales = totalSales; // 更新 grossSales 欄位
        return totalSales;
    }

    
    public String getOrders() {

        StringBuilder orders = new StringBuilder();
        for (int i = 0; i < orderCount; i++) {
            orders.append(orderArray[i].toString()).append("\n"); // 每筆訂單換行顯示
        }
        return orders.toString();
    }

    
    public double salary() {
        return getGrossSales() * commissionRate;
    }

    public String toString() {
        return String.format("業務員編號：%s%n業務員姓名：%s%n銷售金額：%.1f%n獎金比例：%.2f%n薪資：%.1f%n",
                this.id, this.name, this.grossSales, this.commissionRate, salary() );
    }
}
