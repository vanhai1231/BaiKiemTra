package com.example.__HaVanHai.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
@Setter
@Getter
@Entity
@Table(name = "NHANVIEN")
public class NhanVien {

    @Id
    @Column(name = "MaNV", nullable = false, length = 10)
    private String maNV;

    @Column(name = "TenNV", nullable = false, length = 100)
    private String tenNV;

    @Column(name = "Phai", nullable = false, length = 3)
    private String phai;

    @Column(name = "NoiSinh", nullable = false, length = 200)
    private String noiSinh;

    @Column(name = "Luong", nullable = false)
    private int luong;

    @ManyToOne
    @JoinColumn(name = "MaPhong", nullable = false)
    private PhongBan phongBan;

}

