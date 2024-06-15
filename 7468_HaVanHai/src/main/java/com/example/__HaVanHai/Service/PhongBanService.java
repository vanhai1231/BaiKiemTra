package com.example.__HaVanHai.Service;

import com.example.__HaVanHai.model.PhongBan;
import com.example.__HaVanHai.Repository.PhongBanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PhongBanService {

    @Autowired
    private PhongBanRepository phongBanRepository;

    public List<PhongBan> getAllPhongBan() {
        return phongBanRepository.findAll();
    }
}
