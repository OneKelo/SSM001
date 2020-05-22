package com.swjd.bean;


public class Customer {

  private long customerId;
  private String customerName;
  private String customerUserId;
  private String customerCreateId;
  private String customerSourse;
  private String customerIndustry;
  private String customerPhone;
  private String customerAddress;
  private java.sql.Date customerDate;


  public long getCustomerId() {
    return customerId;
  }

  public void setCustomerId(long customerId) {
    this.customerId = customerId;
  }


  public String getCustomerName() {
    return customerName;
  }

  public void setCustomerName(String customerName) {
    this.customerName = customerName;
  }


  public String getCustomerUserId() {
    return customerUserId;
  }

  public void setCustomerUserId(String customerUserId) {
    this.customerUserId = customerUserId;
  }


  public String getCustomerCreateId() {
    return customerCreateId;
  }

  public void setCustomerCreateId(String customerCreateId) {
    this.customerCreateId = customerCreateId;
  }


  public String getCustomerSourse() {
    return customerSourse;
  }

  public void setCustomerSourse(String customerSourse) {
    this.customerSourse = customerSourse;
  }


  public String getCustomerIndustry() {
    return customerIndustry;
  }

  public void setCustomerIndustry(String customerIndustry) {
    this.customerIndustry = customerIndustry;
  }


  public String getCustomerPhone() {
    return customerPhone;
  }

  public void setCustomerPhone(String customerPhone) {
    this.customerPhone = customerPhone;
  }


  public String getCustomerAddress() {
    return customerAddress;
  }

  public void setCustomerAddress(String customerAddress) {
    this.customerAddress = customerAddress;
  }


  public java.sql.Date getCustomerDate() {
    return customerDate;
  }

  public void setCustomerDate(java.sql.Date customerDate) {
    this.customerDate = customerDate;
  }

}
