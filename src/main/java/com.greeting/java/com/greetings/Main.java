package com.greetings;

import com.socket.NetworkSocket;
import org.apache.logging.log4j.simple.SimpleLogger;
import org.astro.World;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.apache.logging.log4j.simple.SimpleLogger.*;

/**
 * @author fjun(fjun2008@gmail.com)
 * @version v1.0.0
 * @date 2017-08-13
 * @since v1.0.0
 */
public class Main {
    private static final Logger logger = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {
        System.out.format("Greetings, %s!\n", World.name());
        NetworkSocket s = NetworkSocket.open();
        System.out.println(s.getClass());
        logger.debug("fuck");
    }
}
