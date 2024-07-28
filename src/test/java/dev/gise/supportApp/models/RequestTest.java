package dev.gise.supportApp.models;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.time.LocalDate;

public class RequestTest {

    @Test
    void testGetDateRequest() {
        LocalDate date = LocalDate.of(2024, 7, 27);
        Request request = new Request();
        request.setDateRequest(date);
        assertEquals(date, request.getDateRequest(), "getDateRequest should return the set date");
    }

    @Test
    void testGetFirstName() {
        String firstName = "John";
        Request request = new Request();
        request.setFirstName(firstName);
        assertEquals(firstName, request.getFirstName(), "getFirstName should return the set first name");
    }

    @Test
    void testGetLastName() {
        String lastName = "Doe";
        Request request = new Request();
        request.setLastName(lastName);
        assertEquals(lastName, request.getLastName(), "getLastName should return the set last name");
    }

    @Test
    void testGetRequestContent() {
        String content = "This is a test request content";
        Request request = new Request();
        request.setRequestContent(content);
        assertEquals(content, request.getRequestContent(), "getRequestContent should return the set content");
    }

    @Test
    void testGetTitleRequest() {
        String title = "Test Request";
        Request request = new Request();
        request.setTitleRequest(title);
        assertEquals(title, request.getTitleRequest(), "getTitleRequest should return the set title");
    }

    @Test
    void testSetDateRequest() {
        LocalDate date = LocalDate.of(2024, 7, 27);
        Request request = new Request();
        request.setDateRequest(date);
        assertEquals(date, request.getDateRequest(), "setDateRequest should correctly set the date");
    }
}