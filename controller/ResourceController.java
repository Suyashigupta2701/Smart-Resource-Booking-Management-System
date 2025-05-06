package controller;

import java.util.*;
// controller/ResourceController.java
import service.ResourceService;
import entity.Resource;

public class ResourceController {
    private ResourceService service = new ResourceService();

    public void add(Resource r) { service.add(r); }
    public Collection<Resource> getAll() { return service.listAll(); }
}

