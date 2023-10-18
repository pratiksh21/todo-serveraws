package com.backendprojects.RoomApp.controller;

import com.backendprojects.RoomApp.model.Room;
import com.backendprojects.RoomApp.service.RoomService;
import jakarta.persistence.Entity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class RoomController {

    @Autowired
    RoomService roomService;


    // create a rooms


    @PostMapping("room")
    public String addRoom(@RequestBody Room newRoom){
        roomService.createRoom(newRoom);

        return "room added";
    }


    // get all rooms

    @GetMapping("rooms")
    public List<Room> getAllRooms(){
       return (List<Room>) roomService.getRooms();
    }

    //multiple rooms at once

    @PostMapping("rooms")
    public String addRooms(@RequestBody List<Room> newRooms){
        return  roomService.addRooms(newRooms);
    }


    //get users by id

    @GetMapping("id")
    public Room getRoomId(@RequestParam Integer id){
        return  roomService.getRoomById(id);
    }

    // delete all by id
    @DeleteMapping("rooms/id")
    public String deleteRooms(@RequestBody List<Integer> ids){
        return roomService.deleteRoomsById(ids);
    }








}
