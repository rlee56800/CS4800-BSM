import java.util.ArrayList;


public class Order extends Item {
	
	private int orderNumber;
	private int total;
    //protected ArrayList<Order> orders = new ArrayList<Order>();
    protected ArrayList<Item> order = new ArrayList<Item>();
    protected ArrayList<Order> orders = new ArrayList<Order>();
	
	
	public Order() {
		super();
		orderNumber = 0;
        total = 0;
        getArrayOfItems();
	}

    public Order(int total, Item item) {
		super();
		orderNumber = 0;
        this.total = total;
        getArrayOfItems();
	}
    
	
	public Order(int total, Item item, Item item2, Item item3) {
		super();
        this.total = total;
        this.getArrayOfItems();
	}

	public Order(int total, Item item, Item item2) {
        super();
        this.total = total;
        this.getArrayOfItems();
    }



    public Order(int total, Item item, Item item2, Item item3, Item item4) {
        super();
        this.total = total;
        this.getArrayOfItems();
    }

    public Order(int total, Item item, Item item2, Item item3, Item item4, Item item5) {
        super();
        this.total = total;
        this.getArrayOfItems();
    }

    public int getOrderNumber()
	{
		return orderNumber;
	}

    public int getTotal(){
        return total;
    }

    public void setTotal (int t){
        total = t;
    }

	public void setOrderNumber (int on)
	{
		on = orderNumber + 1;
		orderNumber = on;
	}
	
    public void addItem(Item i) throws Exception
    {
        order.add(i);
        System.out.println(order.size());
    }

    public Item getItem(String itemID) throws Exception
    {
        for (int i = 0; i < order.size(); i++){
            if (order.get(i).getItemID().equals(itemID)){
                return order.get(i);
            }
        }
        throw new Exception("Item not found");
    }

    public void removeItem(int i) throws Exception {
        order.remove(i);
        System.out.println(order.size());
    }

    public ArrayList<Item> getArrayOfItems() {
		return order;
	}

    public void addOrder(Order o) throws Exception
    {
        orders.add(o);
        System.out.println(orders.size());
    }

    public ArrayList<Order> getArrayOfOrders(){
        return orders;
    }

    public Order getOrder(int orderNumber) throws Exception
    {
        for (int i =0; i < orders.size(); i++){
            if (orders.get(i).getOrderNumber() == (orderNumber)){
                return orders.get(i);
            }
        }
        throw new Exception("Number not found");
    }

}
