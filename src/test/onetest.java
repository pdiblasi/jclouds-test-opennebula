/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import com.google.common.collect.ImmutableSet;
import com.google.inject.Module;
import org.jclouds.ContextBuilder;
import org.jclouds.opennebula.compute.ec2.*;
import org.jclouds.compute.*;
import org.jclouds.aws.config.*;
import org.jclouds.ec2.*;
import org.jclouds.logging.slf4j.config.SLF4JLoggingModule;

/**
 *
 * @author pdiblasi <ingpdiblasi at gmail.com>
 */

public class onetest {
 
    public final EC2Api oneApi;
    
    public onetest() {
        Iterable<Module> modules = ImmutableSet.<Module>of( new SLF4JLoggingModule());
        String provider = "opennebula-compute-ec2";
        String identity = "oneadmin";
        String credential = "depjouphCaj2";

        oneApi = ContextBuilder.newBuilder(provider)
                .endpoint("http://localhost:4567")
                .credentials(identity, credential)
                .modules(modules)
                .buildApi(EC2Api.class);
    }
}
