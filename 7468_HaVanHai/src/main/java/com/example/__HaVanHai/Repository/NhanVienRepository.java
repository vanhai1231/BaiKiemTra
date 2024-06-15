package com.example.__HaVanHai.Repository;

import com.example.__HaVanHai.model.NhanVien;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NhanVienRepository extends JpaRepository<NhanVien, String> {
}
