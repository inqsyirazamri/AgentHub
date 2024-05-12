package src.g11.agenthub.data_transfer;

import src.g11.agenthub.data_access.ProductDao;
import java.sql.ResultSet;


public class ProductDto {
    private int productId;
    private String productCode;
    private String date;
    private String sellDate;
    private String supplierCode;
    private String productName;
    private int quantity;
    private double agentPrice;
    private double sellingPrice;
    private String brand;
    private int userId;
    private String customersName;
    private String customerCode;
    private Double totalCost;
    private Double totalRevenue;

    public ProductDto(String productCode2, String productName2, double double1, double double2, String brand2,
            int userId2) {
        //TODO Auto-generated constructor stub
    }

    public ProductDto() {
        //TODO Auto-generated constructor stub
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getSellDate() {
        return sellDate;
    }

    public void setSellDate(String sellDate) {
        this.sellDate = sellDate;
    }

    public String getSupplierCode() {
        return supplierCode;
    }

    public void setSupplierCode(String supplierCode) {
        this.supplierCode = supplierCode;
    }

    public String getCustomerCode() {
        return customerCode;
    }

    public void setCustomerCode(String customerCode) {
        this.customerCode = customerCode;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getAgentPrice() {
        return agentPrice;
    }

    public void setAgentPrice(double agentPrice) {
        this.agentPrice = agentPrice;
    }

    public double getSellingPrice() {
        return sellingPrice;
    }

    public void setSellingPrice(double sellingPrice) {
        this.sellingPrice = sellingPrice;
    }

    public ResultSet getCustomersName() {
        ResultSet rs = new ProductDao().getCustomersInfo();
        return rs;
    }

    public ResultSet getProductsName() {
        ResultSet rs = new ProductDao().getProductInfo();
        return rs;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public Double getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(Double totalCost) {
        this.totalCost = totalCost;
    }

    public Double getTotalRevenue() {
        return totalRevenue;
    }

    public void setTotalRevenue(Double totalRevenue) {
        this.totalRevenue = totalRevenue;
    }

}
