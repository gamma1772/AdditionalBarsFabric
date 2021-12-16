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

package com.gamma1772.additionalbars.content.block;

import net.minecraft.block.PaneBlock;

public class BarsBlock extends PaneBlock {

    private String pathName;
    private EnumType type;
    private String texturePath;

    public BarsBlock(Settings settings) {
        super(settings);
        this.pathName = "";
        this.texturePath = "";
        this.type = EnumType.UNDEFINED;
    }

    public BarsBlock(Settings settings, String pathName, EnumType type, String texturePath) {
        super(settings);
        this.pathName = pathName;
        this.type = type;

        if (!(texturePath.charAt(0) == '/')) {
            this.texturePath = "minecraft:block/" + texturePath;
        }
        else {
            this.texturePath = "additionalbars:block" + texturePath;
        }
    }

    public String getPathName() { return pathName; }
    public EnumType getType() { return type; }
    public String getTexturePath() { return texturePath; }
}
