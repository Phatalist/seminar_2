/**
 * Created with IntelliJ IDEA.
 * User: pc
 * Date: 05.11.13
 * Time: 18:47
 * To change this template use File | Settings | File Templates.
 */

interface SerialCollection{
    void addToTheEnd(Object o);
    Object GetObjectById(int id);
    void removeObjectById(int id);
    void findAndRemoveObject(Object o);
    int getIdByObject();
}

class DynamicArray implements SerialCollection{


    private Object[] array;
    int arraySize = 0;
}
public class abstract_class {
}
