package com.example.ws.rest;

import com.example.domain.Breach;
import com.example.domain.Exclusion;
import com.example.repository.BreachRepository;
import com.example.repository.ExclusionRepository;
import com.example.service.BreachService;
import com.example.service.ExclusionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by gatomulesei on 12/14/2016.
 */
@RestController
@RequestMapping("/rest/breaches")
public class BreachEndpoint {

    @Autowired
    BreachRepository breachRepository;

    @Autowired
    BreachService breachService;

    @Autowired
    ExclusionService exclusionService;

    @Autowired
    ExclusionRepository exclusionRepository;

    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<?> createBreach(@RequestBody Breach breach, @RequestParam Long exclusionId){
    	Exclusion exclusion = exclusionRepository.findOne(exclusionId);
        breach.setExclusion(exclusion);
        Breach br = breachService.createBreach(breach);
        
        
        URI location = URI.create("/rest/breaches" + br.getId());
        return ResponseEntity.created(location).body(br.getId());
    } 
    
    @RequestMapping(method = RequestMethod.GET)
	public List<Breach> retrieveAllBreaches(){
		return breachRepository.findAll();
	}
    
    @RequestMapping(value = "{breachId}", method = RequestMethod.GET)
    public Breach retrieveBreach(@PathVariable Long breachId){
    	Breach breach = breachRepository.findOne(breachId);
    	return breach;
    }
    
    
}
