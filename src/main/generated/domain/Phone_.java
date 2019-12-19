package domain;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Phone.class)
public abstract class Phone_ {

	public static volatile SingularAttribute<Phone, String> number;
	public static volatile SingularAttribute<Phone, Author> author;
	public static volatile SingularAttribute<Phone, Integer> id;

	public static final String NUMBER = "number";
	public static final String AUTHOR = "author";
	public static final String ID = "id";

}

