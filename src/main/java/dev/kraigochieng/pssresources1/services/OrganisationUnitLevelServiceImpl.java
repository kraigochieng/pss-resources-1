package dev.kraigochieng.pssresources1.services;

import dev.kraigochieng.pssresources1.dtos.responses.OrganisationUnitLevelResponse;
import dev.kraigochieng.pssresources1.models.OrganisationUnitLevel;
import dev.kraigochieng.pssresources1.repositories.OrganizationUnitLevelRepository;
import jakarta.annotation.PostConstruct;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
@Slf4j
public class OrganisationUnitLevelServiceImpl implements OrganisationUnitLevelService {
    @Autowired
    RestTemplate restTemplate;

    @Autowired
    OrganizationUnitLevelRepository organizationUnitLevelRepository;
    private String url;
    @PostConstruct
    void init() {
        url = "https://pssinternational.intellisoftkenya.com/api/organisationUnitLevels";
    }
    @Override
    public OrganisationUnitLevelResponse getOrganisationUnitLevels() {
        // Set headers
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.setBasicAuth("admin", "district");

        // set HTTP entity
        HttpEntity httpEntity = new HttpEntity<>(httpHeaders);

        // APi call
        ResponseEntity<OrganisationUnitLevelResponse> response = restTemplate.exchange(
                url,
                HttpMethod.GET,
                httpEntity,
                OrganisationUnitLevelResponse.class
        );

        log.info(String.valueOf(response.getBody()));
        // Store the lists in database
        List<OrganisationUnitLevel> organisationUnitLevels = response.getBody().getOrganisationUnitLevels();
        organizationUnitLevelRepository.saveAll(organisationUnitLevels);

        return  response.getBody();
    }
}
