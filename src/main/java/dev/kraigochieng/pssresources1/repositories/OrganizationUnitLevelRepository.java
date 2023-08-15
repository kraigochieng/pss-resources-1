package dev.kraigochieng.pssresources1.repositories;

import dev.kraigochieng.pssresources1.models.OrganisationUnitLevel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.rmi.server.UID;

public interface OrganizationUnitLevelRepository extends JpaRepository<OrganisationUnitLevel, UID> {
}
