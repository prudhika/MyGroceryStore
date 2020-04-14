package Model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Item")
public class Item {

    @Id
    @Column(name="item_id")
    private int ITEM_ID;

    @Column(name="item_name")
    private String item_name;

    @Column(name="count_of_item")
    private int count_of_item;

    @Column(name="price_of_item")
    private int price_of_item;

    public int getITEM_ID() {
        return ITEM_ID;
    }

    public void setITEM_ID(int ITEM_ID) {
        this.ITEM_ID = ITEM_ID;
    }

    public String getItem_name() {
        return item_name;
    }

    public void setItem_name(String item_name) {
        this.item_name = item_name;
    }

    public int getCount_of_item() {
        return count_of_item;
    }

    public void setCount_of_item(int count_of_item) {
        this.count_of_item = count_of_item;
    }

    public int getPrice_of_item() {
        return price_of_item;
    }

    public void setPrice_of_item(int price_of_item) {
        this.price_of_item = price_of_item;
    }



}
