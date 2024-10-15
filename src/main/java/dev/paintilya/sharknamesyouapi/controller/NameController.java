package dev.paintilya.sharknamesyouapi.controller;

import dev.paintilya.sharknamesyouapi.dao.NameDAO;
import dev.paintilya.sharknamesyouapi.model.Name;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping("/")
public class NameController {

    @Autowired
    @Qualifier(value = "girlNameDAO")
    private NameDAO girlNameDAO;

    @Autowired
    @Qualifier(value = "boyNameDAO")
    private NameDAO boyNameDAO;

    @Autowired
    @Qualifier(value = "bothNameDAO")
    private NameDAO bothNameDAO;

    @GetMapping("/list/girl")
    public List<Name> getListGirl() throws IOException {
        return girlNameDAO.getAll();
    }

    @GetMapping("/list/boy")
    public List<Name> getListBoy() throws IOException {
        return boyNameDAO.getAll();
    }

    @GetMapping("/list/both")
    public List<Name> getListBoth() throws IOException {
        return bothNameDAO.getAll();
    }

    @GetMapping("/name/girl")
    public Name getRandomNameGirl() throws IOException {
        return girlNameDAO.getRandomName();
    }

    @GetMapping("/name/boy")
    public Name getRandomNameBoy() throws IOException {
        return boyNameDAO.getRandomName();
    }

    @GetMapping("/name/both")
    public Name getRandomNameBoth() throws IOException {
        return bothNameDAO.getRandomName();
    }
}
