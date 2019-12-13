package com.salvo.salvo;


import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity

public class Ship {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    @GenericGenerator(name = "native", strategy = "native")
    private long id;
    private String type;


    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn (name = "gamePlayer_id")
    private GamePlayer gameplayer;

    @ElementCollection
    @Column(name= "locations")
    private List<String> locations = new ArrayList<>();

    public long getId() {
        return id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public GamePlayer getGameplayer() {
        return gameplayer;
    }

    public void setGameplayer(GamePlayer gameplayer) {
        this.gameplayer = gameplayer;
    }

    public Ship(){}

    public Ship(String type, List<String> locations) {
        this.type = type;
        this.locations = locations;
    }
}

