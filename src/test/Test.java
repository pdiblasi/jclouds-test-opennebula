/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.util.Set;

/**
 *
 * @author pdiblasi <ingpdiblasi at gmail.com>
 */

public class Test {
    //static String region="region";

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        onetest opennebula=new onetest();
        opennebula.listRegions();
        
//        Set <String> regions = opennebula.oneApi.getConfiguredRegions();
//        System.out.println(regions.size());
//        System.out.println(regions.isEmpty());
        
//        opennebula.oneApi.getSubnetApi();

        
        
    }
    
}
