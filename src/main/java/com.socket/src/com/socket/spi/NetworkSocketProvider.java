package com.socket.spi;

import com.socket.NetworkSocket;

/**
 * @author fjun(fjun2008@gmail.com)
 * @version v1.0.0
 * @date 2017-08-13
 * @since v1.0.0
 */
public abstract class NetworkSocketProvider {
    protected NetworkSocketProvider() { }

    public abstract NetworkSocket openNetworkSocket();
}

