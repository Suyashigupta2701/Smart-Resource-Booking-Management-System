package service;
import java.util.*;
// service/ResourceService.java
import repository.ResourceRepository;
import entity.Resource;

public class ResourceService {
    private ResourceRepository repo = new ResourceRepository();

    public void add(Resource r) { repo.save(r); }
    public Resource get(String id) { return repo.findById(id); }
    public Collection<Resource> listAll() { return repo.findAll(); }
}
