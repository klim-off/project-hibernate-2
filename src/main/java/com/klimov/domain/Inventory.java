package com.klimov.domain;

import jakarta.persistence.*;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;

@Entity
@Table(name = "inventory", schema = "movie")
public class Inventory {

    @Id
    @Column(name = "inventory_id")
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "film_id")
    private Film film;

    @ManyToOne
    @JoinColumn(name = "store_id")
    private Store store;

    @Column(name = "last_update")
    @UpdateTimestamp
    private LocalDateTime lastUpdate;


}
