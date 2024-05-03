package com.Registration.Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@Entity
@Table(name = "student_enq")
public class StudentEnq {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "enq_id", nullable = false)
    private Integer enqId;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "phno", nullable = false)
    private Long phno;

    @Column(name = "class_mode", nullable = false)
    private String classMode;

    @Column(name = "course_name", nullable = false)
    private String courseName;

    @Column(name = "enq_status", nullable = false)
    private String enqStatus;

    @Column(name = "created_date")
    private LocalDate createdDate;

    @Column(name = "cid")
    private Integer cid;

}