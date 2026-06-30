package com.anis.portfolio.controller;
import com.anis.portfolio.entity.ContactReq;
import com.anis.portfolio.service.ContactReqService;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@Controller
public class HomeController {

    private final ContactReqService service;

    public HomeController(ContactReqService service) {
        this.service = service;
    }

    // Home Page
    @GetMapping("/")
    public String home() {
        return "home";
    }

    // About Page
    @GetMapping("/about")
    public String about() {
        return "about";
    }

    // Certificates Page
    @GetMapping("/certificates")
    public String certificates() {
        return "certificates";
    }

    // Skills Page
    @GetMapping("/skills")
    public String skills() {
        return "skills";
    }

    // Projects Page
    @GetMapping("/projects")
    public String projects() {
        return "projects";
    }

    // Contact Page (List Contacts)
@GetMapping("/contact")
public String contact(Model model) {

    List<ContactReq> contacts = service.findAll();

    System.out.println("Total Records = " + contacts.size());

    for (ContactReq c : contacts) {
        System.out.println(
            c.getId() + " | " +
            c.getOrgTitle() + " | " +
            c.getPhoneNo() + " | " +
            c.getEmail()
        );
    }

    model.addAttribute("contacts", contacts);

    return "contact";
}
    // Show Add Form
    @GetMapping("/contact/add")
    public String showAddForm(Model model) {

        model.addAttribute("contactReq", new ContactReq());

        return "contact-form";
    }

    // Save Contact
    @PostMapping("/contact/save")
    public String save(@ModelAttribute ContactReq contactReq) {

        service.save(contactReq);

        return "redirect:/contact";
    }

    // Show Edit Form
    @GetMapping("/contact/edit/{id}")
    public String edit(@PathVariable Long id, Model model) {

          System.out.println(">>> Edit controller reached. ID = " + id);
        ContactReq contactReq = service.findById(id)
                .orElseThrow(() -> new RuntimeException("Contact not found"));

        model.addAttribute("contactReq", contactReq);

        return "contact-form";
    }

 
    // Update Contact
 /*   @PostMapping("/contact/update")
    public String update(@ModelAttribute ContactReq contactReq) {

        service.update(contactReq);

        return "redirect:/contact";
    }
*/
    // Delete Contact
    @GetMapping("/contact/delete/{id}")
    public String delete(@PathVariable Long id) {

        service.deleteById(id);

        return "redirect:/contact";
    }
}