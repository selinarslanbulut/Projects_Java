package Projects_Java.Day_5.Homework1.business.concretes;

import Projects_Java.Day_5.Homework1.business.abstracts.CustomerService;
import Projects_Java.Day_5.Homework1.business.abstracts.CustomerValidationService;
import Projects_Java.Day_5.Homework1.business.abstracts.CustomerVerificationService;
import Projects_Java.Day_5.Homework1.dataAccess.abstracts.CustomerDao;
import Projects_Java.Day_5.Homework1.entities.concretes.Customer;

public class CustomerManager implements CustomerService {
    CustomerValidationService customerValidationService;
    CustomerVerificationService customerVerificationService;
    CustomerDao customerDao;

    public CustomerManager(
            CustomerValidationService customerValidationService,
            CustomerVerificationService customerVerificationService,
            CustomerDao customerDao) {
        this.customerValidationService = customerValidationService;
        this.customerVerificationService = customerVerificationService;
        this.customerDao = customerDao;
    }

    @Override
    public void register(Customer customer) {
        if(customerValidationService.totalCheck(customer, customerDao.getAll())){
            customerVerificationService.sendVerifyMail(customer);
        }
        else{
            System.out.println("Kayıt olamadınız!");
        }
    }

    @Override
    public void login(Customer customer) {

    }

    @Override
    public void verifyAccount(Customer customer) {

    }
}
