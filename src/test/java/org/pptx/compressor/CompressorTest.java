package org.pptx.compressor;

import org.junit.Test;
import org.pptx.compressor.engine.PptxCompressionService;

public class CompressorTest {

    @Test
    public void testCompression()throws Exception {
        PptxCompressionService compressionService = new PptxCompressionService();
        compressionService.compressPptx("C:\\Users\\SBT-Vlasenko-PV\\Documents\\test\\presentation.pptx");

    }
}
