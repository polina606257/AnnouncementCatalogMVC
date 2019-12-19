package domain;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Email.class)
public abstract class Email_ {

	public static volatile SingularAttribute<Email, Author> author;
	public static volatile SingularAttribute<Email, Integer> id;
	public static volatile SingularAttribute<Email, String> email;

	public static final String AUTHOR = "author";
	public static final String ID = "id";
	public static final String EMAIL = "email";

}

