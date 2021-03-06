/*
 * Copyright 2020 MovingBlocks
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.terasology.nui.events;

import org.terasology.input.ButtonState;
import org.terasology.input.MouseInput;
import org.joml.Vector2i;

public class NUIMouseButtonEvent extends NUIMouseEvent {
    private MouseInput button;
    private ButtonState state;
    private Vector2i mousePosition = new Vector2i();

    public NUIMouseButtonEvent(MouseInput button, ButtonState state, Vector2i mousePosition) {
        super(null, null, mousePosition);
        this.state = state;
        this.button = button;
    }

    public ButtonState getState() {
        return state;
    }

    public MouseInput getButton() {
        return button;
    }

    public String getMouseButtonName() {
        return button.getName();
    }

    public String getButtonName() {
        return "mouse:" + getMouseButtonName();
    }

    public Vector2i getMousePosition() {
        return new Vector2i(mousePosition);
    }

    protected void setButton(MouseInput button) {
        this.button = button;
    }

    public void setMousePosition(Vector2i mousePosition) {
        this.mousePosition.set(mousePosition);
    }
}
