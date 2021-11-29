package com.studentapi.student.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@ToString
@Document(collection = "student")
public class StudentDetails {
    @Id
    public long id;
    public String firstname;
    public String lastname;
    public String address;
    public String mn;

    public StudentDetails(long id, String firstname, String lastname, String address, String mn) {

        super();
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.address = address;
        this.mn = mn;

    }

    public StudentDetails(){
        super();
    }

    public long getId() {
        return id;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public String getAddress() {
        return address;
    }

    public String getMn() {
        return mn;
    }

    @Override
    public String toString() {
        return "StudentDetails{" +
                "id=" + id +
                ", firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", address='" + address + '\'' +
                ", mn=" + mn +
                '}';
    }
}
