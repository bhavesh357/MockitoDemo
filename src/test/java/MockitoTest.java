import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;


public class MockitoTest {
    @Mock
    MyDataBase databaseMock;

    @Rule
    public MockitoRule mockitoRule = MockitoJUnit.rule();
    private EntityManager entityManager;

    @Test
    public void testQuery() {
    ClassToTest t = new ClassToTest(databaseMock);
    when(databaseMock.query("* from t")).thenReturn(true);
    boolean query = t.query("* from t");
    Assert.assertTrue(query);
    }

    @Test
    public void customerReaderTest() {
        Customer customer = new Customer("Bhavesh", "Kadam");
        EntityManager entityManager = mock(EntityManager.class);
        when(entityManager.find(Customer.class,1L)).thenReturn(customer);
        CustomerReader customerReader = new CustomerReader();
        customerReader.setEntityManager(entityManager);
        String fullName = customerReader.findFullName(1L);
        Assert.assertEquals("Bhavesh Kadam",fullName);

    }
}
