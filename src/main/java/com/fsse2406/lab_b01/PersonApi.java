package com.fsse2406.lab_b01;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class PersonApi {
   List<Person> people = new ArrayList<>();

   @PostMapping("/person/create")
   public Person createPerson(@RequestBody Person createPerson) {
      people.add(createPerson);
      return createPerson;
   }

   @GetMapping("/person/all")
   public List<Person> getAllPeople() {
      return people;
   }
   @PutMapping("/person/update")
   public ResponseEntity<Person> updatePerson(@RequestBody Person updatePerson) {
      for (Person person : people) {
         if (person.getHkId().equals(updatePerson.getHkId())) {
            person.setFirstName(updatePerson.getFirstName());
            person.setLastName(updatePerson.getLastName());
            return new ResponseEntity<>(updatePerson, HttpStatus.OK);
         }
      }
      return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
   }


   @DeleteMapping("/person/delete")
   public ResponseEntity<Person> deletePerson(@RequestBody Person removePerson) {
      for (Person person : people) {
         System.out.println(removePerson.getHkId());
         if (person.getHkId().equals(removePerson.getHkId())) {
            people.remove(person);
            return new ResponseEntity<>(removePerson, HttpStatus.OK);
         }
      } return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
   }
}