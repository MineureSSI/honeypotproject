package honeypot;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import org.jnetpcap.Pcap;
import org.jnetpcap.PcapIf;
import org.jnetpcap.packet.PcapPacket;
import org.jnetpcap.packet.PcapPacketHandler;
import org.jnetpcap.protocol.network.Ip4;
import org.jnetpcap.protocol.tcpip.Tcp;

public class Honeypot {
    
    public static void main(String[] args) throws Exception {      
        for (PcapIf pcapIf1 : PcapUtils.getAllPcapDevices()) {
            for (PcapIf pcapIf2 : PcapUtils.getAllPcapDevices()) {
                if(pcapIf1 != pcapIf2 && pcapIf1.getHardwareAddress() == pcapIf1.getHardwareAddress()){
                    System.out.println("Warnning : the " + pcapIf1.getAddresses().get(0).getAddr() + " and " + pcapIf1.getAddresses().get(0).getAddr() 
                        + "sharing the same MAC addresse" + pcapIf1.getHardwareAddress());
                            
                }
            }        
        }
    }
}
