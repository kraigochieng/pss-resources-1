package dev.kraigochieng.pssresources1.controllers;

import dev.kraigochieng.pssresources1.dtos.responses.OrganisationUnitLevelResponse;
import dev.kraigochieng.pssresources1.services.OrganisationUnitLevelServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/organisationUnitLevels")
@CrossOrigin
public class OrganisationUnitLevelController {
    @Autowired
    OrganisationUnitLevelServiceImpl organisationUnitLevelServiceImpl;
    @GetMapping
    public ResponseEntity<OrganisationUnitLevelResponse> getOrganisationUnitLevels() {
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(organisationUnitLevelServiceImpl.getOrganisationUnitLevels());
    }
}
