package com.demojpa.entity;


import lombok.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Book{

//    The @SequenceGenerator annotation lets you define the name of
//    the generator, the name, and
//    schema of the database sequence and the allocation size of the sequence
//    @Id Specifies the primary key of an entity.
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;

}
