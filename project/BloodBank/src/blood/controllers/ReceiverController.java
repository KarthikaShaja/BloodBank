package blood.controllers;
import blood.utlity.*;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import blood.dl.ReceiverDL;
import blood.dto.ReceiverDTO;
@Controller
public class ReceiverController {
	
	  
    @RequestMapping("/receiver_view")    
    public String viewReceiver(Model m){    
        List<ReceiverDTO> list=ReceiverDL.getReceivers();    
        m.addAttribute("list",list);  
        return "receiver/receiver_view1";    
    }    
    
    @RequestMapping("/receiver_add")    
    public String addReceiver(Model m){        
        m.addAttribute("command",new ReceiverDTO());  
        return "receiver/receiver_add2";    
    } 
    
    @RequestMapping(value="/save",method = RequestMethod.POST)    
    public String saveReceiver(@ModelAttribute("receiver") ReceiverDTO receiver){    
       ReceiverDL.addReceiver(receiver);    
        return "redirect:/receiver_view";//will redirect to viewDonor request mapping    
    }  
    
    @ModelAttribute("generatePatientId")
    public String generatePatientId() {
    	String patientId = null;
    	patientId = ReceiverIdGenerate.generateRECId();
    	return patientId;
    }
   }  


