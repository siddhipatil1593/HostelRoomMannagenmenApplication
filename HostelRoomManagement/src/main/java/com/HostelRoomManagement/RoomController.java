package com.HostelRoomManagement;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;



import java.util.List;



@CrossOrigin(origins = "*")

@RestController

@RequestMapping("/api/rooms")

public class RoomController {



    @Autowired

    private RoomRepository roomRepository;



    @GetMapping

    public List<Room> getAllRooms() {

        return roomRepository.findAll();

    }



    @PostMapping

    public Room addRoom(@RequestBody Room room) {

        return roomRepository.save(room);

    }



    @PutMapping("/{id}")

    public Room updateRoom(@PathVariable Long id, @RequestBody Room updatedRoom) {

        Room room = roomRepository.findById(id).orElseThrow();

        room.setRoomNumber(updatedRoom.getRoomNumber());

        room.setCapacity(updatedRoom.getCapacity());

        room.setOccupied(updatedRoom.getOccupied());

        room.setRoomType(updatedRoom.getRoomType());

        return roomRepository.save(room);

    }



    @DeleteMapping("/{id}")

    public void deleteRoom(@PathVariable Long id) {

        roomRepository.deleteById(id);

    }

}

