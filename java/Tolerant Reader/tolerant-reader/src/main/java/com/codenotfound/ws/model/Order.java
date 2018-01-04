package com.codenotfound.ws.model;

public class Order {
	
	/*
	 * Description:
	 * Field orderDescriptionXPath in com.codenotfound.ws.client.OrderHistoryClient required a single bean, but 3 were found:
	 * - orderXPath: defined by method 'orderXPath' in class path resource [com/codenotfound/ws/client/ClientConfig.class]
	 * - orderIdXPath: defined by method 'orderIdXPath' in class path resource [com/codenotfound/ws/client/ClientConfig.class]
	 * - orderNameXPath: defined by method 'orderNameXPath' in class path resource [com/codenotfound/ws/client/ClientConfig.class]
	 *Action:
	 *Consider marking one of the beans as @Primary, updating the consumer to accept multiple beans, or using @Qualifier to identify the bean that should be consumed
	 * 
	 */

  private String orderId;
  private String orderName;
  private String orderDescription;

  public Order(String orderId, String orderName, String orderDescription) {
    this.orderId = orderId;
    this.orderName = orderName;
    this.orderDescription = orderDescription;
  }

  public String getOrderId() {
    return orderId;
  }

  public void setOrderId(String orderId) {
    this.orderId = orderId;
  }
  
  public String getOrderName() {
    return orderName;
  }

  public void setOrderName(String orderName) {
    this.orderName = orderName;
  }
  
  public String getOrderDescription() {
    return orderDescription;
  }

  public void setOrderDescription(String orderDescription) {
    this.orderDescription = orderDescription;
  }

  @Override
  public String toString() {
    return "Order[orderId=" + orderId + ",  orderName=" + orderName + ", orderDescription=" + orderDescription +"]";
  }
}
