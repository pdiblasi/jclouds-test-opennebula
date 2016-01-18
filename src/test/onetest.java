/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import com.google.common.collect.ImmutableSet;
import com.google.inject.Module;
import java.util.Set;
import org.jclouds.ContextBuilder;
//import org.jclouds.opennebula.compute.ec2.*;
//import org.jclouds.compute.*;
//import org.jclouds.aws.config.*;
import org.jclouds.ec2.*;
//import org.jclouds.ec2.features.InstanceApi;
import org.jclouds.logging.slf4j.config.SLF4JLoggingModule;

public class onetest {
 
    public final EC2Api oneApi;
    private final Set<String> regions;
    
    public onetest() {
        Iterable<Module> modules = ImmutableSet.<Module>of( new SLF4JLoggingModule());
        
        String provider = "opennebula-compute-ec2";
//        String one_auth = "oneadmin:depjouphCaj2";
        String one_auth_identity = "oneadmin";
        String one_auth_credential = "cf8bc9580418014ec663e4604396cd9ec71fbf53";    //sha1
//        String EC2auth = "serveradmin:8edd21ecbf87590509f38e86e8801a72fad2d15b";
//        String EC2auth_identity = "oneadmin";
//        String EC2auth_credential = "depjouphCaj2";

        oneApi = ContextBuilder.newBuilder(provider)
                .endpoint("http://localhost:4567")
                .credentials(one_auth_identity, one_auth_credential)
                .modules(modules)
                .buildApi(EC2Api.class);
        regions = oneApi.getConfiguredRegions();
        
    }
    public void listRegions() {
        for (String region : regions) {
            System.out.println(region);
            
            // ServerApi serverApi = novaApi.getServerApi(region);
            
            // System.out.println("Servers in " + region);
            
            // for (Server server : serverApi.listInDetail().concat()) {
            //     System.out.println("  " + server);
            //     System.out.println(this.toJSON(server));
            // }
        }
    }
}
