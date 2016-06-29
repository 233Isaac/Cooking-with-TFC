package com.JAWolfe.cookingwithtfc.inventory;

import org.lwjgl.opengl.GL11;

import com.JAWolfe.cookingwithtfc.handlers.messages.CreateRecipePacket;
import com.JAWolfe.cookingwithtfc.inventory.Containers.ContainerPrepTable;
import com.JAWolfe.cookingwithtfc.references.Textures;
import com.JAWolfe.cookingwithtfc.tileentities.TEPrepTable;
import com.bioxx.tfc.TerraFirmaCraft;
import com.bioxx.tfc.Core.TFC_Core;
import com.bioxx.tfc.Core.Player.PlayerInventory;
import com.bioxx.tfc.GUI.GuiContainerTFC;

import net.minecraft.client.gui.GuiButton;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.world.World;

public class GUIPrepTable extends GuiContainerTFC
{
	protected EntityPlayer player;
	protected TEPrepTable teTable;
	
	public GUIPrepTable(InventoryPlayer inventoryplayer, TEPrepTable te, World world, int x, int y, int z)
	{
		super(new ContainerPrepTable(inventoryplayer, te), 176, 86);
		player = inventoryplayer.player;
		teTable = te;
		guiLeft = (width - 208) / 2;
		guiTop = (height - 198) / 2;
	}
	
	@Override
	public void updateScreen()
	{
		if(teTable.getRecipeListSize() > 0)
		{
			if(teTable.getRecipeListRef() == 0)
				((GuiButton) buttonList.get(0)).enabled = false;
			else
				((GuiButton) buttonList.get(0)).enabled = true;
			
			if(teTable.getRecipeListRef() < teTable.getRecipeListSize() - 1)
				((GuiButton) buttonList.get(1)).enabled = true;
			else
				((GuiButton) buttonList.get(1)).enabled = false;
		}
		else
		{
			((GuiButton) buttonList.get(0)).enabled = false;
			((GuiButton) buttonList.get(1)).enabled = false;
		}
		
		((GuiButton) buttonList.get(2)).enabled = true;
	}
	
	@Override
	protected void actionPerformed(GuiButton guibutton)
	{
		if (guibutton.id == 0 && teTable.getRecipeListRef() != 0)
		{
			TerraFirmaCraft.PACKET_PIPELINE.sendToServer(new CreateRecipePacket(teTable, 0));
			teTable.subRecipeListRef();
		}
		else if(guibutton.id == 1 && teTable.getRecipeListRef() < teTable.getRecipeListSize() - 1)
		{
			TerraFirmaCraft.PACKET_PIPELINE.sendToServer(new CreateRecipePacket(teTable, 1));
			teTable.addRecipeListRef();
		}
		else if(guibutton.id == 2)
		{
			TerraFirmaCraft.PACKET_PIPELINE.sendToServer(new CreateRecipePacket(teTable, 2));
			teTable.popRecipes(player);
		}
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public void initGui()
	{		
		super.initGui();
		
		buttonList.clear();
		buttonList.add(new GuiButton(0, guiLeft + 105, guiTop + 44, 18, 17, "<"));
		buttonList.add(new GuiButton(1, guiLeft + 143, guiTop + 44, 18, 17, ">"));
		buttonList.add(new GuiButton(2, guiLeft + 105, guiTop + 63, 56, 17, TFC_Core.translate("gui.PrepTable.Recipes")));
	}	
	
	@Override
	protected void drawGuiContainerBackgroundLayer(float f, int mouseX, int mouseY)
	{
		GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
		
		int type = teTable.tableType;
		
		switch(type)
		{		
			default: case 0: bindTexture(Textures.Gui.PREPTABLE1); break;
			case 1: case 2: bindTexture(Textures.Gui.PREPTABLE2); break;
			case 3: case 4: bindTexture(Textures.Gui.PREPTABLE3); break;
			case 5: case 6: bindTexture(Textures.Gui.PREPTABLE4); break;
			case 7: case 8: bindTexture(Textures.Gui.PREPTABLE5); break;
			case 9: case 10: bindTexture(Textures.Gui.PREPTABLE6); break;
			case 11: case 12: bindTexture(Textures.Gui.PREPTABLE7); break;
			case 13: case 14: bindTexture(Textures.Gui.PREPTABLE8); break;
			case 15: case 16:bindTexture(Textures.Gui.PREPTABLE9); break;
		}
		
		if(type == 0 || type == 2 || type == 4 || type == 6 || type == 8 
				|| type == 10 || type == 12 || type == 14 || type == 16)
			drawTexturedModalRect(guiLeft, guiTop, 0, 87, xSize, this.getShiftedYSize());
		else
			drawTexturedModalRect(guiLeft, guiTop, 0, 0, xSize, this.getShiftedYSize());
		
		PlayerInventory.drawInventory(this, width, height, this.getShiftedYSize() - 2);
	}
}
