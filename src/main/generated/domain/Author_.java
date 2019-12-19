package domain;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Author.class)
public abstract class Author_ {

	public static volatile ListAttribute<Author, Ad> ads;
	public static volatile SingularAttribute<Author, Address> address;
	public static volatile SingularAttribute<Author, Phone> phone;
	public static volatile SingularAttribute<Author, String> name;
	public static volatile SingularAttribute<Author, Integer> id;
	public static volatile SingularAttribute<Author, Email> email;

	public static final String ADS = "ads";
	public static final String ADDRESS = "address";
	public static final String PHONE = "phone";
	public static final String NAME = "name";
	public static final String ID = "id";
	public static final String EMAIL = "email";

}

