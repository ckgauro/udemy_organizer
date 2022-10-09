package com.gauro.udemyorganizer.services;

import lombok.extern.slf4j.Slf4j;
import org.apache.commons.io.FileUtils;
import org.apache.commons.io.filefilter.TrueFileFilter;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.IOException;
import java.util.*;

/**
 * @author Chandra
 */

@Slf4j
@Service
public class FolderOperations {

    public Map<String, Set<String>> getAllSectionFolder(String path) throws IOException {
        Map<String, Set<String>> mapPaths=new HashMap<>();
        File dir = new File(path);

        List<File> files = (List<File>) FileUtils.listFiles(dir, TrueFileFilter.INSTANCE, TrueFileFilter.INSTANCE);
        for (File file : files) {
            String folder= StringUtils.substringAfter(file.getCanonicalPath(),path+"/");
           // System.out.println(folder);
            if(folder.startsWith("Section")){
                String folderName=StringUtils.substringBefore(folder,"/");
                log.info("===>"+folderName);

                if(!mapPaths.containsKey(folderName)){
                    mapPaths.put(folderName,new HashSet<>());
                }
                log.info("Size inside :"+mapPaths.size());
                String fileName=StringUtils.substringAfter(folder,"/");
               // System.out.println(folder);
               // System.out.println(fileName);
                char ch = fileName.trim().charAt(0);
                if((ch >= '0' && ch <= '9')|| fileName.trim().equalsIgnoreCase("Readme.md")){
                    Set<String> folderSet=mapPaths.get(folderName);
                    folderSet.add(fileName);
                    mapPaths.put(folderName, folderSet);
                }
            }
        }
        return mapPaths;
    }
}
