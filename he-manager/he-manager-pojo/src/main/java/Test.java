import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * @author hedonglou
 * @description
 */
public class Test {

    public static final String msg = "111";

    public void testUser(){
        User user = new User();
        user.setName("");
        user.setSex("");
        user.setAge("");
        user.setInterest("");
        ReentrantLock reentrantLock = new ReentrantLock();
        String json = "{\n" +
                "  \"name\":\"wxy\",\n" +
                "  \"age\":\"11\",\n" +
                "  \"birth\":\"1991-1-1\"\n" +
                "}";

    }

    public static void main(String[] args) {
        User user = new User();
        ReentrantLock reentrantLock = new ReentrantLock();
        reentrantLock.lock();
        reentrantLock.unlock();
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        ReentrantReadWriteLock.ReadLock readLock = reentrantReadWriteLock.readLock();
        ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
        writeLock.lock();
        writeLock.unlock();
    }
}
