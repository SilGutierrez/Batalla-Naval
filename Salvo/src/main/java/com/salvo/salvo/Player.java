package com.salvo.salvo;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

import java.util.*;

@Entity

public class Player {

    //atributos
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    @GenericGenerator(name = "native", strategy = "native")
    private long id;

    private String userName;
    private String firstName;
    private String lastName;
    private String email;

    @OneToMany (mappedBy = "player", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    Set<GamePlayer> gamePlayerSet = new HashSet<>();

    //constructor
    public Player(){}

    public Player(String userName, String firstName, String lastName, String email) {
        this.userName = userName;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }



    public Map<String, Object> getPlayerData() {
        Map<String, Object> dto = new LinkedHashMap<String, Object>();
        dto.put("playerId", getId());
        dto.put("email", getEmail());
        return dto;
    }




    //getter y setter


    public long getId() {
        return id;
    }

    public String getUserName() {
        return userName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() { return email; }



    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) { this.lastName = lastName; }

    public void setEmail(String email) { this.email = email; }

    }

    //otros metodos

