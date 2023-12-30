package Service;

import java.util.List;

public interface iGenericInterface <T> {

    public List<T> getAll();

    public void create(String name, int age);



}
