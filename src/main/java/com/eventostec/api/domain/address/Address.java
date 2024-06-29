package com.eventostec.api.domain.address;

import com.eventostec.api.domain.event.Event;
import jakarta.persistence.*;

import java.util.UUID;

@Table(name = "anddress")
@Entity
public class Address {
    @Id
    @GeneratedValue
    private UUID id;
    private String city;
    private String uf;

    @ManyToMany
    @JoinColumn(name = "event_id")
    private Event event;

}
