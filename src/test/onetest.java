/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import org.jclouds.ContextBuilder;
import org.jclouds.opennebula.compute.ec2.*;
import org.jclouds.compute.*;
import org.jclouds.aws.config.*;
/**
 *
 * @author pdiblasi <ingpdiblasi at gmail.com>
 */

public class onetest {
 
    private final OpenNebulaComputeEC2Api oneApi;
    
    public onetest() {

        String provider = "opennebula-compute-ec2";
        String identity = "oneadmin";
        String credential = "depjouphCaj2";

        oneApi = ContextBuilder.newBuilder(provider)
                .endpoint("http://localhost:4567")
                .credentials(identity, credential)
                .buildApi(OpenNebulaComputeEC2Api.class);
    }    
}
