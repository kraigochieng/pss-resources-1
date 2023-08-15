package dev.kraigochieng.pssresources1.dtos.responses;

import dev.kraigochieng.pssresources1.dtos.Pager;
import dev.kraigochieng.pssresources1.models.DataElementOperand;

import java.util.List;

public class DataElementOperandResponse {
    public Pager pager;
    public List<DataElementOperand> dataElementOperands;
}
