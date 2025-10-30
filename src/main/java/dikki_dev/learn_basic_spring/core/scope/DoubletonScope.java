package dikki_dev.learn_basic_spring.core.scope;

import org.springframework.beans.factory.ObjectFactory;
import org.springframework.beans.factory.config.Scope;

import java.util.ArrayList;
import java.util.List;

public class DoubletonScope implements Scope {

    private List<Object> objects = new ArrayList<>(2);
    private Integer counter = -1;

    // Wajib Override
    @Override
    public Object get(String name, ObjectFactory<?> objectFactory) {
        counter++;

        // Jika object sudah 2x dibuat maka ambil object yang ada berdasarkan index
        if(objects.size() == 2){
            int index = counter % 2;
            return objects.get(index);
        }else{ // Jika object belum 2x dibuat maka buat object baru menggunakan ObjectFactory
            Object object = objectFactory.getObject();
            objects.add(object);
            return object;
        }
    }

    // Wajib Override
    @Override
    public Object remove(String name) {
        if(!objects.isEmpty()){
            return  objects.remove(0);
        }
        return null;
    }

    // Optional
    @Override
    public void registerDestructionCallback(String name, Runnable callback) {

    }

    // Optional
    @Override
    public Object resolveContextualObject(String key) {
        return null;
    }

    // Optional
    @Override
    public String getConversationId() {
        return "";
    }
}
