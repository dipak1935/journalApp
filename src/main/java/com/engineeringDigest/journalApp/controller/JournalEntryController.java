package com.engineeringDigest.journalApp.controller;

import com.engineeringDigest.journalApp.entity.JournalEntry;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/journal")
public class JournalEntryController {


    private Map<Long,JournalEntry> journalEntries=new HashMap<>();

    @GetMapping
    public List<JournalEntry> getAll(){


        return new ArrayList<>(journalEntries.values());

    }

    @PostMapping
    public boolean createEntry(@RequestBody JournalEntry entry){

        journalEntries.put(entry.getId(),entry);

        return true;
    }

    @GetMapping("id/{myId}")
    public JournalEntry getJournalById(@PathVariable Long myId){

        return journalEntries.get(myId);
    }

    @DeleteMapping("id/{myId}")
    public boolean deleteJournalById(@PathVariable Long myId){

        journalEntries.remove(myId);

        return true;

    }

    @PutMapping("/id/{id}")
    public JournalEntry updateJournalById(@PathVariable Long id,@RequestBody JournalEntry myEntry){

         return journalEntries.put(id,myEntry);

    }
}
