package com.fundoonotes.service;

import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
public class NoteService {

    @Cacheable(value = "notes", key = "#id")
    public String getNote(Long id) {
        return "Fetching Note From DB " + id;
    }

    @CachePut(value = "notes", key = "#id")
    public String updateNote(Long id) {
        return "Updated Note " + id;
    }

    @CacheEvict(value = "notes", key = "#id")
    public void deleteNote(Long id) {
        System.out.println("Deleted Note " + id);
    }
}
