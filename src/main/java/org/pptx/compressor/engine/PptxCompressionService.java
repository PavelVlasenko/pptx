package org.pptx.compressor.engine;

import org.apache.poi.xslf.usermodel.XMLSlideShow;
import org.springframework.stereotype.Service;

import java.io.FileInputStream;

@Service
public class PptxCompressionService {

    public void compressPptx(String pptxPath) throws Exception {
        XMLSlideShow ppt = new XMLSlideShow(new FileInputStream(pptxPath));

    }
}
