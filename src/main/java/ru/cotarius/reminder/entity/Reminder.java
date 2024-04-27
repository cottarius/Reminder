package ru.cotarius.reminder.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Entity
@Table(name = "reminder")
@Data
public class Reminder {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "title")
    private String title;

    @Column(name = "description")git remote add origin https://github.com/cottarius/reminder.git
    private String description;

    @Column(name = "remind")
    private LocalDateTime remind;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
}
