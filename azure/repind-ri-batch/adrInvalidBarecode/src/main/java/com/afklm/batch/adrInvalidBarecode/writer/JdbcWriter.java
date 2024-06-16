package com.afklm.batch.adrInvalidBarecode.writer;

import com.afklm.batch.adrInvalidBarecode.service.PostalAddressInvalidBarecodeDS;
import com.afklm.batch.adrInvalidBarecode.model.OutputRecord;
import com.afklm.batch.adrInvalidBarecode.service.AdrInvalidBarecodeSummaryService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.batch.item.ItemWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Slf4j
public class JdbcWriter implements ItemWriter<OutputRecord> {
    @Autowired
    PostalAddressInvalidBarecodeDS postalAddressDS;

    @Autowired
    AdrInvalidBarecodeSummaryService summaryService;
    @Override
    public void write(List<? extends OutputRecord> outputRecords) throws Exception {
        for (OutputRecord outputRecord : outputRecords) {
            try{
                postalAddressDS.updatePoastalAddressStatus(outputRecord);
            }catch(Exception e){
                log.error("[-] Exception : {} ", e.getMessage());
                summaryService.incrementRejectedCounter();
                summaryService.incrementUnknownReasonLinesCounter();
                outputRecord.setMessage("TECHNICAL ERROR when processing ain "+outputRecord.getSain());
            }
        }
    }
}