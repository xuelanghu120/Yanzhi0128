package com.common.utils;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by anzhuo on 2016/1/29.
 */
public class FileUtils {
    private static final String TAG = "FileUtils";

    //保存文件
    public static boolean saveFile(String content, String filename) {
        boolean ret = false;
        try {
            FileOutputStream fout = new FileOutputStream(filename);
            fout.write(content.getBytes());
            fout.close();
            ret = true;
        }
        catch (FileNotFoundException fe) {
            fe.printStackTrace();
        }
        catch (IOException ie) {
            ie.printStackTrace();
        }
        return ret;
    }
    //删除文件
    public static boolean deleteFile(String filePath) {
        boolean ret = false;
        try {
            ret = false;
            File f = new File(filePath);
            if (f.exists()) {
                ret = f.delete();
            }
        } catch (Exception e) {
            Logger.e(TAG, "deleteFile", e);
        }
        return ret;
    }
}
