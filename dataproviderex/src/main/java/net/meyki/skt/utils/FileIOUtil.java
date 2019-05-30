package net.meyki.skt.utils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.util.Log;

/**
 * android文件的一些读取操作
 */
public class FileIOUtil {

    public static String readRawFile(Context context, int resid) {
        String content;
        Resources resources = context.getResources();
        InputStream is = null;
        try {
            is = resources.openRawResource(resid);
            byte buffer[] = new byte[is.available()];
            is.read(buffer);
            content = new String(buffer);
            //Log.i(tag, "read:"+content);
            return content;
        } catch (IOException e) {
            // Log.e(tag, "write file",e);
        } finally {
            if (is != null) {
                try {
                    is.close();
                } catch (IOException e) {
                    //  Log.e(tag, "close file",e);
                }
            }
        }
        return "";
    }

    public static String getStringFromAssert(Context context, String fileName) {
        StringBuilder ReturnString = new StringBuilder();
        InputStream fIn = null;
        InputStreamReader isr = null;
        BufferedReader input = null;
        try {
            fIn = context.getResources().getAssets()
                    .open(fileName);
            isr = new InputStreamReader(fIn);
            input = new BufferedReader(isr);
            String line = "";
            while ((line = input.readLine()) != null) {
                ReturnString.append(line);
            }
        } catch (Exception e) {
            e.getMessage();
        } finally {
            try {
                if (isr != null)
                    isr.close();
                if (fIn != null)
                    fIn.close();
                if (input != null)
                    input.close();
            } catch (Exception e2) {
                e2.getMessage();
            }
        }
        return ReturnString.toString();
    }

    public static List<String> readAssertResource(Context context,
                                                  String strAssertFileName) {
        AssetManager assetManager = context.getAssets();
        Log.d("meyki", assetManager.toString());
        List<String> strList = new ArrayList<String>();
        try {
            InputStream ims = assetManager.open(strAssertFileName);
            Log.d("meyki", ims.toString());
            strList = getStringFromInputStream(ims);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return strList;
    }

    private static List<String> getStringFromInputStream(InputStream a_is) {
        BufferedReader br = null;
        List<String> list = new ArrayList<String>();
        String line;
        try {
            br = new BufferedReader(new InputStreamReader(a_is));
            while ((line = br.readLine()) != null) {
////				Log.d("meyki", line);
//				sb.append(line);
                list.add(line);
            }
        } catch (IOException e) {
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                }
            }
        }
        return list;
    }
}
