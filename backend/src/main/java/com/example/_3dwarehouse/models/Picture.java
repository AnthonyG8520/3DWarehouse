package com.example._3dwarehouse.models;
import jakarta.persistence.*;
import java.util.List;


@Entity
@Table
public class Picture {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(nullable = false)
    private String imageUrl;

    @ManyToOne
    @JoinColumn(name = "item_id")
    private Item item;

    public Picture() {}

    public Picture(long id, String imageUrl, Item item){
        this.id = id;
        this.imageUrl = imageUrl;
        this.item = item;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }
}
