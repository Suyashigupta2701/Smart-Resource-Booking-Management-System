package model;

// model/Cart.java
import java.util.*;
import model.ResourceSelection;
import java.util.*;

public class cart {
    private List<ResourceSelection> selections = new ArrayList<>();
    public void addSelection(ResourceSelection sel) { selections.add(sel); }
    public List<ResourceSelection> getSelections() { return selections; }
    public void clear() { selections.clear(); }
}

