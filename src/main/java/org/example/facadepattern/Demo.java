package org.example.facadepattern;

import org.example.facadepattern.facade.VideoConversionFacade;
import org.example.facadepattern.facade.VideoConversionFacadeImpl;

import java.io.File;

public class Demo {
    public static void main(String[] args) {
        VideoConversionFacade converter = new VideoConversionFacadeImpl();
        File mp4Video = converter.convertVideo("youtubevideo.ogg", "mp4");
        // ...
    }
}
