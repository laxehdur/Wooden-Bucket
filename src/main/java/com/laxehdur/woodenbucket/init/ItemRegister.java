package com.laxehdur.woodenbucket.init;

import com.laxehdur.woodenbucket.items.WoodenBucket;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ItemRegister
{
	public static Item wooden_bucket;
	
	public static void init(){
		wooden_bucket = new WoodenBucket(Blocks.AIR);
	}
	
	public static void register(){
	    GameRegistry.register(wooden_bucket);
	}
	
	public static void registerRenders(){
		registerRender(wooden_bucket);
	}
	
	public static void registerRender(Item item){
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
	}
	
	public static enum Items {
		WOODEN_BUCKET("wooden_bucket", "WoodenBucket");
		
		private String unlocalizedName;
		private String registryName;
		
		Items(String unlocalizedName, String registryName) {
			this.unlocalizedName = unlocalizedName;
			this.registryName = registryName;
		}
		
		public String getRegistryName() {
			return registryName;
		}
		
		public String getUnlocalizedName() {
			return unlocalizedName;
		}

	} 
}