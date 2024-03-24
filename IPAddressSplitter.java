/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package day2;

/**
 *
 * @author clt
 */
public class IPAddressSplitter {
    public static void main(String[] args) {

        String ipAddress ="163.121.12.30";

        String[] parts = ipAddress.split("\\.");

        System.out.println("The result is:");
        for (String part : parts) {
            System.out.println(part);
        }

        
    }
}
