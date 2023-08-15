package dev.kraigochieng.pssresources1.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Pager {
    private int page;
    private int pageCount;
    private int total;
    private int pageSize;
    private String nextPage;
    private String prevPage;
}
