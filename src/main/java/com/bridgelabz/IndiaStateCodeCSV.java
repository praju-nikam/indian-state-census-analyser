package com.bridgelabz;
import com.opencsv.bean.CsvBindByName;

public class IndiaStateCodeCSV {
    private String srNo;

    private String state;

    private String tin;

    private String stateCode;


    @Override
    public String toString() {
        return "srNo = " + srNo +
                ", state = " + state +
                ", tin = " + tin +
                ", stateCode = " + stateCode;
    }
}