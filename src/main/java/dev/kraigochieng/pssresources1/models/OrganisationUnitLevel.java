package dev.kraigochieng.pssresources1.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.rmi.server.UID;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "organization_unit_level")
@Entity(name = "OrganizationUnitLevel")
public class OrganisationUnitLevel {
    @Id
    private String id;

    @Column(name = "display_name")
    private String displayName;
}
