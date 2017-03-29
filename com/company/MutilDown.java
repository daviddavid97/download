package com.company;

/**
 * Created by zxy on 3/26/17.
 */
import java.net.URL;
import java.net.URLConnection;

public class MutilDown {



    // 定义获取指定网络资源的长度的方法
    public static long getFileLength(URL url) throws Exception {
        long length = 0;
        // 打开该URL对应的URLConnection
        URLConnection con = url.openConnection();
        // 获取连接URL资源的长度
        long size = con.getContentLength();
        length = size;
        return length;
    }

}
