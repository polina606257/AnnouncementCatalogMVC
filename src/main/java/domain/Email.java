package domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Column;
import javax.persistence.OneToOne;
import javax.persistence.CascadeType;

@Entity
public class Email {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String email;

    @OneToOne(cascade = {CascadeType.PERSIST}, mappedBy = "email")
    private Author author;

    public Email(String email) {
        this.email = email;
    }

    Email(){}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}

