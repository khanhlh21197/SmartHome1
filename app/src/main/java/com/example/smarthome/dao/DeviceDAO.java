package com.example.smarthome.dao;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;

import com.example.smarthome.ui.device.model.Device;

import java.util.List;

@Dao
public interface DeviceDAO {
    @Query("SELECT * FROM device")
    List<Device> getAllDevice();

    @Insert
    void insertDevice(Device device);

    @Delete
    void deleteDevice(Device device);
}
