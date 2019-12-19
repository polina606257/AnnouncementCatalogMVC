package domain;

import java.math.BigDecimal;
import java.time.LocalDate;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Ad.class)
public abstract class Ad_ {

	public static volatile SingularAttribute<Ad, LocalDate> date;
	public static volatile SingularAttribute<Ad, BigDecimal> price;
	public static volatile SingularAttribute<Ad, Author> author;
	public static volatile SingularAttribute<Ad, String> name;
	public static volatile SingularAttribute<Ad, Integer> id;
	public static volatile SingularAttribute<Ad, String> text;
	public static volatile SingularAttribute<Ad, Category> category;

	public static final String DATE = "date";
	public static final String PRICE = "price";
	public static final String AUTHOR = "author";
	public static final String NAME = "name";
	public static final String ID = "id";
	public static final String TEXT = "text";
	public static final String CATEGORY = "category";

}

