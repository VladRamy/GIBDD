package com.example.onemore.Controllers;


import com.example.onemore.Repositories.AvailableNumbersRepository;
import com.example.onemore.Services.AvailableNumbersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.onemore.models.AvailableNumbers;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
    @RestController
    public class AvailableNumbersController {
        private final AvailableNumbersRepository availableNumbersRepository;
        private final AvailableNumbersService availableNumbersService;

        @Autowired
        public AvailableNumbersController(AvailableNumbersService availableNumbersService, AvailableNumbersRepository availableNumbersRepository) {
            this.availableNumbersService = availableNumbersService;
            this.availableNumbersRepository = availableNumbersRepository;
        }

        @GetMapping("/please")
        public String hello(){return "hello world";}

        @GetMapping("/getAll")
        public List<AvailableNumbers> getAllAvailableNumbers() {
            return availableNumbersService.getAllAvailableNumbers();
        }

        @GetMapping("/{id}")
        public AvailableNumbers getAvailableNumbers(@PathVariable Integer id) {
            return availableNumbersService.getAvailableNumbers(id);
        }

        @PostMapping("")
        public void createAvailableNumbers(@RequestBody AvailableNumbers account) {
                availableNumbersService.updateAvailableNumbers(account);
        }

        @PutMapping("")
        public void updateAccount(@RequestBody AvailableNumbers account) {
            availableNumbersService.updateAvailableNumbers(account);
        }

        @DeleteMapping("/{id}")
        public void deleteAccount(@PathVariable Integer id) {
            availableNumbersService.deleteAvailableNumbers(id);
        }
        @GetMapping("/availableNumbers")
        public ModelAndView getAllNumbers() {
            return new ModelAndView("availableNumbers_list").addObject("numbers", availableNumbersService.getAllAvailableNumbers());
        }
    }


