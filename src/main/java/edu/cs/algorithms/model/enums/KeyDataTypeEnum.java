package edu.cs.algorithms.model.enums;

public enum KeyDataTypeEnum {

    INTEGER(1, "INT"),
    LONG(2, "LONG"),
    FLOAT(3, "FLOAT"),
    DOUBLE(4, "DOUBLE"),
    STRING(5, "STRING");

    private Integer dataTypeId;
    private String dataType;

    KeyDataTypeEnum(Integer dataTypeId, String dataType) {
        this.dataTypeId = dataTypeId;
        this.dataType = dataType;
    }

    public Integer getDataTypeId() {
        return dataTypeId;
    }

    public String getDataType() {
        return dataType;
    }

    public static KeyDataTypeEnum findDataTypeByDescription(String dataTypeDescription) {
        for(KeyDataTypeEnum keyDataType : KeyDataTypeEnum.values()) {
            if(keyDataType.getDataType().equals(dataTypeDescription)) {
                return keyDataType;
            }
        }
        return null;
    }
}
