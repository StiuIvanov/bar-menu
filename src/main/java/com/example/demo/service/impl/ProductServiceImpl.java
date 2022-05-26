package com.example.demo.service.impl;

import com.example.demo.model.entity.ProductEntity;
import com.example.demo.model.entity.enums.TypeEnum;
import com.example.demo.repository.ProductRepository;
import com.example.demo.service.ProductService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class ProductServiceImpl implements ProductService {
    private final ProductRepository productRepository;

    public ProductServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public void initWhiskeys() {
        initScotchWhiskeys();
        initIrishWhiskeys();
        initAmericanWhiskeys();
        initSingleMaltScotchWhiskeys();
        initJapaneseWhiskeys();
    }

    @Override
    public Set<ProductEntity> getAllByType(TypeEnum typeEnum) {
        return productRepository.getAllByType(typeEnum);
    }

    @Override
    public void initGin() {
        ProductEntity beefeater_london_dry_gin = new ProductEntity().setName("Beefeater London Dry Gin").setPrice(6.00).setType(TypeEnum.Gin);
        ProductEntity beefeater_pink_gin = new ProductEntity().setName("Beefeater Pink Gin").setPrice(6.00).setType(TypeEnum.Gin);
        ProductEntity bombay_sapphire_gin = new ProductEntity().setName("Bombay Sapphire Gin").setPrice(7.00).setType(TypeEnum.Gin);
        ProductEntity plymouth_gin = new ProductEntity().setName("Plymouth Gin").setPrice(9.00).setType(TypeEnum.Gin);
        ProductEntity malfyOrange = new ProductEntity().setName("Malfy con Arancia Sicilian Blood Orange Gin").setPrice(9.00).setType(TypeEnum.Gin);
        ProductEntity malfyPInk = new ProductEntity().setName("Malfy Rosa Sicilian Pink Grapefruit Gin").setPrice(9.00).setType(TypeEnum.Gin);
        ProductEntity hendrick = new ProductEntity().setName("Hendrick's Gin").setPrice(10.00).setType(TypeEnum.Gin);

        productRepository.save(beefeater_london_dry_gin);
        productRepository.save(beefeater_pink_gin);
        productRepository.save(bombay_sapphire_gin);
        productRepository.save(plymouth_gin);
        productRepository.save(malfyOrange);
        productRepository.save(malfyPInk);
        productRepository.save(hendrick);
    }

    @Override
    public void initVodka() {
        ProductEntity zelenaja_marka = new ProductEntity().setName("Zelenaja Marka").setPrice(5.0).setType(TypeEnum.Vodka);
        ProductEntity vodka_absolut_blue = new ProductEntity().setName("Vodka Absolut Blue").setPrice(6.0).setType(TypeEnum.Vodka);
        ProductEntity rejka = new ProductEntity().setName("Rejka Small Batch Vodka - Iceland").setPrice(8.0).setType(TypeEnum.Vodka);

        productRepository.save(zelenaja_marka);
        productRepository.save(vodka_absolut_blue);
        productRepository.save(rejka);
    }

    @Override
    public void initCognacAndBrendy() {
        ProductEntity ararat = new ProductEntity().setName("Brandy Ararat 5YO Armenia").setPrice(6.0).setType(TypeEnum.CognacAndBrendy);
        ProductEntity saraji = new ProductEntity().setName("Brandy Sarajishvili VS, Georgia").setPrice(8.0).setType(TypeEnum.CognacAndBrendy);
        ProductEntity martell_vs_single_distillery_france = new ProductEntity().setName("Martell VS Single Distillery France").setPrice(10.00).setType(TypeEnum.CognacAndBrendy);

        productRepository.save(ararat);
        productRepository.save(saraji);
        productRepository.save(martell_vs_single_distillery_france);
    }

    @Override
    public void initRum() {
        ProductEntity barcelo = new ProductEntity().setName("Barcelo Anejo Ron Dominicano 4YO").setPrice(6.00).setType(TypeEnum.Rum);
        ProductEntity havana3 = new ProductEntity().setName("Havana Club 3YO Rum").setPrice(5.0).setType(TypeEnum.Rum);
        ProductEntity havana_club_anejo_especial = new ProductEntity().setName("Havana Club Anejo Especial").setPrice(5.00).setType(TypeEnum.Rum);
        ProductEntity havana7 = new ProductEntity().setName("Havana Club 7YO Rum").setPrice(9.00).setType(TypeEnum.Rum);

        productRepository.save(barcelo);
        productRepository.save(havana3);
        productRepository.save(havana_club_anejo_especial);
        productRepository.save(havana7);
    }

    @Override
    public void initTequila() {
        ProductEntity tequila_olmeca_gold = new ProductEntity().setName("Tequila Olmeca Gold").setPrice(3.50).setType(TypeEnum.Tequila);
        ProductEntity tequila_olmeca_blanco = new ProductEntity().setName("Tequila Olmeca Blanco").setPrice(3.50).setType(TypeEnum.Tequila);

        productRepository.save(tequila_olmeca_gold);
        productRepository.save(tequila_olmeca_blanco);

    }

    @Override
    public void initRakia() {
        ProductEntity isperih = new ProductEntity().setName(String.format("Ракия Ябълкова отлежала Исперих, България |\nMatured Apple Rakia Isperih, Bulgaria")).setPrice(4.00).setType(TypeEnum.Rakia);
        ProductEntity korten = new ProductEntity().setName(String.format("Бистра Мускатова Ракия Кортен |\nMatured Muscat Rakia Korten Winery")).setPrice(5.00).setType(TypeEnum.Rakia);
        ProductEntity otonel = new ProductEntity().setName(String.format("Отлежала Ракия от Мускат Отонел Кортен |\nKorten Reserve Matured Muskat Rakiq")).setPrice(6.00).setType(TypeEnum.Rakia);

        productRepository.save(isperih);
        productRepository.save(korten);
        productRepository.save(otonel);
    }

    @Override
    public void initWhiskeyCocktails() {
        ProductEntity whiskey_sour = new ProductEntity().setName("Whiskey Sour").setPrice(12.00).setType(TypeEnum.WhiskeyCocktails);
        ProductEntity boston_sour = new ProductEntity().setName("Boston Sour").setPrice(12.00).setType(TypeEnum.WhiskeyCocktails);
        ProductEntity whiskey_fix = new ProductEntity().setName("Whiskey Fix").setPrice(12.00).setType(TypeEnum.WhiskeyCocktails);
        ProductEntity old_fashioned = new ProductEntity().setName("Old Fashioned").setPrice(14.00).setType(TypeEnum.WhiskeyCocktails);

        productRepository.save(whiskey_sour);
        productRepository.save(boston_sour);
        productRepository.save(whiskey_fix);
        productRepository.save(old_fashioned);
    }

    @Override
    public void initGinCocktails() {
        ProductEntity gin_tonic = new ProductEntity().setName("Gin Tonic").setPrice(10.00).setType(TypeEnum.GinCocktails);
        ProductEntity gin_tonic_vs = new ProductEntity().setName("Gin Tonic VS").setPrice(14.00).setType(TypeEnum.GinCocktails);
        ProductEntity martini = new ProductEntity().setName("Martini").setPrice(12.00).setType(TypeEnum.GinCocktails);

        productRepository.save(gin_tonic);
        productRepository.save(gin_tonic_vs);
        productRepository.save(martini);
    }

    @Override
    public void initVodkaCocktails() {
        ProductEntity martini = new ProductEntity().setName("Vodka Martini").setPrice(12.00).setType(TypeEnum.VodkaCocktails);
        ProductEntity white_russian = new ProductEntity().setName("White Russian").setPrice(12.00).setType(TypeEnum.VodkaCocktails);
        ProductEntity bloody_mary = new ProductEntity().setName("Bloody Mary").setPrice(12.00).setType(TypeEnum.VodkaCocktails);

        productRepository.save(martini);
        productRepository.save(white_russian);
        productRepository.save(bloody_mary);
    }

    @Override
    public void initTequilaCocktails() {
        ProductEntity margarita = new ProductEntity().setName("Margarita").setPrice(14.00).setType(TypeEnum.TequilaCocktails);
        ProductEntity paloma = new ProductEntity().setName("Paloma").setPrice(14.00).setType(TypeEnum.TequilaCocktails);

        productRepository.save(margarita);
        productRepository.save(paloma);
    }

    @Override
    public void initBrandyCocktails() {
        ProductEntity sidecar = new ProductEntity().setName("Sidecar").setPrice(14.00).setType(TypeEnum.BrandyCocktails);
        ProductEntity brandy_alexander = new ProductEntity().setName("Brandy Alexander").setPrice(14.00).setType(TypeEnum.BrandyCocktails);

        productRepository.save(sidecar);
        productRepository.save(brandy_alexander);
    }

    @Override
    public void initSchroedingerCocktails() {
        ProductEntity gingerpolitan = new ProductEntity().setName("Gingerpolitan").setPrice(14.00).setType(TypeEnum.SchroedingerCocktails);
        ProductEntity sour_cherry_sour = new ProductEntity().setName("Sour Cherry Sour").setPrice(12.00).setType(TypeEnum.SchroedingerCocktails);

        productRepository.save(gingerpolitan);
        productRepository.save(sour_cherry_sour);
    }

    @Override
    public void initBeer() {
        ProductEntity smallDraft = new ProductEntity().setName("Малка Наливна Бира / Small Draft Beer 0.30л.").setPrice(4.00).setType(TypeEnum.Beer);
        ProductEntity largeDraft = new ProductEntity().setName("Голяма Наливна Бира / Large Draft Beer 0.50л.").setPrice(6.00).setType(TypeEnum.Beer);
        ProductEntity birichka = new ProductEntity().setName("Биричка 10' / Birichka Beer 10' 0.33л.").setPrice(3.50).setType(TypeEnum.Beer);
        ProductEntity vitoshaTulip = new ProductEntity().setName("Витошко Лале Светло / Vitosha Tulip 0.50л.").setPrice(5.50).setType(TypeEnum.Beer);
        ProductEntity vitoshaTulipBlonde = new ProductEntity().setName("Витошко Лале БЛОНД 10' / Vitosha Tulip BLOND 10' 0.50л.").setPrice(5.50).setType(TypeEnum.Beer);
        ProductEntity vitoshaTulipWeiss = new ProductEntity().setName("Витошко Лале ВАЙС / Vitosha Tulip Weiss 0.50л.").setPrice(7.00).setType(TypeEnum.Beer);
        ProductEntity pustinjak = new ProductEntity().setName("Голям Пустиняк 7 Вида Малц / Goljam Pustinjak 7 Species of Malt").setPrice(6.00).setType(TypeEnum.Beer);
        ProductEntity bernard10 = new ProductEntity().setName("Bernard 10'").setPrice(7.00).setType(TypeEnum.Beer);
        ProductEntity bernard_swing = new ProductEntity().setName("Bernard SWING").setPrice(8.00).setType(TypeEnum.Beer);
        ProductEntity primator = new ProductEntity().setName("Primator").setPrice(6.50).setType(TypeEnum.Beer);
        ProductEntity primatorIPA = new ProductEntity().setName("Primator MOTHER IN LAW IPL 11', IPA 15'").setPrice(7.50).setType(TypeEnum.Beer);
        ProductEntity clausthaler_unfiltered = new ProductEntity().setName("Clausthaler Unfiltered").setPrice(4.50).setType(TypeEnum.Beer);

        productRepository.save(smallDraft);
        productRepository.save(largeDraft);
        productRepository.save(birichka);
        productRepository.save(vitoshaTulip);
        productRepository.save(vitoshaTulipBlonde);
        productRepository.save(vitoshaTulipWeiss);
        productRepository.save(pustinjak);
        productRepository.save(bernard10);
        productRepository.save(bernard_swing);
        productRepository.save(primator);
        productRepository.save(primatorIPA);
        productRepository.save(clausthaler_unfiltered);
    }

    @Override
    public void initWineGlass() {
        ProductEntity kapatovoBlan = new ProductEntity().setName("Капатово Шардоне, Вионие и Совиньон Блан 2019г. / Kapatovo Chadonay, Viognier and Sauvignon Blanc 2019г.").setPrice(7.00).setType(TypeEnum.WineGlass);
        ProductEntity kapatovoRed = new ProductEntity().setName("Капатово 2019г. Червен Бленд / Kapatovo 2019г. Red Blend ").setPrice(7.00).setType(TypeEnum.WineGlass);
        ProductEntity tipchenitzaRubin = new ProductEntity().setName("Типченица Червено вино Рубин, Сира и Небиоло / Tipchenitza Rubin, Syrah & Nebbiolo Red Wine").setPrice(7.00).setType(TypeEnum.WineGlass);
        ProductEntity tipchenitzaSira = new ProductEntity().setName("Типченица Розе, Рубин, Сира / Tipchenitza Rubin & Syrah Rose").setPrice(7.00).setType(TypeEnum.WineGlass);
        ProductEntity tipchenitzWhite = new ProductEntity().setName("Типченица Бяло Вино Врачански Мискет / Tipchenitza Vrachansky Misket Whnite Wine").setPrice(7.00).setType(TypeEnum.WineGlass);
        ProductEntity prosecco = new ProductEntity().setName("Prosecco").setPrice(6.00).setType(TypeEnum.WineGlass);

        productRepository.save(kapatovoBlan);
        productRepository.save(kapatovoRed);
        productRepository.save(tipchenitzaRubin);
        productRepository.save(tipchenitzaSira);
        productRepository.save(tipchenitzWhite);
        productRepository.save(prosecco);
    }

    @Override
    public void intWineGlass() {
        ProductEntity sovignonBlan = new ProductEntity().setName("Совиньон Блан Салинас 2019г. 0,75л. Салла Естейт Salla Estate Sallinas Sauvignon Blanc 0,75l.").setPrice(32.00).setType(TypeEnum.WhiteWine);
        ProductEntity rizlingITraminer = new ProductEntity().setName("Ризлинг и Траминер Салинас 2019г. 0,75л. Салла Естейт / Salla Estate Sallinas Riesling and Traminer 0,751.").setPrice(32.00).setType(TypeEnum.WhiteWine);
        ProductEntity sovignonReserve = new ProductEntity().setName("Совиньон Блан Резерва Сейнт Клер Марлборо, Нова Зеландия / Saint Clair Sauvignon Blanc Marlborough, New Zealand 0,75I.").setPrice(32.00).setType(TypeEnum.WhiteWine);
        ProductEntity viognier = new ProductEntity().setName("Капатово Совиньон Блан и Вионие / Kapatovo Souvinon Blanc & Viognier").setPrice(40.00).setType(TypeEnum.WhiteWine);
        ProductEntity sovignonNewZealand = new ProductEntity().setName("Совиньон Блан Резерва Сейнт Клер Марлборо, Нова Зеландия / Saint Clair Sauvignon Blanc Marlborough, New Zealand 0,75I. ").setPrice(40.00).setType(TypeEnum.WhiteWine);

        productRepository.save(sovignonBlan);
        productRepository.save(rizlingITraminer);
        productRepository.save(sovignonReserve);
        productRepository.save(viognier);
        productRepository.save(sovignonNewZealand);
    }

    @Override
    public void initRedWine() {
        ProductEntity pinoNoar = new ProductEntity().setName("Пино Ноар Салинас 2019г. 0,75л. Салла Естейт / Salla Estate Sallinas Pinot Noir 0,75l.").setPrice(32.0).setType(TypeEnum.RedWine);
        ProductEntity salla = new ProductEntity().setName("Салла 2018г. Пино Ноар и Каберне Фран Салла Естейт Salla Red 2018r., Pinot Noir and Cabernet Franc 0,75l.").setPrice(40.00).setType(TypeEnum.RedWine);
        ProductEntity kapatovoGrenaj = new ProductEntity().setName("Капатово Гренаж, Мурведър и Сира / Kapatovo Grenache, Mourvedre & Shiraz").setPrice(40.00).setType(TypeEnum.RedWine);
        ProductEntity kapatovoSira = new ProductEntity().setName("Капатово Сира, Пети Вердо и Примитиво / Kapatovo Shiraz, Petit Verdot & Primitivo").setPrice(40.00).setType(TypeEnum.RedWine);

        productRepository.save(pinoNoar);
        productRepository.save(salla);
        productRepository.save(kapatovoGrenaj);
        productRepository.save(kapatovoSira);
    }

    @Override
    public void initRose() {
        ProductEntity pinoNoir = new ProductEntity().setName("Пино Ноар и Каберне Фран Салинас 2019г. Салла Естейт / Salla Estate Sallinas Rose, Pinot Noir and Cabernet Franc 0,75l.").setPrice(32.00).setType(TypeEnum.Rose);
        ProductEntity rozeGrenaj = new ProductEntity().setName("Розе от Гренаж и Мурведър, Капатово 0,75л. Kapatovo Rose Grenache Murvedre 0,75l.").setPrice(40.00).setType(TypeEnum.Rose);
        ProductEntity rozeSavignon = new ProductEntity().setName("Розе от Совиньон Блан Резерва Сейнт Клер, Нова Зеландия / Saint Clair Marlborough Estate Reserve Sauvignon Blanc Rose").setPrice(40.00).setType(TypeEnum.Rose);

        productRepository.save(pinoNoir);
        productRepository.save(rozeGrenaj);
        productRepository.save(rozeSavignon);
    }

    @Override
    public void initNonAlcoholic() {
        ProductEntity cocaCola = new ProductEntity().setName("Coca Cola, Schweppes").setPrice(2.50).setType(TypeEnum.NonAlcoholic);
        ProductEntity bankaSmall = new ProductEntity().setName("Mineral Water Bankya 0.25л.").setPrice(2.00).setType(TypeEnum.NonAlcoholic);
        ProductEntity bankyaLarge = new ProductEntity().setName("Mineral Water Bankya 1.5л.").setPrice(4.00).setType(TypeEnum.NonAlcoholic);
        ProductEntity cappy = new ProductEntity().setName("CAPPY Glass 0.35л.").setPrice(3.00).setType(TypeEnum.NonAlcoholic);
        ProductEntity fresh = new ProductEntity().setName("Fresh Orange 300ml.").setPrice(6.00).setType(TypeEnum.NonAlcoholic);
        ProductEntity klopatar_craft_soda = new ProductEntity().setName("Klopatar Craft Soda").setPrice(4.50).setType(TypeEnum.NonAlcoholic);
        ProductEntity three_cets = new ProductEntity().setName("Three Cets").setPrice(0.0).setType(TypeEnum.NonAlcoholic);
        ProductEntity lemonade = new ProductEntity().setName("Домашна Лимонада / Homemade Lemonade").setPrice(5.00).setType(TypeEnum.NonAlcoholic);
        ProductEntity syrup = new ProductEntity().setName("Домашен Сироп / Homemade Syrup").setPrice(5.00).setType(TypeEnum.NonAlcoholic);

        productRepository.save(cocaCola);
        productRepository.save(bankaSmall);
        productRepository.save(bankyaLarge);
        productRepository.save(cappy);
        productRepository.save(fresh);
        productRepository.save(klopatar_craft_soda);
        productRepository.save(three_cets);
        productRepository.save(lemonade);
        productRepository.save(syrup);
    }

    @Override
    public void initHotBeverages() {
        ProductEntity espresoArabica = new ProductEntity().setName("Espresso 100% Arabica").setPrice(2.50).setType(TypeEnum.HotBeverages);
        ProductEntity espresso_macchiato = new ProductEntity().setName("Espresso Macchiato").setPrice(3.00).setType(TypeEnum.HotBeverages);
        ProductEntity cappuccino = new ProductEntity().setName("Cappuccino").setPrice(4.00).setType(TypeEnum.HotBeverages);
        ProductEntity machiato = new ProductEntity().setName("Лате Макиато / Latte Machiato").setPrice(4.50).setType(TypeEnum.HotBeverages);
        ProductEntity hot_chocolate = new ProductEntity().setName("Hot chocolate").setPrice(6.00).setType(TypeEnum.HotBeverages);
        ProductEntity tea_from_tea_vibes = new ProductEntity().setName("Tea from Tea Vibes").setPrice(4.00).setType(TypeEnum.HotBeverages);
        ProductEntity cinnamonCloud = new ProductEntity().setName("Канелен Облак / Cinnamon Cloud").setPrice(5.00).setType(TypeEnum.HotBeverages);

        productRepository.save(espresoArabica);
        productRepository.save(espresso_macchiato);
        productRepository.save(cappuccino);
        productRepository.save(machiato);
        productRepository.save(hot_chocolate);
        productRepository.save(tea_from_tea_vibes);
        productRepository.save(cinnamonCloud);
    }

    @Override
    public void initNuts() {
        ProductEntity spicyPeanuts = new ProductEntity().setName("Пикантен фъстък / Spicy Peanuts").setPrice(3.00).setType(TypeEnum.Nuts);
        ProductEntity roastedPeanuts = new ProductEntity().setName("Печен фъстък / Roasted Peanuts").setPrice(3.00).setType(TypeEnum.Nuts);
        ProductEntity almondMix = new ProductEntity().setName("Бадеми и Фъстъци микс / Almonds and Peanuts mix").setPrice(5.00).setType(TypeEnum.Nuts);
        ProductEntity almond = new ProductEntity().setName("Бадем / Almond").setPrice(7.00).setType(TypeEnum.Nuts);
        ProductEntity olives = new ProductEntity().setName("Порция Маслини / Portion of Olives").setPrice(3.50).setType(TypeEnum.Nuts);

        productRepository.save(spicyPeanuts);
        productRepository.save(roastedPeanuts);
        productRepository.save(almondMix);
        productRepository.save(almond);
        productRepository.save(olives);
    }

    @Override
    public void initMenu() {
        ProductEntity flamClassic = new ProductEntity().setName("- Класик (Прошуто, Червен Лук и Рукола) / Classic (Prosciutto, Red Onion & Arugula)").setPrice(12.00).setType(TypeEnum.Menu);
        ProductEntity flamMediterranean = new ProductEntity().setName("- Средиземноморски с Сушени домати, Маслини и Моцарела / Mediterranean with Dried Tomatoes, Olives and Mozzarella").setPrice(13.00).setType(TypeEnum.Menu);
        ProductEntity flam3Cheese = new ProductEntity().setName("- Три Вида Сирена и Сладко / Three Types of Cheese & Jam").setPrice(14.00).setType(TypeEnum.Menu);
        ProductEntity flamGoat = new ProductEntity().setName("- Козе Сирене / Goat Cheese").setPrice(14.00).setType(TypeEnum.Menu);
        ProductEntity flamJackson = new ProductEntity().setName("- Джаксън Поллок, с Шоколад и Ядки Jackson Pollock, with Chocolate and Nuts").setPrice(12.00).setType(TypeEnum.Menu);
        ProductEntity beefBurger = new ProductEntity().setName("Телешки Бургер / Beef Burger").setPrice(12.00).setType(TypeEnum.Menu);
        ProductEntity vegetarianBUrger = new ProductEntity().setName("Вегетариански Бургер / Vegetarian Burger").setPrice(14.00).setType(TypeEnum.Menu);
        ProductEntity nurnberger = new ProductEntity().setName("Нюрнбергски Наденички / Nürnberger Würstel").setPrice(9.00).setType(TypeEnum.Menu);
        ProductEntity kasekrainer = new ProductEntity().setName("Кезе Крайнер — Наденици с Ементал / Käsekrainer").setPrice(9.00).setType(TypeEnum.Menu);
        ProductEntity wienerWurstel = new ProductEntity().setName("Виенски кренвирши с хрян Wiener Würstel with mustard and horseradish").setPrice(7.50).setType(TypeEnum.Menu);
        ProductEntity soupPida = new ProductEntity().setName("Супа на деня с Пида / Soup of the Day with Pida").setPrice(5.50).setType(TypeEnum.Menu);
        ProductEntity salads = new ProductEntity().setName("Салати / Salads").setPrice(9.00).setType(TypeEnum.Menu);
        ProductEntity pastaDay = new ProductEntity().setName("Паста на Деня / Pasta of the Day").setPrice(9.00).setType(TypeEnum.Menu);
        ProductEntity dolceDay = new ProductEntity().setName("Десерт на Деня / Dolce of the Day").setPrice(5.50).setType(TypeEnum.Menu);

        productRepository.save(flamClassic);
        productRepository.save(flamMediterranean);
        productRepository.save(flam3Cheese);
        productRepository.save(flamGoat);
        productRepository.save(flamJackson);
        productRepository.save(beefBurger);
        productRepository.save(vegetarianBUrger);
        productRepository.save(nurnberger);
        productRepository.save(kasekrainer);
        productRepository.save(wienerWurstel);
        productRepository.save(soupPida);
        productRepository.save(salads);
        productRepository.save(pastaDay);
        productRepository.save(dolceDay);
    }

    private void initJapaneseWhiskeys() {
        ProductEntity nikka_from_the_barrel = new ProductEntity().setName("Nikka From the Barrel").setPrice(14.00).setType(TypeEnum.JapaneseWhisky);
        ProductEntity nikka_super = new ProductEntity().setName("Nikka Super").setPrice(18.00).setType(TypeEnum.JapaneseWhisky);

        productRepository.save(nikka_from_the_barrel);
        productRepository.save(nikka_super);

    }

    private void initSingleMaltScotchWhiskeys() {
        ProductEntity glenlivet12 = new ProductEntity().setName("The Glenlivet 12YO Single Malt Scotch Whisky").setPrice(12.00).setType(TypeEnum.SingleMaltScotchWhisky);
        ProductEntity the_glenlivet_licensed_dram = new ProductEntity().setName("The Glenlivet Licensed Dram").setPrice(14.00).setType(TypeEnum.SingleMaltScotchWhisky);
        ProductEntity amrut_indian_single_malt = new ProductEntity().setName("Amrut Indian Single Malt").setPrice(15.00).setType(TypeEnum.SingleMaltScotchWhisky);
        ProductEntity finlaggan = new ProductEntity().setName("Finlaggan").setPrice(15.00).setType(TypeEnum.SingleMaltScotchWhisky);

        productRepository.save(glenlivet12);
        productRepository.save(the_glenlivet_licensed_dram);
        productRepository.save(amrut_indian_single_malt);
        productRepository.save(finlaggan);
    }

    private void initAmericanWhiskeys() {
        ProductEntity four_roses_bourbon_whiskey = new ProductEntity().setName("Four Roses Bourbon Whiskey").setPrice(6.00).setType(TypeEnum.AmericanWhisky);
        ProductEntity jack = new ProductEntity().setName("Jack Daniel's Tenessee Whiskey").setPrice(8.00).setType(TypeEnum.AmericanWhisky);
        ProductEntity bulleit_bourbon = new ProductEntity().setName("Bulleit Bourbon").setPrice(10.00).setType(TypeEnum.AmericanWhisky);
        ProductEntity bulleit = new ProductEntity().setName("American Straight BULLEIT 95 RYE Frontier Whiskey").setPrice(11.00).setType(TypeEnum.AmericanWhisky);

        productRepository.save(four_roses_bourbon_whiskey);
        productRepository.save(jack);
        productRepository.save(bulleit_bourbon);
        productRepository.save(bulleit);
    }

    private void initIrishWhiskeys() {
        ProductEntity jameson_irish_whiskey = new ProductEntity()
                .setName("Jameson Irish Whiskey")
                .setPrice(6.00)
                .setType(TypeEnum.IrishWhisky);
        ProductEntity jameson_black_barrel = new ProductEntity()
                .setName("Jameson Black Barrel")
                .setPrice(9.00)
                .setType(TypeEnum.IrishWhisky);
        ProductEntity porgues = new ProductEntity()
                .setName("The Porgues Single Malt Irish Whiskey")
                .setPrice(9.00)
                .setType(TypeEnum.IrishWhisky);

        productRepository.save(jameson_irish_whiskey);
        productRepository.save(jameson_black_barrel);
        productRepository.save(porgues);
    }

    private void initScotchWhiskeys() {
        ProductEntity johnieRedLabel = new ProductEntity()
                .setName("Johnnie Walker Red Label")
                .setPrice(6.00)
                .setType(TypeEnum.ScotchWhisky);
        ProductEntity johnieBlackLabel = new ProductEntity()
                .setName("Johnnie Walker Black Label 12YO")
                .setPrice(10.00)
                .setType(TypeEnum.ScotchWhisky);
        ProductEntity jbRare = new ProductEntity()
                .setName("J & B Rare")
                .setPrice(6.00)
                .setType(TypeEnum.ScotchWhisky);
        ProductEntity balantines = new ProductEntity()
                .setName("Balantines finest blended scotch whisky Label")
                .setPrice(6.00)
                .setType(TypeEnum.ScotchWhisky);
        ProductEntity chivast = new ProductEntity()
                .setName("Chivas Regal 12YO")
                .setPrice(9.00)
                .setType(TypeEnum.ScotchWhisky);

        productRepository.save(johnieRedLabel);
        productRepository.save(johnieBlackLabel);
        productRepository.save(jbRare);
        productRepository.save(balantines);
        productRepository.save(chivast);
    }
}
