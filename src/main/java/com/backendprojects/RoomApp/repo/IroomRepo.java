package com.backendprojects.RoomApp.repo;

import com.backendprojects.RoomApp.model.Room;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IroomRepo extends CrudRepository<Room,Integer> {

}
