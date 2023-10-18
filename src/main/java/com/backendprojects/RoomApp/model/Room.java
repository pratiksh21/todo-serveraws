package com.backendprojects.RoomApp.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity


public class Room {

    @Id
    private Integer roomId;

    private Integer roomNumber;

    private Type roomType;

    private boolean roomAvailable;
}
