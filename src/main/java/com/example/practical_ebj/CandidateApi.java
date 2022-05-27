package com.example.practical_ebj;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "api/v1/cadidates")
public class CandidateApi {

    @Autowired
    CandidateService candidateService;

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<List<Candidate>> getlist() {
        return ResponseEntity.ok(candidateService.findAll());
    }

    @PostMapping
    public ResponseEntity<Candidate> save(@RequestBody Candidate p) {
        return ResponseEntity.ok(candidateService.save(p));
    }
}
