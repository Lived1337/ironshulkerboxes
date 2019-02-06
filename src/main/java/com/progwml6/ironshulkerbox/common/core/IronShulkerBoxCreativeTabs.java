/*******************************************************************************
 * Copyright (c) 2012 cpw.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the GNU Public License v3.0
 * which accompanies this distribution, and is available at
 * http://www.gnu.org/licenses/gpl.html
 * <p>
 * Contributors:
 * cpw - initial API and implementation
 ******************************************************************************/
package com.progwml6.ironshulkerbox.common.core;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

public final class IronShulkerBoxCreativeTabs
{
    private IronShulkerBoxCreativeTabs()
    {
    }

    public static final ItemGroup IRON_SHULKER_BOX = new ItemGroup("ironshulkerbox")
    {
        @Override
        @OnlyIn(Dist.CLIENT)
        public ItemStack createIcon()
        {
            return new ItemStack(IronShulkerBoxBlocks.blackIronShulkerBoxBlock);
        }
    };
}
