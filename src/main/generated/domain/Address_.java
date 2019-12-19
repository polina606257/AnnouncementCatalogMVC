package domain;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Address.class)
public abstract class Address_ {

	public static volatile SingularAttribute<Address, Country> country;
	public static volatile SingularAttribute<Address, City> city;
	public static volatile SingularAttribute<Address, Author> author;
	public static volatile SingularAttribute<Address, Integer> id;

	public static final String COUNTRY = "country";
	public static final String CITY = "city";
	public static final String AUTHOR = "author";
	public static final String ID = "id";

}

