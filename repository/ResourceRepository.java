package repository;

// repository/ResourceRepository.java
import java.util.*;
import entity.Resource;
import java.util.*;

public class ResourceRepository {
    private Map<String, Resource> resources = new HashMap<>();
    public void save(Resource res) { resources.put(res.getId(), res); }
    public Collection<Resource> findAll() { return resources.values(); }
    public Resource findById(String id) { return resources.get(id); }
}
