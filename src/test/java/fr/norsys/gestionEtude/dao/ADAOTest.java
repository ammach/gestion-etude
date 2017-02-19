package fr.norsys.gestionEtude.dao;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestExecutionListeners;
import org.springframework.test.context.junit4.AbstractTransactionalJUnit4SpringContextTests;

import com.github.springtestdbunit.DbUnitTestExecutionListener;
import com.github.springtestdbunit.annotation.DatabaseSetup;
import com.github.springtestdbunit.annotation.DatabaseTearDown;
import com.github.springtestdbunit.annotation.DbUnitConfiguration;
import com.github.springtestdbunit.operation.MicrosoftSqlDatabaseOperationLookup;

@ContextConfiguration(locations = "classpath:spring/layer-dao-test.xml")
@TestExecutionListeners(listeners = DbUnitTestExecutionListener.class)
@DbUnitConfiguration(databaseConnection = "dataSource",
        databaseOperationLookup = MicrosoftSqlDatabaseOperationLookup.class)
@DatabaseSetup(value = { "classpath:/datasets/dataset.xml" })
@DatabaseTearDown("classpath:/datasets/dataset-clean.xml")
public abstract class ADAOTest extends AbstractTransactionalJUnit4SpringContextTests {

}
