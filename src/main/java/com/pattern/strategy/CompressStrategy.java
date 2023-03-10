package com.pattern.strategy;

import java.io.IOException;
import java.io.OutputStream;
import java.util.Collection;

/**
 * 功能描述
 *
 * @author fengh
 * @date 2023-3-10
 */
public interface CompressStrategy {

    void compress(Collection<CompressEntry> compressEntries, OutputStream out) throws IOException;
}
