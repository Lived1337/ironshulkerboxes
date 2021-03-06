package com.progwml6.ironshulkerbox.common.inventory;

import com.progwml6.ironshulkerbox.common.block.GenericIronShulkerBlock;
import net.minecraft.block.Block;
import net.minecraft.block.ShulkerBoxBlock;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.container.Slot;
import net.minecraft.item.ItemStack;

public class ShulkerBoxSlot extends Slot {

  public ShulkerBoxSlot(IInventory inventoryIn, int slotIndexIn, int xPosition, int yPosition) {
    super(inventoryIn, slotIndexIn, xPosition, yPosition);
  }

  @Override
  public boolean isItemValid(ItemStack stack) {
    return !(Block.getBlockFromItem(stack.getItem()) instanceof GenericIronShulkerBlock) && !(Block.getBlockFromItem(stack.getItem()) instanceof ShulkerBoxBlock);
  }
}
