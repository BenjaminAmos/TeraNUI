/*
 * Copyright 2014 MovingBlocks
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.terasology.nui.widgets;

import org.joml.Vector2i;
import org.terasology.nui.Canvas;
import org.terasology.nui.CoreWidget;
import org.terasology.nui.LayoutConfig;

/**
 * A simple spacing widget
 */
public class UISpace extends CoreWidget {

    @LayoutConfig
    private Vector2i size = new Vector2i();

    public UISpace() {
    }

    public UISpace(Vector2i size) {
        this.size.set(size);
    }

    /**
     * @return The width and height of the space in a vector..
     */
    public Vector2i getSize() {
        return size;
    }

    /**
     * @param size The new width and height in a vector.
     */
    public void setSize(Vector2i size) {
        this.size.set(size);
    }

    @Override
    public void onDraw(Canvas canvas) {
    }

    @Override
    public Vector2i getPreferredContentSize(Canvas canvas, Vector2i areaHint) {
        return new Vector2i(size);
    }
}
