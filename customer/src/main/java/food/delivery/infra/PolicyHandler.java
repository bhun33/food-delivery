package food.delivery.infra;

import javax.naming.NameParser;

import javax.naming.NameParser;
import javax.transaction.Transactional;

import food.delivery.config.kafka.KafkaProcessor;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;
import food.delivery.domain.*;

@Service
@Transactional
public class PolicyHandler{
    @Autowired NotificationRepository notificationRepository;
    
    @StreamListener(KafkaProcessor.INPUT)
    public void whatever(@Payload String eventString){}

    @StreamListener(value=KafkaProcessor.INPUT, condition="headers['type']=='Accepted'")
    public void wheneverAccepted_NotifyViaKakao(@Payload Accepted accepted){

        Accepted event = accepted;
        System.out.println("\n\n##### listener NotifyViaKakao : " + accepted + "\n\n");


        

        // Sample Logic //
        Notification.notifyViaKakao(event);
        

        

    }
    @StreamListener(value=KafkaProcessor.INPUT, condition="headers['type']=='Rejected'")
    public void wheneverRejected_NotifyViaKakao(@Payload Rejected rejected){

        Rejected event = rejected;
        System.out.println("\n\n##### listener NotifyViaKakao : " + rejected + "\n\n");


        

        // Sample Logic //
        Notification.notifyViaKakao(event);
        

        

    }
    @StreamListener(value=KafkaProcessor.INPUT, condition="headers['type']=='CookFinished'")
    public void wheneverCookFinished_NotifyViaKakao(@Payload CookFinished cookFinished){

        CookFinished event = cookFinished;
        System.out.println("\n\n##### listener NotifyViaKakao : " + cookFinished + "\n\n");


        

        // Sample Logic //
        Notification.notifyViaKakao(event);
        

        

    }
    @StreamListener(value=KafkaProcessor.INPUT, condition="headers['type']=='DeliveryStarted'")
    public void wheneverDeliveryStarted_NotifyViaKakao(@Payload DeliveryStarted deliveryStarted){

        DeliveryStarted event = deliveryStarted;
        System.out.println("\n\n##### listener NotifyViaKakao : " + deliveryStarted + "\n\n");


        

        // Sample Logic //
        Notification.notifyViaKakao(event);
        

        

    }
    @StreamListener(value=KafkaProcessor.INPUT, condition="headers['type']=='DeliveryFinished'")
    public void wheneverDeliveryFinished_NotifyViaKakao(@Payload DeliveryFinished deliveryFinished){

        DeliveryFinished event = deliveryFinished;
        System.out.println("\n\n##### listener NotifyViaKakao : " + deliveryFinished + "\n\n");


        

        // Sample Logic //
        Notification.notifyViaKakao(event);
        

        

    }

}


