package com.backendprojects.RoomApp.service;

import com.backendprojects.RoomApp.model.Room;
import com.backendprojects.RoomApp.repo.IroomRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class RoomService {


    @Autowired
IroomRepo iroomRepo;


    public void createRoom(Room newRoom) {
        iroomRepo.save(newRoom);
    }

    public Iterable<Room> getRooms() {
        return iroomRepo.findAll();

    }


    public String addRooms(List<Room> newRooms) {
        iroomRepo.saveAll(newRooms);

        return newRooms.size()+ " multiple rooms added";
    }

    public Room getRoomById(Integer id) {
        return iroomRepo.findById(id).get();
    }

    public String deleteRoomsById(List<Integer> ids) {
      iroomRepo.deleteAllById(ids);

      return "remove rooms";

    }
}
