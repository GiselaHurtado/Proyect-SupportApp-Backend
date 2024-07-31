package dev.gise.supportApp.repositories;

import dev.gise.supportApp.models.Request;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest
public class RequestRepositoryTest {

    @Autowired
    private RequestRepository requestRepository;

    @Test
    void testSaveAndFindById() {
        Request request = new Request();
        request.setDateRequest(LocalDate.of(2024, 7, 27));
        request.setFirstName("John");
        request.setLastName("Doe");
        request.setTitleRequest("Test Request");
        request.setRequestContent("This is a test request content");

        Request savedRequest = requestRepository.save(request);

        Optional<Request> foundRequest = requestRepository.findById(savedRequest.getId());

        assertTrue(foundRequest.isPresent(), "findById should return a non-empty Optional");
        assertEquals("John", foundRequest.get().getFirstName(), "The first name of the found request should be John");
    }

    @Test
    void testFindAll() {
        Request request1 = new Request();
        request1.setDateRequest(LocalDate.of(2024, 7, 27));
        request1.setFirstName("John");
        request1.setLastName("Doe");
        request1.setTitleRequest("Test Request 1");
        request1.setRequestContent("This is test request 1");

        Request request2 = new Request();
        request2.setDateRequest(LocalDate.of(2024, 7, 28));
        request2.setFirstName("Jane");
        request2.setLastName("Smith");
        request2.setTitleRequest("Test Request 2");
        request2.setRequestContent("This is test request 2");

        requestRepository.save(request1);
        requestRepository.save(request2);

        List<Request> requests = requestRepository.findAll();

        assertEquals(13, requests.size(), "findAll should return a list with two requests");
    }

    @Test
    void testDeleteById() {
        Request request = new Request();
        request.setDateRequest(LocalDate.of(2024, 7, 27));
        request.setFirstName("John");
        request.setLastName("Doe");
        request.setTitleRequest("Test Request");
        request.setRequestContent("This is a test request content");

        Request savedRequest = requestRepository.save(request);

        requestRepository.deleteById(savedRequest.getId());

        Optional<Request> deletedRequest = requestRepository.findById(savedRequest.getId());
        assertFalse(deletedRequest.isPresent(), "The request should be deleted and not found");
    }
}