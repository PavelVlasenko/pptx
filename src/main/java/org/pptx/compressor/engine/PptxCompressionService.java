package org.pptx.compressor.engine;

import org.apache.poi.xslf.usermodel.XMLSlideShow;
import org.apache.poi.xslf.usermodel.XSLFSlideLayout;
import org.apache.poi.xslf.usermodel.XSLFSlideMaster;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.lang.reflect.Field;
import java.util.Map;

@Service
public class PptxCompressionService {

    public void compressPptx(String pptxPath) throws Exception {


        XMLSlideShow ppt = new XMLSlideShow(new FileInputStream(pptxPath));
        XSLFSlideMaster sm = ppt.getSlideMasters().get(0);

        Field f = sm.getClass().getDeclaredField("_layouts"); //NoSuchFieldException
        f.setAccessible(true);

        Map<String, XSLFSlideLayout> layouts = (Map<String, XSLFSlideLayout>)f.get(sm);


        Integer i = 9;

        FileOutputStream out = new FileOutputStream(new File("C:\\Users\\SBT-Vlasenko-PV\\Documents\\test\\output.pptx"));
        ppt.write(out);
        out.close();
    }
}
