package eshop.service;

import eshop.entity.Category;
import eshop.entity.Payment;
import eshop.repository.PaymentRepo;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Transactional
@Service
public class PaymentServiceImpl implements PaymentService{

    @Autowired 
    PaymentRepo paymentRepo;
    
    @Override
    public Optional<Payment> getPaymentById(int id){
        Optional<Payment> paymentById = paymentRepo.findById(id);
                return paymentById;
    }
}
