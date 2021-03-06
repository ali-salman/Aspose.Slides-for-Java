/* 
 * Copyright 2001-2013 Aspose Pty Ltd. All Rights Reserved.
 *
 * This file is part of Aspose.Slides. The source code in this file
 * is only intended as a supplement to the documentation, and is provided
 * "as is", without warranty of any kind, either expressed or implied.
 */
 
package com.aspose.slides.examples.SmartArt.AddRemoveNodes;

import com.aspose.slides.*;
import com.aspose.slides.examples.Utils;

public class NodeAtSpecificPosition
{
    public static void main(String[] args) throws Exception
    {
        // The path to the documents directory.
        String dataDir = Utils.getDataDir(NodeAtSpecificPosition.class);

        //Creating a Presentation1 instance
        Presentation pres = new Presentation();

        //Access the Presentation1 slide
        ISlide slide = pres.getSlides().get_Item(0);

        //Add Smart Art IShape
        ISmartArt smart = slide.getShapes().addSmartArt(0, 0, 400, 400, SmartArtLayoutType.StackedList);

        //Accessing the SmartArt node at index 0
        ISmartArtNode node = smart.getAllNodes().get_Item(0);

        //Adding new child node at position 2 in parent node
        SmartArtNode chNode = (SmartArtNode)((SmartArtNodeCollection)node.getChildNodes()).addNodeByPosition(2);

        //Add Text
        chNode.getTextFrame().setText("Sample Text Added");

        //Save Presentation
        pres.save(dataDir+ "AddSmartArtNodeByPosition.pptx", SaveFormat.Pptx);

    }
}




