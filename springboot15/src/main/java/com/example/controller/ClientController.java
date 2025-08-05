package com.example.controller;

import com.example.model.Client;
import com.example.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class ClientController {

    @Autowired
    private ClientService service;

    @GetMapping("/")
    public String viewHomePage(Model model) {
        model.addAttribute("listClients", service.listAll());
        return "index";
    }

    @GetMapping("/add")
    public String showNewForm(Model model) {
        model.addAttribute("client", new Client());
        return "add_client";
    }

    @PostMapping("/save")
    public String saveClient(@ModelAttribute("client") Client client) {
        service.save(client);
        return "redirect:/";
    }

    @GetMapping("/edit/{id}")
    public String showEditForm(@PathVariable("id") Long id, Model model) {
        model.addAttribute("client", service.get(id));
        return "edit_client";
    }

    @GetMapping("/delete/{id}")
    public String deleteClient(@PathVariable("id") Long id) {
        service.delete(id);
        return "redirect:/";
    }
    @GetMapping("/add")
    public String showNewForm1(Model model) {
        model.addAttribute("client", new Client());
        return "client_form";  // ✅ use single file
    }

    @GetMapping("/edit/{id}")
    public String showEditForm1(@PathVariable("id") Long id, Model model) {
        model.addAttribute("client", service.get(id));
        return "client_form";  // ✅ same file
    }

}
