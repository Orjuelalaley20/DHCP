package org.example;

import org.onlab.packet.DHCP;
import org.onlab.packet.Ip4Address;

import java.net.DatagramSocket;
import java.net.SocketException;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws SocketException {
        DHCP server =  new DHCP();
        DatagramSocket data = new DatagramSocket();
        Ip4Address ip = Ip4Address.makeMaskPrefix(30);
        Ip4Address ip1 = Ip4Address.valueOf("192.168.0.1");

        System.out.println( ip.toString());
    }

}
