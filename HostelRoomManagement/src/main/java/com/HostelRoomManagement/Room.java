package com.HostelRoomManagement;

import jakarta.persistence.*;



@Entity

public class Room {



    @Id

    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long roomId;



    private String roomNumber;

    private int capacity;

    private int occupied;

    private String roomType; // Example: AC / Non-AC



    // Constructors

    public Room() {

    }



    public Room(String roomNumber, int capacity, int occupied, String roomType) {

        this.roomNumber = roomNumber;

        this.capacity = capacity;

        this.occupied = occupied;

        this.roomType = roomType;

    }



    // Getters and Setters

    public Long getRoomId() { return roomId; }

    public void setRoomId(Long roomId) { this.roomId = roomId; }



    public String getRoomNumber() { return roomNumber; }

    public void setRoomNumber(String roomNumber) { this.roomNumber = roomNumber; }



    public int getCapacity() { return capacity; }

    public void setCapacity(int capacity) { this.capacity = capacity; }



    public int getOccupied() { return occupied; }

    public void setOccupied(int occupied) { this.occupied = occupied; }



    public String getRoomType() { return roomType; }

    public void setRoomType(String roomType) { this.roomType = roomType; }

}

