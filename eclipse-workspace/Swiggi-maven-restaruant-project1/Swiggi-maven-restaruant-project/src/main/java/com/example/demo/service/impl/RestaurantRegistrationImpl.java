package com.example.demo.service.impl;

import com.example.demo.model.Dishtable;
import com.example.demo.model.Dishtype;
import com.example.demo.model.RestaurantNameAndID;
import org.hibernate.query.NativeQuery;
import org.hibernate.transform.Transformers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.List;


@Service
public class RestaurantRegistrationImpl {

    @Autowired
    private EntityManager entityManager;

    public List<RestaurantNameAndID> nameID() {
        Query query = entityManager.createQuery("select new com.example.demo.model.RestaurantNameAndID(r.id,r.name) from Restaurantregistration r");
        return query.getResultList();
    }

    @SuppressWarnings({"deprecation", "unchecked"})
    public List<Dishtype> dishtype() {

        Query nameid = entityManager.createNativeQuery("select dishtype,type_id from dishtype")
                .unwrap(NativeQuery.class).setResultTransformer(Transformers.aliasToBean(Dishtype.class));

        return (List<Dishtype>) nameid.getResultList();
    }

    public List<Dishtable> dishAndRestaurantDatails(String dishName) {
        Query query = entityManager.createQuery("SELECT new com.example.demo.model.Dishtable(d.id,d.price,d.dishname,d.images,r.images,r.name,r.id) FROM Dish d INNER JOIN Restaurantregistration r ON d.Restaurantid=CONCAT(r.id, '') WHERE d.dishname LIKE concat('%',:dishName,'%')");
        query.setParameter("dishName",dishName);
        List<Dishtable> resultList = query.getResultList();
        //resultList.forEach(System.out::println);
        return resultList;
    }


}




