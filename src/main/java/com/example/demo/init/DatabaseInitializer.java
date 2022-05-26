package com.example.demo.init;

import com.example.demo.service.ActivityService;
import com.example.demo.service.ParentService;
import com.example.demo.service.ProductService;
import com.example.demo.service.UserRoleService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;


@Component
public class DatabaseInitializer implements CommandLineRunner {

    private final ParentService parentService;
    private final UserRoleService userRoleService;
    private final ActivityService activityService;
    private final ProductService productService;


    public DatabaseInitializer(ParentService parentService,
                               UserRoleService userRoleService,
                               ActivityService activityService,
                               ProductService productService) {
        this.parentService = parentService;
        this.userRoleService = userRoleService;
        this.activityService = activityService;
        this.productService = productService;
    }

    @Override
    public void run(String... args) throws Exception {
        initializeRoles();
        initializeParents();
        initializeActivities();
        initializeAdmin2ChildsAnd1ActivityFootbal();
        initializeTestChildAnd3Activities();
        initializeWhiskeyProducts();
        initializeGinProducts();
        initializeVodkaProducts();
        productService.initCognacAndBrendy();
        productService.initRum();
        productService.initTequila();
        productService.initRakia();
        productService.initWhiskeyCocktails();
        productService.initGinCocktails();
        productService.initVodkaCocktails();
        productService.initTequilaCocktails();
        productService.initBrandyCocktails();
        productService.initSchroedingerCocktails();
        productService.initBeer();
        productService.initWineGlass();
        productService.intWineGlass();
        productService.initRedWine();
        productService.initRose();
        productService.initNonAlcoholic();
        productService.initHotBeverages();
        productService.initNuts();
        productService.initMenu();
    }

    private void initializeVodkaProducts() {
        productService.initVodka();
    }

    private void initializeGinProducts() {
        productService.initGin();
    }

    private void initializeWhiskeyProducts() {
        productService.initWhiskeys();

    }


    private void initializeTestChildAnd3Activities() {
        parentService.initTestChild();
    }


    private void initializeActivities() {
        activityService.initActivities();

    }

    private void initializeAdmin2ChildsAnd1ActivityFootbal() {
        parentService.initAdminChild();

    }


    private void initializeParents() {
        parentService.initParents();
    }

    private void initializeRoles() {
        userRoleService.initRoles();
    }
}
