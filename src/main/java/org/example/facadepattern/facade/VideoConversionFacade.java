package org.example.facadepattern.facade;

import java.io.File;

public interface VideoConversionFacade {
    File convertVideo(String fileName, String format);
}
