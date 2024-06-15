package com.example.__HaVanHai.controller;

import com.example.__HaVanHai.model.NhanVien;
import com.example.__HaVanHai.Service.NhanVienService;
import com.example.__HaVanHai.Service.PhongBanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import org.springframework.data.domain.Page;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/nhanvien")
public class NhanVienController {

    @Autowired
    private NhanVienService nhanVienService;
    @Autowired
    private PhongBanService phongBanService;

    @GetMapping
    public String listNhanVien(Model model) {
        List<NhanVien> nhanVienList = nhanVienService.getAllNhanVien();
        model.addAttribute("nhanVienList", nhanVienList);
        return "NhanVien/list";
    }

    @GetMapping("/add")
    public String showAddForm(Model model) {
        model.addAttribute("nhanVien", new NhanVien());
        model.addAttribute("phongBanList", phongBanService.getAllPhongBan());
        return "NhanVien/form";
    }

    @GetMapping("/edit/{id}")
    public String showEditForm(@PathVariable("id") String id, Model model) {
        NhanVien nhanVien = nhanVienService.getNhanVienById(id).orElseThrow(() -> new IllegalArgumentException("Invalid nhan vien Id:" + id));
        model.addAttribute("nhanVien", nhanVien);
        model.addAttribute("phongBanList", phongBanService.getAllPhongBan());
        return "NhanVien/form";
    }

    @PostMapping("/save")
    public String saveNhanVien(@ModelAttribute("nhanVien") NhanVien nhanVien) {
        nhanVienService.saveNhanVien(nhanVien);
        return "redirect:/enhance";
    }

    @GetMapping("/delete/{id}")
    public String deleteNhanVien(@PathVariable("id") String id) {
        nhanVienService.deleteNhanVien(id);
        return "redirect:/nhanvien";
    }


}
