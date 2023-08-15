package dev.kraigochieng.pssresources1.dtos.responses;

import dev.kraigochieng.pssresources1.dtos.Pager;
import dev.kraigochieng.pssresources1.models.OrganisationUnitLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class OrganisationUnitLevelResponse {
    public Pager pager;
    public List<OrganisationUnitLevel> organisationUnitLevels;
}
