package com.springsimplespasos.hibernate.pruebas;

import com.springsimplespasos.hibernate.entidades.SimpleEntity;
import com.springsimplespasos.hibernate.util.HibernateUtil;
import org.hibernate.Session;

public class HibernateMain {

    public static void main(String[] args) {
        Session session = HibernateUtil.getSeccionSessionFactory().openSession();
        session.beginTransaction();

        //Realizar Un Insert
//        SimpleEntity entity = new SimpleEntity();
//        entity.setNombre("Descripcion");
//        session.save(entity);

        //Realizar un Update
//        SimpleEntity updateEntity = new SimpleEntity();
//        updateEntity.setCodigo(2);
//        updateEntity.setNombre("Descripcion 2");
//        session.update(updateEntity);

        //Realizar un Delete
//        SimpleEntity deleteEntity = new SimpleEntity();
//        deleteEntity.setCodigo(1);
//        session.delete(deleteEntity);

        //Read Leer Objeto de Base De Datos del id 2
//        SimpleEntity simpleRead = session.get(SimpleEntity.class, 2);
//        System.out.println(simpleRead.getCodigo()+"\t"+simpleRead.getNombre());

        //Agregar y Actualizar
        SimpleEntity simpleEntitySave = new SimpleEntity();
        simpleEntitySave.setNombre("Simple Entity");

        SimpleEntity simpleEntityUpdate = new SimpleEntity();
        simpleEntityUpdate.setCodigo(2);
        simpleEntityUpdate.setNombre("Simple Entity Update");

        session.saveOrUpdate(simpleEntitySave);
        session.saveOrUpdate(simpleEntityUpdate);


        session.getTransaction().commit();
        session.close();
    }

}
