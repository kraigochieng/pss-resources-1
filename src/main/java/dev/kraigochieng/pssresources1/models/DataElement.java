package dev.kraigochieng.pssresources1.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "data_element")
@Entity(name = "DataElement")
public class DataElement {
    @Id
    private String id;
    private String displayName;
}
