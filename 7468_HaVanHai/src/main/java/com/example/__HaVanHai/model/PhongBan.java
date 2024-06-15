package com.example.__HaVanHai.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import lombok.Getter;
import lombok.Setter;
@Setter
@Getter

@Entity
@Table(name = "PHONGBAN")
public class PhongBan {

    @Id
    @Column(name = "MaPhong", nullable = false, length = 2)
    private String maPhong;

    @Column(name = "TenPhong", nullable = false, length = 30)
    private String tenPhong;

}
