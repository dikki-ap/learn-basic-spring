package dikki_dev.learn_basic_spring.core.services;

import dikki_dev.learn_basic_spring.core.data.User;
import dikki_dev.learn_basic_spring.core.events.LoginSuccessEvent;
import dikki_dev.learn_basic_spring.core.listeners.LoginAgainSuccessListener;
import dikki_dev.learn_basic_spring.core.listeners.LoginSuccessListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.stereotype.Component;

@Component
// ApplicationEventPublisherAware adalah suatu Interface untuk menggunakan Event Listener dari ApplicationEvent dan ApplicationListener<T extends ApplicationEvent>
public class UserService implements ApplicationEventPublisherAware {

    // DIREKOMENDASIKAN
    // Hanya publish 1x untuk banyak Listener
    private ApplicationEventPublisher applicationEventPublisher;

    // Ada 2 cara penggunakan ApplicationEventPublish, tetapi yang ini tidak direkomendasikan
    // TIDAK DIREKOMENDASIKAN
    // Anda harus mendaftarkan semua listener di 1 Service, dan jika ada banyak akan sangat merepotkan
    // @Autowired
    // private LoginSuccessListener loginSuccessListener;
    // @Autowired
    // private LoginAgainSuccessListener loginAgainSuccessListener;


    // Wajib override method ini jika implement "ApplicationEventPublisherAware"
    @Override
    public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
        this.applicationEventPublisher = applicationEventPublisher;
    }

    // Implementasi pengecekan login
    private boolean isLoginSuccess(String username, String password){
        return username.equals("dikki") && password.equals("123");
    }

    public boolean login(String username, String password){
        if(isLoginSuccess(username, password)){
            // DIREKOMENDASIKAN
            // Hanya publish 1x untuk banyak Listener
            // Publish Event berdsarkan Listener dan menggunakan semua kejadian Event yang ada
            // Contohnya di sini akan menampilkan log berdasarkan LoginSuccessListener
            // Menampilkan "username" yang berhasil login berdasarkan LoginSuccessListener
            applicationEventPublisher.publishEvent(new LoginSuccessEvent(new User(username)));

            // TIDAK DIREKOMENDASIKAN
            // Cara ini sama saja jika anda memiliki lebih dari 1 Listener akan register semua listener di sini dan sangat tidak efektif
            // loginSuccessListener.onApplicationEvent(new LoginSuccessEvent(new User(username)));
            // loginAgainSuccessListener.onApplicationEvent(new LoginSuccessEvent(new User(username)));

            return true;
        }else{
            return false;
        }
    }
}
