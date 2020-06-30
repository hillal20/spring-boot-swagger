package springbootswagger.springbootswagger.controllers;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import springbootswagger.springbootswagger.models.Contact;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/address")
public class AddressBookController {

   private List<Contact> arr = new ArrayList<>();

@GetMapping("/{id}")
@ApiOperation( // this annotation is for swagger
        value = "finds contact using id ",
        notes = "look inside the db and return the contact that holes the same id",
        response = Contact.class
)
    public ResponseEntity<? > getContact(@PathVariable("id") String id){
    System.out.println("id ===> "+ id );
    Contact contact = new Contact(1, "hill", "2346 st");
    return new ResponseEntity<>( contact.toString(), HttpStatus.OK) ;
}

@GetMapping("/all")
    public ResponseEntity<?> getAllContact(){
    arr.add(new Contact(1, "hill", "2346 st"));
    arr.add(new Contact(1, "jill", "new york"));
    return new ResponseEntity<>(arr, HttpStatus.OK);
}


@PostMapping("/add")
    public ResponseEntity<Contact> addContact(
            @ApiParam(value = "The Contact Object what you need to save in the db ", required = true) // this is for swagger
            @RequestBody Contact contact){
    arr.add(contact);
    return new ResponseEntity<>(contact, HttpStatus.OK);
}

}
