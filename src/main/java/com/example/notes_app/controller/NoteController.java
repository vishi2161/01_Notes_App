package com.example.notes_app.controller;

import com.example.notes_app.entity.Note;
import com.example.notes_app.repository.NoteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/notes")
public class NoteController {

    @Autowired
    private NoteRepository noteRepository;

    @GetMapping
    public List<Note> getAllNotes(){
        return noteRepository.findAll();
    }

    @GetMapping("/{id}")
    public Note getNoteById(@PathVariable Long id){
        return noteRepository.findById(id).orElse(null);
    }

    @PostMapping
    public Note createNote(@RequestBody Note note){
        return noteRepository.save(note);
    }

    @PutMapping("/{id}")
    public Note updateNote(@PathVariable Long id, @RequestBody Note updatedNotes){
        Note note = noteRepository.findById(id).orElse(null);
        if (note != null){
            note.setTitle(updatedNotes.getTitle());
            note.setContent(updatedNotes.getContent());
            return noteRepository.save(note);
        }
        return null;
    }

    @DeleteMapping("/{id}")
    public String deleteNote(@PathVariable Long id){
        noteRepository.deleteById(id);
        return "Note deleted with id " + id;
    }
}
