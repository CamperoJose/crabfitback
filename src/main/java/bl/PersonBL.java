package bl;

import entity.Person;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.persistence.EntityManager;

import java.util.List;

@ApplicationScoped
public class PersonBL {

    @Inject
    EntityManager em;

    public List<Person> getAllPersons() {
        return em.createQuery("SELECT p FROM Person p", Person.class).getResultList();
    }
//
//    @Transactional
//    public void createPerson(Person person) {
//        em.persist(person);
//    }
//
//    public Person getPersonById(Long id) {
//        return em.find(Person.class, id);
//    }
//
//    @Transactional
//    public void updatePerson(Person person) {
//        em.merge(person);
//    }
//
//    @Transactional
//    public void deletePerson(Long id) {
//        Person person = em.find(Person.class, id);
//        if (person != null) {
//            em.remove(person);
//        }
//    }
}
