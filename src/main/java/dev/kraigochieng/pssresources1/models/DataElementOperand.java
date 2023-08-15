package dev.kraigochieng.pssresources1.models;

import dev.kraigochieng.pssresources1.dtos.response_fields.Sharing;
import dev.kraigochieng.pssresources1.dtos.response_fields.Translation;
import dev.kraigochieng.pssresources1.dtos.unknowns.*;
import dev.kraigochieng.pssresources1.enums.AggregationType;
import dev.kraigochieng.pssresources1.enums.DimensionItemType;
import jakarta.annotation.PostConstruct;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "data_element_operands")
@Entity(name = "DataElementOperands")
public class DataElementOperand {


    private AggregationType aggregationType;
    private String displayName;
    private String displayShortName;
    private boolean externalAccess;
    @Id
    private String id;

    private String dimensionItem;
    private String displayFormName;
    private String name;
    private String shortName;
    private boolean favorite;
    private DimensionItemType dimensionItemType;

    private CategoryOptionCombo categoryOptionCombo;
    private DataElement dataElement;

    private Access access;
    private Sharing sharing;
    private List<Favorite> favorites;
    private List<Translation> translations;
    private List<UserGroupAccess> userGroupAccesses;
    private List<AttributeValue> attributeValues;
    private List<UserAccess> userAccesses;
    private List<LegendSet> legendSets;

    @PostConstruct
    void init() {

    }
//    {
//        "aggregationType": "SUM",
//            "displayName": "Benchmark_PS07",
//            "displayShortName": "Benchmark_PS07",
//            "externalAccess": false,
//            "id": "seFChzPxFBQ",
//            "dimensionItem": "seFChzPxFBQ.HllvX50cXC0",
//            "displayFormName": "Benchmark_PS07",
//            "name": "Benchmark_PS07",
//            "shortName": "Benchmark_PS07",
//            "favorite": false,
//            "dimensionItemType": "DATA_ELEMENT_OPERAND",
//            "access": {
//        "read": true,
//                "update": true,
//                "externalize": true,
//                "delete": true,
//                "write": true,
//                "manage": true
//    },
//        "categoryOptionCombo": {
//        "id": "HllvX50cXC0"
//    },
//        "dataElement": {
//        "id": "seFChzPxFBQ"
//    },
//        "sharing": {
//        "userGroups": {},
//        "external": false,
//                "users": {}
//    },
//        "favorites": [],
//        "translations": [],
//        "userGroupAccesses": [],
//        "attributeValues": [],
//        "userAccesses": [],
//        "legendSets": []
//    },
}
