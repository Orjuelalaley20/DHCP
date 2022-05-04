package org.example;

import org.onlab.packet.DHCP;
import org.onlab.packet.Ip4Address;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        DHCP server =  new DHCP();
        Ip4Address ip = Ip4Address.makeMaskPrefix(29);
        Ip4Address ip1 = Ip4Address.valueOf("192.168.0.1");
        server.serialize();
        System.out.println( ip1.toInt());
    }

}
