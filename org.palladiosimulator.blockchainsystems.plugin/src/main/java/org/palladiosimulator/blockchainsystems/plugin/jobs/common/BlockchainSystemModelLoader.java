package org.palladiosimulator.blockchainsystems.plugin.jobs.common;

import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.palladiosimulator.blockchainsystems.bscm.blockchainsystem.BlockchainSystem;
import org.palladiosimulator.blockchainsystems.bscm.blockchainsystem.BlockchainsystemPackage;
import org.palladiosimulator.blockchainsystems.bscm.blockchainsystem.impl.BlockchainSystemImpl;

public class BlockchainSystemModelLoader {

    public BlockchainSystem load(String uri) {
        BlockchainsystemPackage.eINSTANCE.eClass();

        Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
        Map<String, Object> m = reg.getExtensionToFactoryMap();
        m.put("blockchainsystem", new XMIResourceFactoryImpl());
        m.put("p2pnetwork", new XMIResourceFactoryImpl());
        m.put("nodeallocation", new XMIResourceFactoryImpl());
        m.put("blockchainsystemComponentRepository", new XMIResourceFactoryImpl());
        m.put("nodesystem", new XMIResourceFactoryImpl());
        m.put("nodeenvironment", new XMIResourceFactoryImpl());

        // Obtain a new resource set
        ResourceSet resSet = new ResourceSetImpl();

        // Get the resource
        Resource resource = resSet.getResource(URI
                .createURI(uri), true);

        EcoreUtil.resolveAll(resSet);

        BlockchainSystemImpl imp = (BlockchainSystemImpl) resource.getContents().get(0);


        return imp;
    }
}
