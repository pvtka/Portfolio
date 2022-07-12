package pl.coderslab.charity;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.coderslab.charity.repository.DonationRepository;


@Controller
public class HomeController {
    private final DonationRepository donationRepository;

    public HomeController(DonationRepository donationRepository) {
        this.donationRepository = donationRepository;
    }

    @RequestMapping("/")
    public String homeAction(Model model){


        model.addAttribute("allDonations", donationRepository.allDonations());
        model.addAttribute("donationsCount",donationRepository.count());
        return "index";
    }
}
