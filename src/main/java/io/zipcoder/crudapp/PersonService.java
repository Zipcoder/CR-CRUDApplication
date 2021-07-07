package io.zipcoder.crudapp;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonService {


    private PersonRepository repository;

    @Autowired
    public PersonService(PersonRepository repository){
        this.repository = repository;
    }


    public Iterable<Person> findAllPeople () {
        return repository.findAll();
    }

    public Person findOnePerson (Integer id){
        return repository.findById(id).get();
    }

    public Person createPerson (Person person){
        return repository.save(person);
    }

    public Person updatePerson (Person person) {
//        Person personInDB = repository.findOne(person.getId());
//        personInDB.setFirstName(person.getFirstName());
//        personInDB.setLastName(person.getLastName());
//        return repository.save(personInDB);
          return repository.save(person);
    }

    public Boolean deletePerson (Integer id) {
        repository.deleteById(id);
        return true;
    }
}
