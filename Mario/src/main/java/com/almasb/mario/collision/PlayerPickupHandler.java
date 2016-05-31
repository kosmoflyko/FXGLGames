/*
 * The MIT License (MIT)
 *
 * FXGL - JavaFX Game Library
 *
 * Copyright (c) 2015-2016 AlmasB (almaslvl@gmail.com)
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package com.almasb.mario.collision;

import com.almasb.ents.Entity;
import com.almasb.fxgl.physics.CollisionHandler;
import com.almasb.mario.EntityType;

public class PlayerPickupHandler extends CollisionHandler {

    public PlayerPickupHandler() {
        super(EntityType.PLAYER, EntityType.PICKUP);
    }

    @Override
    public void onCollisionBegin(Entity a, Entity b) {
//        PickupType type = b.getProperty(Property.SUB_TYPE);
//
//        switch (type) {
//            case COIN:
//                a.fireFXGLEvent(new FXGLEvent(Event.PICKUP_COIN, b));
//                break;
//            case GHOST_BOMB:
//                a.fireFXGLEvent(new FXGLEvent(Event.PICKUP_GHOST_BOMB, b));
//                break;
//            default:
//                System.out.println("Warning: unknown type of pickup: " + type);
//                break;
//        }
    }
}
