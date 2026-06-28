import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import com.cognizant.ExternalApi;
import com.cognizant.MyService;

public class MyServiceTest {

    // =============================================
    // EXERCISE 1: Mocking and Stubbing
    // =============================================
    @Test
    public void testExternalApi_Stubbing() {
        // 1. Create a mock object for the external API
        ExternalApi mockApi = Mockito.mock(ExternalApi.class);

        // 2. Stub the method to return a predefined value
        when(mockApi.getData()).thenReturn("Mock Data");

        // 3. Inject the mock into the service and test
        MyService service = new MyService(mockApi);
        String result = service.fetchData();

        // Assert the stubbed value is returned
        assertEquals("Mock Data", result);
    }

    // =============================================
    // EXERCISE 2: Verifying Interactions
    // =============================================
    @Test
    public void testExternalApi_VerifyInteraction() {
        // 1. Create a mock object
        ExternalApi mockApi = Mockito.mock(ExternalApi.class);
        MyService service = new MyService(mockApi);

        // 2. Call the method with specific arguments (or none, in this case)
        service.fetchData();

        // 3. Verify the interaction (ensure getData() was called exactly once)
        verify(mockApi, times(1)).getData();
    }
}
