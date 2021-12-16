/*
MIT License

Copyright (c) 2020 Marko Dujović

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.
 */

package com.gamma1772.additionalbars;

import com.gamma1772.additionalbars.events.ModRegistry;
import com.gamma1772.additionalbars.init.ABContent;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class AdditionalBars implements ModInitializer
{
    //public boolean generateData = false;
    public static final String MODID = "additionalbars";

    public static final ItemGroup ADDITIONAL_BARS = FabricItemGroupBuilder.build(
            new Identifier(MODID, "additionalbars"),
            () -> new ItemStack(ABContent.GOLD_BARS));
    public static final ItemGroup HORIZONTAL_ADDITIONAL_BARS = FabricItemGroupBuilder.build(
            new Identifier(MODID, "horizontaladditionalbars"),
            () -> new ItemStack(ABContent.HORIZONTAL_GOLD_BARS));

    public static AdditionalBars INSTANCE;

    @Override
    public void onInitialize()
    {
        INSTANCE = this;
        ModRegistry.setup();

//        if (generateData) {
//            DataGenerator.init();
//            System.exit(999);
//        }
    }
}
