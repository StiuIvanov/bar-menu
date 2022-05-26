package com.example.demo.web;

import com.example.demo.model.binding.PictureBindingModel;
import com.example.demo.model.dto.ChildDTO;
import com.example.demo.model.entity.enums.TypeEnum;
import com.example.demo.service.ParentService;
import com.example.demo.service.ProductService;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.transaction.Transactional;
import java.io.IOException;
import java.util.List;

@Controller
public class HomeController {

    private final ParentService parentService;
    private final ProductService productService;

    public HomeController(ParentService parentService,
                          ProductService productService) {
        this.parentService = parentService;
        this.productService = productService;
    }

    @GetMapping("/")
    public ModelAndView index(@AuthenticationPrincipal UserDetails userDetails) {
        ModelAndView modelAndView = new ModelAndView();

        if (userDetails != null) {
            String picURL = parentService.findParentPicByUsername(userDetails.getUsername());
            modelAndView.addObject("userPicture", picURL);
            List<ChildDTO> childDTOList = parentService.getChildren(userDetails.getUsername());
            modelAndView.addObject("children", childDTOList);
            modelAndView.setViewName("home");
            return modelAndView;
        }

        modelAndView.setViewName("index");
        return modelAndView;
    }

    @Transactional
    @PostMapping("/home/add")
    public String addPicture(@AuthenticationPrincipal UserDetails userDetails,
                             PictureBindingModel bindingModel) throws IOException {
        bindingModel.setTitle("parent-avatar");
        parentService.saveParentAvatar(bindingModel, userDetails.getUsername());
        return "redirect:/";
    }


    @GetMapping("/full-menu")
    public ModelAndView index() {
        ModelAndView modelAndView = new ModelAndView();

        modelAndView.addObject("scotchWhiskeys", productService.getAllByType(TypeEnum.ScotchWhisky));
        modelAndView.addObject("irishWhiskeys", productService.getAllByType(TypeEnum.IrishWhisky));
        modelAndView.addObject("americanWhiskeys", productService.getAllByType(TypeEnum.AmericanWhisky));
        modelAndView.addObject("singleMaltScotchWhiskyWhiskeys", productService.getAllByType(TypeEnum.SingleMaltScotchWhisky));
        modelAndView.addObject("japaneseWhiskyWhiskeys", productService.getAllByType(TypeEnum.JapaneseWhisky));
        modelAndView.addObject("gin", productService.getAllByType(TypeEnum.Gin));
        modelAndView.addObject("vodka", productService.getAllByType(TypeEnum.Vodka));
        modelAndView.addObject("cognacAndBrendy", productService.getAllByType(TypeEnum.CognacAndBrendy));
        modelAndView.addObject("rum", productService.getAllByType(TypeEnum.Rum));
        modelAndView.addObject("tequila", productService.getAllByType(TypeEnum.Tequila));
        modelAndView.addObject("rakia", productService.getAllByType(TypeEnum.Rakia));
        modelAndView.addObject("whiskeyCocktails", productService.getAllByType(TypeEnum.WhiskeyCocktails));
        modelAndView.addObject("ginCocktails", productService.getAllByType(TypeEnum.GinCocktails));
        modelAndView.addObject("vodkaCocktails", productService.getAllByType(TypeEnum.VodkaCocktails));
        modelAndView.addObject("tequilaCocktails", productService.getAllByType(TypeEnum.TequilaCocktails));
        modelAndView.addObject("brandyCocktails", productService.getAllByType(TypeEnum.BrandyCocktails));
        modelAndView.addObject("schroedingerCocktails", productService.getAllByType(TypeEnum.SchroedingerCocktails));
        modelAndView.addObject("beer", productService.getAllByType(TypeEnum.Beer));
        modelAndView.addObject("wineGlass", productService.getAllByType(TypeEnum.WineGlass));
        modelAndView.addObject("whiteWineGlass", productService.getAllByType(TypeEnum.WhiteWine));
        modelAndView.addObject("redWineGlass", productService.getAllByType(TypeEnum.RedWine));
        modelAndView.addObject("roseWineGlass", productService.getAllByType(TypeEnum.Rose));
        modelAndView.addObject("nonAlcoholic", productService.getAllByType(TypeEnum.NonAlcoholic));
        modelAndView.addObject("hotBeverages", productService.getAllByType(TypeEnum.HotBeverages));
        modelAndView.addObject("nuts", productService.getAllByType(TypeEnum.Nuts));
        modelAndView.addObject("menu", productService.getAllByType(TypeEnum.Menu));

        modelAndView.setViewName("full-menu");
        return modelAndView;
    }

    @GetMapping("/liquors")
    public ModelAndView liquors() {
        ModelAndView modelAndView = new ModelAndView();

        modelAndView.addObject("scotchWhiskeys", productService.getAllByType(TypeEnum.ScotchWhisky));
        modelAndView.addObject("irishWhiskeys", productService.getAllByType(TypeEnum.IrishWhisky));
        modelAndView.addObject("americanWhiskeys", productService.getAllByType(TypeEnum.AmericanWhisky));
        modelAndView.addObject("singleMaltScotchWhiskyWhiskeys", productService.getAllByType(TypeEnum.SingleMaltScotchWhisky));
        modelAndView.addObject("japaneseWhiskyWhiskeys", productService.getAllByType(TypeEnum.JapaneseWhisky));
        modelAndView.addObject("gin", productService.getAllByType(TypeEnum.Gin));
        modelAndView.addObject("vodka", productService.getAllByType(TypeEnum.Vodka));
        modelAndView.addObject("cognacAndBrendy", productService.getAllByType(TypeEnum.CognacAndBrendy));
        modelAndView.addObject("rum", productService.getAllByType(TypeEnum.Rum));
        modelAndView.addObject("tequila", productService.getAllByType(TypeEnum.Tequila));
        modelAndView.addObject("rakia", productService.getAllByType(TypeEnum.Rakia));

        modelAndView.setViewName("liquors");
        return modelAndView;
    }

    @GetMapping("/food")
    public ModelAndView food() {
        ModelAndView modelAndView = new ModelAndView();

        modelAndView.addObject("menu", productService.getAllByType(TypeEnum.Menu));
        modelAndView.addObject("nuts", productService.getAllByType(TypeEnum.Nuts));

        modelAndView.setViewName("food");
        return modelAndView;
    }

    @GetMapping("/non-alcoholic")
    public ModelAndView nonAlcoholic() {
        ModelAndView modelAndView = new ModelAndView();

        modelAndView.addObject("nonAlcoholic", productService.getAllByType(TypeEnum.NonAlcoholic));
        modelAndView.addObject("hotBeverages", productService.getAllByType(TypeEnum.HotBeverages));

        modelAndView.setViewName("non-alcoholic");
        return modelAndView;
    }

    @GetMapping("/cocktails")
    public ModelAndView cocktails() {
        ModelAndView modelAndView = new ModelAndView();

        modelAndView.addObject("whiskeyCocktails", productService.getAllByType(TypeEnum.WhiskeyCocktails));
        modelAndView.addObject("ginCocktails", productService.getAllByType(TypeEnum.GinCocktails));
        modelAndView.addObject("vodkaCocktails", productService.getAllByType(TypeEnum.VodkaCocktails));
        modelAndView.addObject("tequilaCocktails", productService.getAllByType(TypeEnum.TequilaCocktails));
        modelAndView.addObject("brandyCocktails", productService.getAllByType(TypeEnum.BrandyCocktails));
        modelAndView.addObject("schroedingerCocktails", productService.getAllByType(TypeEnum.SchroedingerCocktails));

        modelAndView.setViewName("cocktails");
        return modelAndView;
    }

    @GetMapping("/wine")
    public ModelAndView wine() {
        ModelAndView modelAndView = new ModelAndView();

        modelAndView.addObject("wineGlass", productService.getAllByType(TypeEnum.WineGlass));
        modelAndView.addObject("whiteWineGlass", productService.getAllByType(TypeEnum.WhiteWine));
        modelAndView.addObject("redWineGlass", productService.getAllByType(TypeEnum.RedWine));
        modelAndView.addObject("roseWineGlass", productService.getAllByType(TypeEnum.Rose));

        modelAndView.setViewName("wine");
        return modelAndView;
    }

    @GetMapping("/beer")
    public ModelAndView beer() {
        ModelAndView modelAndView = new ModelAndView();

        modelAndView.addObject("beer", productService.getAllByType(TypeEnum.Beer));

        modelAndView.setViewName("beer");
        return modelAndView;
    }

    @GetMapping("/alcohol-menu")
    public ModelAndView alcoholMenu() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("alcohol-menu");
        return modelAndView;
    }


}
