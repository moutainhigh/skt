package net.meyki.skt.utils;

import android.annotation.TargetApi;
import android.app.ProgressDialog;
import android.os.Build;
import android.os.Environment;

import java.io.BufferedInputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.math.BigDecimal;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * 下载管理类
 *
 * @author lxy
 */
public class DownLoadManager {

    private static BigDecimal allLonth;

    @TargetApi(Build.VERSION_CODES.HONEYCOMB)
    public static File getFileFromServer(String path, ProgressDialog pd) throws Exception {
        //如果相等的话表示当前的sdcard挂载在手机上并且是可用的
        if (Environment.getExternalStorageState().equals(Environment.MEDIA_MOUNTED)) {
            URL url = new URL(path);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setConnectTimeout(5000);
            //获取到文件的大小
            int appsize = conn.getContentLength() / 1000;
            Double prigres = new BigDecimal(conn.getContentLength()).divide(new BigDecimal(1000000)).doubleValue();
            allLonth = new BigDecimal(prigres).setScale(2, BigDecimal.ROUND_DOWN);
            pd.setMax(appsize);
            InputStream is = conn.getInputStream();
            File file = new File(Environment.getExternalStorageDirectory().getAbsolutePath(), "天天有用.apk");
            if (file.exists()) {
                file.delete();
            }
            FileOutputStream fos = new FileOutputStream(file);
            BufferedInputStream bis = new BufferedInputStream(is);
            byte[] buffer = new byte[1024];
            int len;
            int total = 0;
            while ((len = bis.read(buffer)) != -1) {
                fos.write(buffer, 0, len);
                total += len;
                //获取当前下载量
                int speed = total / 1000;
                int longs = 0;
                Double prigress;
                BigDecimal size;
                if (speed < 1000) {
                    longs = total / 1000;
                    size = new BigDecimal(0).setScale(2, BigDecimal.ROUND_DOWN);
                } else {
                    prigress = new BigDecimal(total).divide(new BigDecimal(1000000)).doubleValue();
                    size = new BigDecimal(prigress).setScale(2, BigDecimal.ROUND_DOWN);
                }
                pd.setProgress(speed);
                String lonth = speed > 1000 ? size + "MB" : longs + "KB";
                pd.setProgressNumberFormat(lonth + "/" + allLonth + "MB");
            }
            fos.close();
            bis.close();
            is.close();
            return file;
        } else {
            return null;
        }
    }

    @TargetApi(Build.VERSION_CODES.HONEYCOMB)
    public static void getFileFromServer(String path, OnDownLoadListener onDownLoadListener) {
        //如果相等的话表示当前的sdcard挂载在手机上并且是可用的
        FileOutputStream fos = null;
        InputStream is = null;
        BufferedInputStream bis = null;
        try {
            if (Environment.getExternalStorageState().equals(Environment.MEDIA_MOUNTED)) {
                URL url = new URL(path);
                HttpURLConnection conn = (HttpURLConnection) url.openConnection();
                conn.setConnectTimeout(5000);
                //获取到文件的大小
                int appsize = conn.getContentLength() / 1000;
                Double prigres = new BigDecimal(conn.getContentLength()).divide(new BigDecimal(1000000)).doubleValue();
                allLonth = new BigDecimal(prigres).setScale(2, BigDecimal.ROUND_DOWN);
                //开始下载之前，设置大小
                onDownLoadListener.beforeDownLoad(appsize);
                is = conn.getInputStream();
                File file = new File(Environment.getExternalStorageDirectory().getAbsolutePath(), "美齐易家.apk");
                if (file.exists()) {
                    file.delete();
                }
                fos = new FileOutputStream(file);
                bis = new BufferedInputStream(is);
                byte[] buffer = new byte[1024];
                int len;
                int total = 0;
                while ((len = bis.read(buffer)) != -1) {
                    fos.write(buffer, 0, len);
                    total += len;
                    //获取当前下载量
                    int speed = total / 1000;
                    int longs = 0;
                    Double prigress;
                    BigDecimal size;
                    if (speed < 1000) {
                        longs = total / 1000;
                        size = new BigDecimal(0).setScale(2, BigDecimal.ROUND_DOWN);
                    } else {
                        prigress = new BigDecimal(total).divide(new BigDecimal(1000000)).doubleValue();
                        size = new BigDecimal(prigress).setScale(2, BigDecimal.ROUND_DOWN);
                    }
                    String lonth = speed > 1000 ? size + "MB" : longs + "KB";
                    String progressFormat = lonth + "/" + allLonth + "MB";
                    onDownLoadListener.downloadIng(speed, progressFormat);
                }
                onDownLoadListener.downFinish(file);
            }
        } catch (Exception e) {
            onDownLoadListener.downError(e);
        } finally {
            closeIO(fos);
            closeIO(bis);
            closeIO(is);
        }
    }

    /**
     * 关闭IO流
     * @param closeable
     */
    private static void closeIO(Closeable closeable){
        if(closeable==null){
            return ;
        }
        try {
            closeable.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public interface OnDownLoadListener {
        /**
         * 开始下载之前，获取要dowonLoad的文件的大小
         *
         * @param downloadSize
         */
        void beforeDownLoad(int downloadSize);

        /**
         * 下载中
         *
         * @param progress             进度
         * @param progressNumberFormat 被格式化以后的进度
         */
        void downloadIng(int progress, String progressNumberFormat);

        /**
         * 下载结束
         */
        void downFinish(File file);

        /**
         * 下载出错
         */
        void downError(Exception e);
    }
}

