/**
 */
package bscm.nodeallocation.tests;

import bscm.blockchainsystem.tests.BlockchainsystemTests;

import bscm.blockchainsystemComponentRepository.tests.BlockchainsystemComponentRepositoryTests;

import bscm.nodeenvironment.tests.NodeenvironmentTests;

import bscm.nodesystem.tests.NodesystemTests;

import bscm.p2pnetwork.tests.P2pnetworkTests;

import ecore.tests.EcoreTests;

import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;

import pcm.allocation.tests.AllocationTests;

import pcm.core.composition.tests.CompositionTests;

import pcm.core.entity.tests.EntityTests;

import pcm.core.tests.CoreTests;

import pcm.parameter.tests.ParameterTests;

import pcm.qosannotations.qos_performance.tests.Qos_performanceTests;

import pcm.qosannotations.qos_reliability.tests.Qos_reliabilityTests;

import pcm.qosannotations.tests.QosannotationsTests;

import pcm.reliability.tests.ReliabilityTests;

import pcm.repository.tests.RepositoryTests;

import pcm.resourceenvironment.tests.ResourceenvironmentTests;

import pcm.resourcetype.tests.ResourcetypeTests;

import pcm.seff.seff_performance.tests.Seff_performanceTests;

import pcm.seff.seff_reliability.tests.Seff_reliabilityTests;

import pcm.seff.tests.SeffTests;

import pcm.subsystem.tests.SubsystemTests;

import pcm.system.tests.SystemTests;

import pcm.tests.PcmTests;

import pcm.usagemodel.tests.UsagemodelTests;

import stoex.tests.StoexTests;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>Bscm</b></em>' model.
 * <!-- end-user-doc -->
 * @generated
 */
public class BscmAllTests extends TestSuite {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(suite());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Test suite() {
		TestSuite suite = new BscmAllTests("Bscm Tests");
		suite.addTest(NodeallocationTests.suite());
		suite.addTest(NodesystemTests.suite());
		suite.addTest(BlockchainsystemComponentRepositoryTests.suite());
		suite.addTest(P2pnetworkTests.suite());
		suite.addTest(BlockchainsystemTests.suite());
		suite.addTest(NodeenvironmentTests.suite());
		suite.addTest(PcmTests.suite());
		suite.addTest(CoreTests.suite());
		suite.addTest(EntityTests.suite());
		suite.addTest(CompositionTests.suite());
		suite.addTest(UsagemodelTests.suite());
		suite.addTest(RepositoryTests.suite());
		suite.addTest(ResourcetypeTests.suite());
		suite.addTest(ParameterTests.suite());
		suite.addTest(ReliabilityTests.suite());
		suite.addTest(SeffTests.suite());
		suite.addTest(Seff_performanceTests.suite());
		suite.addTest(Seff_reliabilityTests.suite());
		suite.addTest(QosannotationsTests.suite());
		suite.addTest(Qos_performanceTests.suite());
		suite.addTest(Qos_reliabilityTests.suite());
		suite.addTest(SystemTests.suite());
		suite.addTest(ResourceenvironmentTests.suite());
		suite.addTest(AllocationTests.suite());
		suite.addTest(SubsystemTests.suite());
		suite.addTest(EcoreTests.suite());
		suite.addTest(StoexTests.suite());
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BscmAllTests(String name) {
		super(name);
	}

} //BscmAllTests
