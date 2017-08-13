package org.fastsocket;

import com.socket.NetworkSocket;
import com.socket.spi.NetworkSocketProvider;

/**
 * @author fjun(fjun2008@gmail.com)
 * @version v1.0.0
 * @date 2017-08-13
 * @since v1.0.0
 */
public class FastNetworkSocketProvider extends NetworkSocketProvider {
    public FastNetworkSocketProvider() { }

    @Override
    public NetworkSocket openNetworkSocket() {
        return new FastNetworkSocket();
    }
}
