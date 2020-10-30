package controllerPackage;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import data.SpittleRepository;

import metadata.Spitter;
import metadata.Spittle;

@Controller

public class SpittleController {
  private SpittleRepository spittleRepository;
  @Autowired
  public SpittleController(SpittleRepository spittleRepository) {
	  this.spittleRepository = spittleRepository;
  }
  @RequestMapping(value="/spittles",method=RequestMethod.GET)
//  public String spittels(Model model) {
//	  model.addAttribute(spittleRepository.findSpittles(Long.MAX_VALUE, 20));
//	  return "spittles";
//  }
  public List<Spittle> spittles(
		  @RequestParam("max") long max,
		  @RequestParam("count") int count){
	  return spittleRepository.findSpittles(Long.MAX_VALUE, 20);
  }
  @RequestMapping(value="/show/{spittle_id}",method=RequestMethod.GET)
  public String showSpitter( @PathVariable("spittle_id") long id,Model model) {
	  model.addAttribute(spittleRepository.findOne(3));
	  return "spittle";
  }
  @RequestMapping(value="/spitter/register",method=RequestMethod.GET)
  public String showRegisterForm(Model model) {
	  model.addAttribute(new Spitter());
	  return "registerForm";
  }
  @RequestMapping(value="/spitter/register",method=RequestMethod.POST)
  public String processRegister(Spitter spitter) {
	  
	  spittleRepository.save(spitter);
	  return "redirect:/spitter/"+spitter.getUsername();
  }
  @RequestMapping(value="/spitter/{username}",method=RequestMethod.GET)
  public String showuserinfo(@PathVariable("username") String username,Model model) {

	  Spitter spitter  = spittleRepository.fineByUsername(username);
	  model.addAttribute(spitter);
	  return "profile";
  }
}
