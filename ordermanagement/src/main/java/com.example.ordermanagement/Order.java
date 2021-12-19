package com.example.ordermanagement;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

enum OrderType
{
    MARKET, LIMIT;
}

enum OrderStatus
{
    ACCEPTED, REJECTED, PLACED, PROCESSED;
}

@Entity
public class Order {

    private Integer orderQuantity;
    private String orderDate;
    private String stockName;
    private float price;
    private Enum<OrderType> type;
    private Enum<OrderStatus> status;
    private String orderId;
    private Integer executedQuantity;

    public Order() {
    }

    public Order(Integer orderQuantity, String orderDate, String stockName, float price, Enum<OrderType> type, Enum<OrderStatus> status, String orderId, Integer executedQuantity) {
        this.orderQuantity = orderQuantity;
        this.orderDate = orderDate;
        this.stockName = stockName;
        this.price = price;
        this.type = type;
        this.status = status;
        this.orderId = orderId;
        this.executedQuantity = executedQuantity;
    }

    public Order(String orderId, String orderDate, String stockName, float price, Enum<OrderType> type) {
        this.orderId = orderId;
        this.orderDate = orderDate;
        this.stockName = stockName;
        this.price = price;
        this.type = type;
    }

    public Integer getOrderQuantity() {
        return orderQuantity;
    }

    public void setOrderQuantity(Integer orderQuantity) {
        this.orderQuantity = orderQuantity;
    }

    public String getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(String orderDate) {
        this.orderDate = orderDate;
    }

    public String getStockName() {
        return stockName;
    }

    public void setStockName(String stockName) {
        this.stockName = stockName;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public Enum<OrderType> getType() {
        return type;
    }

    public void setType(Enum<OrderType> type) {
        this.type = type;
    }

    public Enum<OrderStatus> getStatus() {
        return status;
    }

    public void setStatus(Enum<OrderStatus> status) {
        this.status = status;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public Integer getExecutedQuantity() {
        return executedQuantity;
    }

    public void setExecutedQuantity(Integer executedQuantity) {
        this.executedQuantity = executedQuantity;
    }
}
