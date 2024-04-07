package com.phanyapat.crudRestProject.dao;

import com.phanyapat.crudRestProject.entity.Student;
//import jakarta..EntityManager;
//import jakarta.persistence.TypedQuery;TypedQuery
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Repository;
//import org.springframework.transaction.annotation.Transactional;

import java.util.List;

//@Repository
public class StudentDAOImpl implements StudentDAO{
//
//    // define field for entity manager
//    private EntityManager entityManager;
//
//    // inject entity manager using constructor injection
//    @Autowired
//    public StudentDAOImpl(EntityManager entityManager) {
//        this.entityManager = entityManager;
//    }
//
//
//    // implement save method
//    @Override
//    @Transactional
//    public void save(Student theStudent) {
//        entityManager.persist(theStudent);
//    }
//
//    @Override
//    public Student findById(Integer id) {
//        return entityManager.find(Student.class, id);
//    }
//
//    @Override
//    public List<Student> findAll() {
//        //create query
//        TypedQuery<Student> theQuery = entityManager.createQuery("FROM Student", Student.class);
//
//        //return query result
//        return theQuery.getResultList();
//    }
//
//    @Override
//    public List<Student> findByLastName(String lastName) {
//        //create query
//        TypedQuery<Student> theQuery = entityManager.createQuery("FROM Student WHERE lastName=:theData", Student.class);
//
//        //set query parameters
//        theQuery.setParameter("theData", lastName);
//
//        //return query result
//        return theQuery.getResultList();
//    }
//
//    @Override
//    @Transactional
//    public void update(Student student) {
//        entityManager.merge(student);
//    }
//
//    @Override
//    @Transactional
//    public void delete(Integer id) {
////        Student student = entityManager.find(Student.class, id);
//        Student student = findById(id);
//
//        entityManager.remove(student);
//    }
//
//    @Override
//    @Transactional
//    public int deleteAll() {
//        return entityManager.createQuery("DELETE FROM Student").executeUpdate();
//    }
}