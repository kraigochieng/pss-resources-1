package dev.kraigochieng.pssresources1.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "access")
@Entity(name = "Access")
public class Access {
    private boolean read;
    private boolean update;
    private boolean externalize;
    private boolean delete;
    private boolean write;
    private boolean manage;
}
