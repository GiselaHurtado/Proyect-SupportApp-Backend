package dev.gise.supportApp.services;

import dev.gise.supportApp.models.Request;
import dev.gise.supportApp.repositories.RequestRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class RequestServiceTest {

    @Mock
    private RequestRepository requestRepository;

    @InjectMocks
    private RequestService requestService;

    private Request testRequest;

    @BeforeEach
    void setUp() {
        testRequest = new Request();
        testRequest.setId(1L);
        testRequest.setDateRequest(LocalDate.of(2024, 7, 27));
        testRequest.setFirstName("John");
        testRequest.setLastName("Doe");
        testRequest.setTitleRequest("Test Request");
        testRequest.setRequestContent("This is a test request content");
    }

    @Test
    void testGetAllRequests() {
        List<Request> requests = Arrays.asList(testRequest);
        when(requestRepository.findAll()).thenReturn(requests);

        List<Request> result = requestService.getAllRequests();

        assertEquals(1, result.size(), "getAllRequests should return a list with one request");
        assertEquals("John", result.get(0).getFirstName(), "The first name of the request should be John");
    }

    @Test
    void testGetRequestById() {
        when(requestRepository.findById(1L)).thenReturn(Optional.of(testRequest));

        Request result = requestService.getRequestById(1L);

        assertEquals("John", result.getFirstName(), "getRequestById should return a request with first name John");
    }

    @Test
    void testCreateRequest() {
        when(requestRepository.save(any(Request.class))).thenReturn(testRequest);

        Request result = requestService.createRequest(testRequest);

        assertEquals("John", result.getFirstName(), "createRequest should return a request with first name John");
    }

    @Test
    void testUpdateRequest() {
        when(requestRepository.existsById(1L)).thenReturn(true);
        when(requestRepository.save(any(Request.class))).thenReturn(testRequest);

        Request result = requestService.updateRequest(testRequest);

        assertEquals("John", result.getFirstName(), "updateRequest should return a request with first name John");
    }

    @Test
    void testDeleteRequestById() {
        when(requestRepository.existsById(1L)).thenReturn(true);
        doNothing().when(requestRepository).deleteById(1L);

        assertDoesNotThrow(() -> requestService.deleteRequestById(1L), "deleteRequestById should not throw an exception");
    }
}