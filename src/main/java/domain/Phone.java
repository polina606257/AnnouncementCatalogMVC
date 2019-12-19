package domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GenerationType;
import javax.persistence.GeneratedValue;
import javax.persistence.Column;
import javax.persistence.OneToOne;
import javax.persistence.CascadeType;

@Entity
public class Phone {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String number;

    @OneToOne(cascade = {CascadeType.PERSIST}, mappedBy = "phone")
    private Author author;

    public Phone(String number) {
        this.number = number;
    }

    Phone(){ }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
}