package com.socket;

import com.socket.spi.NetworkSocketProvider;

import java.io.Closeable;
import java.util.Iterator;
import java.util.ServiceLoader;

/**
 * @author fjun(fjun2008@gmail.com)
 * @version v1.0.0
 * @date 2017-08-13
 * @since v1.0.0
 */
public abstract class NetworkSocket implements Closeable {
    protected NetworkSocket() { }

    public static NetworkSocket open() {
        ServiceLoader<NetworkSocketProvider> sl
                = ServiceLoader.load(NetworkSocketProvider.class);
        Iterator<NetworkSocketProvider> iter = sl.iterator();
        if (!iter.hasNext())
            throw new RuntimeException("No service providers found!");
        NetworkSocketProvider provider = iter.next();
        return provider.openNetworkSocket();
    }
}

