package it.euris.ires.singleresponsibility.example2;

public class OrderProcessor {

  public void process(Order order) {
    if (order.isValid() && save(order)) {
      sendConfirmationEmail(order);
    }
  }

  private boolean save(Order order) {
    MySqlConnection connection = new MySqlConnection("database.url");
    // Save the order in the database
    System.out.println("Saved order for customer " + order.getCustomerName());

    return true;
  }

  private void sendConfirmationEmail(Order order) {
    String name = order.getCustomerName();
    String email = order.getCustomerEmail();

    System.out.println("Sent email to " + order.getCustomerEmail());

    // Send an email to the customer
  }
}
