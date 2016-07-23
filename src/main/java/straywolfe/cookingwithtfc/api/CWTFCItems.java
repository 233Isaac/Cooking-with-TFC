package straywolfe.cookingwithtfc.api;

import java.util.ArrayList;

import com.bioxx.tfc.Items.ItemTerra;
import com.bioxx.tfc.api.TFCItems;

import net.minecraft.item.Item;
import straywolfe.cookingwithtfc.common.item.CWTFCItemRegistry;
import straywolfe.cookingwithtfc.common.item.CWTFCItemSetup;
import straywolfe.cookingwithtfc.common.lib.Settings;

public class CWTFCItems 
{	
	public static ArrayList<ItemTerra> subfoodList;
	
	//Fruits
	public static Item redAppleCWTFC;
	public static Item bananaCWTFC;
	public static Item orangeCWTFC;
	public static Item greenAppleCWTFC;
	public static Item lemonCWTFC;
	public static Item oliveCWTFC;
	public static Item cherryCWTFC;
	public static Item peachCWTFC;
	public static Item plumCWTFC;
	
	public static Item wintergreenBerryCWTFC;
	public static Item blueberryCWTFC;
	public static Item raspberryCWTFC;
	public static Item strawberryCWTFC;
	public static Item blackberryCWTFC;
	public static Item bunchberryCWTFC;
	public static Item cranberryCWTFC;
	public static Item snowberryCWTFC;
	public static Item elderberryCWTFC;
	public static Item gooseberryCWTFC;
	public static Item cloudberryCWTFC;
	
	//Vegetables
	public static Item tomatoCWTFC;
	public static Item potatoCWTFC;
	public static Item onionCWTFC;
	public static Item cabbageCWTFC;
	public static Item garlicCWTFC;
	public static Item carrotCWTFC;
	public static Item greenbeansCWTFC;
	public static Item greenBellPepperCWTFC;
	public static Item yellowBellPepperCWTFC;
	public static Item redBellPepperCWTFC;
	public static Item squashCWTFC;
	public static Item seaWeedCWTFC;
	
	//Proteins
	public static Item porkchopRawCWTFC;
	public static Item porkchopCookedCWTFC;
	public static Item fishRawCWTFC;
	public static Item fishCookedCWTFC;
	public static Item beefRawCWTFC;
	public static Item beefCookedCWTFC;
	public static Item chickenRawCWTFC;
	public static Item chickenCookedCWTFC;
	public static Item soybeanCWTFC;
	public static Item eggCWTFC;
	public static Item eggCookedCWTFC;
	public static Item calamariRawCWTFC;
	public static Item calamariCookedCWTFC;
	public static Item muttonRawCWTFC;
	public static Item muttonCookedCWTFC;
	public static Item venisonRawCWTFC;
	public static Item venisonCookedCWTFC;
	public static Item horseMeatRawCWTFC;
	public static Item horseMeatCookedCWTFC;
	
	//Dairy
	public static Item cheeseCWTFC;
	public static Item woodenBucketMilkCWTFC;
	
	//Grains
	public static Item barleyWholeCWTFC;
	public static Item oatWholeCWTFC;
	public static Item riceWholeCWTFC;
	public static Item ryeWholeCWTFC;
	public static Item wheatWholeCWTFC;
	public static Item maizeEarCWTFC;
	
	public static Item barleyGrainCWTFC;
	public static Item oatGrainCWTFC;
	public static Item riceGrainCWTFC;
	public static Item ryeGrainCWTFC;
	public static Item wheatGrainCWTFC;
	
	public static Item barleyGroundCWTFC;
	public static Item cornmealGroundCWTFC;
	public static Item oatGroundCWTFC;
	public static Item riceGroundCWTFC;
	public static Item ryeGroundCWTFC;
	public static Item wheatGroundCWTFC;
	
	public static Item barleyDoughCWTFC;
	public static Item cornmealDoughCWTFC;
	public static Item oatDoughCWTFC;
	public static Item riceDoughCWTFC;
	public static Item ryeDoughCWTFC;
	public static Item wheatDoughCWTFC;
	
	public static Item barleyBreadCWTFC;
	public static Item cornBreadCWTFC;
	public static Item oatBreadCWTFC;
	public static Item riceBreadCWTFC;
	public static Item ryeBreadCWTFC;
	public static Item wheatBreadCWTFC;	
	
	public static Item sugarcaneCWTFC;
	public static Item sugarCWTFC;
	
	public static Item VeggySalad;
	public static Item PotatoSalad;
	public static Item FruitSalad;
	
	public static Item HamSandwich;
	public static Item ChickenSandwich;
	public static Item RoastBeefSandwich;
	public static Item SalmonSandwich;
	public static Item FriedEggSandwich;
	public static Item MuttonSandwich;
	public static Item VenisonSteakSandwich;
	public static Item VegetarianSandwich;
	public static Item ToastSandwich;
	
	public static Item VegetableSoup;
	public static Item TomatoSoup;
	public static Item ChickenSoup;
	public static Item BeefStew;
	public static Item VenisonStew;
	public static Item FishChowder;
	
	public static Item Broth;
	public static Item BoiledChicken;
	public static Item BoiledBeef;
	public static Item BoiledFish;
	public static Item BoiledPork;
	public static Item BoiledVenison;
	
	public static Item Salt;
	
	public static Item ClayCookingPot;
	
	public static void initialise()
	{
		/*///////////////////////////////////////////////
		 * Remove Items being replaced from Creative Tabs
		 *///////////////////////////////////////////////
		
		if(Settings.hideTFCFoods)
		{		
			//Fruit
			TFCItems.redApple.setCreativeTab(null);
			TFCItems.banana.setCreativeTab(null);
			TFCItems.orange.setCreativeTab(null);
			TFCItems.greenApple.setCreativeTab(null);
			TFCItems.lemon.setCreativeTab(null);
			TFCItems.olive.setCreativeTab(null);
			TFCItems.cherry.setCreativeTab(null);
			TFCItems.peach.setCreativeTab(null);
			TFCItems.plum.setCreativeTab(null);
			
			TFCItems.wintergreenBerry.setCreativeTab(null);
			TFCItems.blueberry.setCreativeTab(null);
			TFCItems.raspberry.setCreativeTab(null);
			TFCItems.strawberry.setCreativeTab(null);
			TFCItems.blackberry.setCreativeTab(null);
			TFCItems.bunchberry.setCreativeTab(null);
			TFCItems.cranberry.setCreativeTab(null);
			TFCItems.snowberry.setCreativeTab(null);
			TFCItems.elderberry.setCreativeTab(null);
			TFCItems.gooseberry.setCreativeTab(null);
			TFCItems.cloudberry.setCreativeTab(null);
			
			//Vegetables
			TFCItems.tomato.setCreativeTab(null);
			TFCItems.potato.setCreativeTab(null);
			TFCItems.onion.setCreativeTab(null);
			TFCItems.cabbage.setCreativeTab(null);
			TFCItems.garlic.setCreativeTab(null);
			TFCItems.carrot.setCreativeTab(null);
			TFCItems.greenbeans.setCreativeTab(null);
			TFCItems.greenBellPepper.setCreativeTab(null);
			TFCItems.yellowBellPepper.setCreativeTab(null);
			TFCItems.redBellPepper.setCreativeTab(null);
			TFCItems.squash.setCreativeTab(null);
			TFCItems.seaWeed.setCreativeTab(null);
			
			//Proteins
			TFCItems.porkchopRaw.setCreativeTab(null);
			TFCItems.fishRaw.setCreativeTab(null);
			TFCItems.beefRaw.setCreativeTab(null);
			TFCItems.chickenRaw.setCreativeTab(null);
			TFCItems.soybean.setCreativeTab(null);
			TFCItems.egg.setCreativeTab(null);
			TFCItems.eggCooked.setCreativeTab(null);
			TFCItems.calamariRaw.setCreativeTab(null);
			TFCItems.muttonRaw.setCreativeTab(null);
			TFCItems.venisonRaw.setCreativeTab(null);
			TFCItems.horseMeatRaw.setCreativeTab(null);
			
			//Dairy
			TFCItems.cheese.setCreativeTab(null);
			TFCItems.woodenBucketMilk.setCreativeTab(null);
			
			//Grains
			TFCItems.barleyWhole.setCreativeTab(null);
			TFCItems.oatWhole.setCreativeTab(null);
			TFCItems.riceWhole.setCreativeTab(null);
			TFCItems.ryeWhole.setCreativeTab(null);
			TFCItems.wheatWhole.setCreativeTab(null);
			TFCItems.maizeEar.setCreativeTab(null);
			
			TFCItems.barleyGrain.setCreativeTab(null);
			TFCItems.oatGrain.setCreativeTab(null);
			TFCItems.riceGrain.setCreativeTab(null);
			TFCItems.ryeGrain.setCreativeTab(null);
			TFCItems.wheatGrain.setCreativeTab(null);
			
			TFCItems.barleyGround.setCreativeTab(null);
			TFCItems.cornmealGround.setCreativeTab(null);
			TFCItems.oatGround.setCreativeTab(null);
			TFCItems.riceGround.setCreativeTab(null);
			TFCItems.ryeGround.setCreativeTab(null);
			TFCItems.wheatGround.setCreativeTab(null);
			
			TFCItems.barleyDough.setCreativeTab(null);
			TFCItems.cornmealDough.setCreativeTab(null);
			TFCItems.oatDough.setCreativeTab(null);
			TFCItems.riceDough.setCreativeTab(null);
			TFCItems.ryeDough.setCreativeTab(null);
			TFCItems.wheatDough.setCreativeTab(null);
			
			TFCItems.barleyBread.setCreativeTab(null);
			TFCItems.cornBread.setCreativeTab(null);
			TFCItems.oatBread.setCreativeTab(null);
			TFCItems.riceBread.setCreativeTab(null);
			TFCItems.ryeBread.setCreativeTab(null);
			TFCItems.wheatBread.setCreativeTab(null);
			
			TFCItems.sugarcane.setCreativeTab(null);
			TFCItems.sugar.setCreativeTab(null);
		}
		
		//Setup Items
		CWTFCItemSetup.ItemSetup();
		
		//Register Items
		CWTFCItemRegistry.registerItems();
	}
}