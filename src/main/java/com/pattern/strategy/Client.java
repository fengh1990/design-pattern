package com.pattern.strategy;

import com.pattern.proxy.dynamic.cglib.ProxyFactory;
import com.pattern.visitor.vistor.Vistor;

import java.io.IOException;
import java.nio.file.Paths;

/**
 * 功能描述
 *
 * @author fengh
 * @date 2023-3-10
 */
public class Client {

    public static void main(String[] args) throws IOException {
        CompressContext compressContext = new CompressContext(new JarCompressor());
        compressContext.compressClasses(new Class[]{Vistor.class, ProxyFactory.class}, Paths.get("D:\\data\\outputJar.jar"));
        compressContext.setCompressStrategy(new ZipCompressor());
        compressContext.compress(Paths.get("D:\\datamodel"), Paths.get("D:\\data\\outputZip.zip"));
        compressContext.setCompressStrategy(new TarCompressor());
        compressContext.compress(Paths.get("D:\\datamodel"), Paths.get("D:\\data\\outputTar.tar"));
    }
}
