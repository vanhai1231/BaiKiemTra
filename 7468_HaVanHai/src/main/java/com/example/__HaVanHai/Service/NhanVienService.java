package com.example.__HaVanHai.Service;

import com.example.__HaVanHai.Repository.NhanVienRepository;
import com.example.__HaVanHai.model.NhanVien;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

@Service
public class NhanVienService {

    @Autowired
    private NhanVienRepository nhanVienRepository;

    public List<NhanVien> getAllNhanVien() {
        return nhanVienRepository.findAll();
    }

    public Optional<NhanVien> getNhanVienById(String id) {
        return nhanVienRepository.findById(id);
    }

    public NhanVien saveNhanVien(NhanVien nhanVien) {
        return nhanVienRepository.save(nhanVien);
    }

    public void deleteNhanVien(String id) {
        nhanVienRepository.deleteById(id);
    }

    // Phương thức để lấy danh sách nhân viên cho từng trang
    public Page<NhanVien> getNhanVienPerPage(int page, int pageSize) {
        return nhanVienRepository.findAll(PageRequest.of(page, pageSize));
    }

    // Phương thức để lấy tổng số nhân viên trong hệ thống
    public long getTotalNhanVien() {
        return nhanVienRepository.count();
    }
    public Page<NhanVien> getNhanVienPerPage(Pageable pageable) {
        return nhanVienRepository.findAll(pageable);
    }

}

