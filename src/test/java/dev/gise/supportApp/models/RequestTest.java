package dev.gise.supportApp.models;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;
import java.time.LocalDate;

public class RequestTest {

    @Test
    void testGetDateRequest() {
        LocalDate date = LocalDate.of(2024, 7, 27);
        Request request = new Request();
        request.setDateRequest(date);
        assertThat(request.getDateRequest()).isEqualTo(date).as("getDateRequest should return the set date");
    }

    @Test
    void testGetFirstName() {
        String firstName = "John";
        Request request = new Request();
        request.setFirstName(firstName);
        assertThat(request.getFirstName()).isEqualTo(firstName).as("getFirstName should return the set first name");
    }

    @Test
    void testGetLastName() {
        String lastName = "Doe";
        Request request = new Request();
        request.setLastName(lastName);
        assertThat(request.getLastName()).isEqualTo(lastName).as("getLastName should return the set last name");
    }

    @Test
    void testGetRequestContent() {
        String content = "This is a test request content";
        Request request = new Request();
        request.setRequestContent(content);
        assertThat(request.getRequestContent()).isEqualTo(content).as("getRequestContent should return the set content");
    }

    @Test
    void testGetTitleRequest() {
        String title = "Test Request";
        Request request = new Request();
        request.setTitleRequest(title);
        assertThat(request.getTitleRequest()).isEqualTo(title).as("getTitleRequest should return the set title");
    }

    @Test
    void testSetDateRequest() {
        LocalDate date = LocalDate.of(2024, 7, 27);
        Request request = new Request();
        request.setDateRequest(date);
        assertThat(request.getDateRequest()).isEqualTo(date).as("setDateRequest should correctly set the date");
    }
}