package vn.codegym.demomavenproject.model;

import jakarta.persistence.*;

@Entity
@Table(name = "class_room")
public class ClassRoom {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
}
