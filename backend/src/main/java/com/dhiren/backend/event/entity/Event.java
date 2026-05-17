package com.dhiren.backend.event.entity;

import com.dhiren.backend.common.enums.GenreType;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "Events")
public class Event {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long id;

    @Column(name = "title", nullable = false)
    private String title;

    @Column(name = "description", nullable = false)
    private String description;

    @Column(name = "genre", nullable = false)
    @Enumerated(EnumType.STRING)
    private GenreType genre;

    @Column(name ="language", nullable = false)
    private String language;

    @Column(name = "duration", nullable = false)
    private int duration;

    @Column(name = "artistOrCast", nullable = false)
    private String artistOrCast;
}
