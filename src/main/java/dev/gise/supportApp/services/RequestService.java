package dev.gise.supportApp.services;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import dev.gise.supportApp.models.Request;
import dev.gise.supportApp.repositories.RequestRepository;

@Service
public class RequestService {

    @Autowired
    private RequestRepository repository;

    public List<Request> getAllRequests() {
        return repository.findAll();
    }

    public Request getRequestById(Long id) {
        return repository.findById(id).orElseThrow(() -> new RuntimeException("Request not found"));
    }

    public Request createRequest(Request request) {
        return repository.save(request);
    }

    public Request updateRequest(Request request) {
        if (!repository.existsById(request.getId())) {
            throw new RuntimeException("Request not found");
        }
        return repository.save(request);
    }

    public void deleteRequestById(Long id) {
        if (!repository.existsById(id)) {
            throw new RuntimeException("Request not found");
        }
        repository.deleteById(id);
    }
}
