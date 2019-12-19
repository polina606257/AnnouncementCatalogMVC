package dto;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import domain.Ad;
import domain.Author;
import domain.Category;

import java.math.BigDecimal;
import java.time.LocalDate;

/**
 * Created by polin on 10/13/2019.
 */
public class AdDTO {
    private int id;
    private CategoryDTO category;
    private AuthorDTO author;
    private String text;
    private String name;
    private BigDecimal price;
    private LocalDate date;

    public AdDTO(int id, CategoryDTO category, AuthorDTO author,
                 String text, String name, BigDecimal price, LocalDate date) {
        this.id = id;
        this.category = category;
        this.author = author;
        this.text = text;
        this.name = name;
        this.price = price;
        this.date = date;
    }

    public AdDTO() {
    }

    public AdDTO(Ad ad) {
        Category categoryAd = ad.getCategory();
        Author authorAd = ad.getAuthor();
        category = new CategoryDTO(categoryAd.getId(), categoryAd.getName());
        author = new AuthorDTO(authorAd.getId(), authorAd.getName());
        new AdDTO(ad.getId(), category, author, ad.getText(), ad.getName(), ad.getPrice(), ad.getDate());
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public CategoryDTO getCategory() {
        return category;
    }

    public void setCategory(CategoryDTO category) {
        this.category = category;
    }

    public AuthorDTO getAuthor() {
        return author;
    }

    public void setAuthor(AuthorDTO author) {
        this.author = author;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

}
