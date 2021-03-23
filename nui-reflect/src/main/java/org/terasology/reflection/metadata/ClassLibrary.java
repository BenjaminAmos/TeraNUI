/*
 * Copyright 2013 MovingBlocks
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

package org.terasology.reflection.metadata;

/**
 * The interface for a class library. These store metadata on a type of class, and provide the ability to copy them.
 *
 * @param <T> The base type of all classes that belong to this library.
 */
public interface ClassLibrary<T> extends Iterable<ClassMetadata<? extends T, ?>> {

    /**
     * Registers a class with this library
     *
     * @param uri   The uri to use to find this class
     * @param clazz The class to register with this library
     */
    void register(String uri, Class<? extends T> clazz);

    /**
     * @param clazz The class to retrieve metadata for
     * @return The metadata for the given clazz, or null if not registered.
     */
    <U extends T> ClassMetadata<U, ?> getMetadata(Class<U> clazz);

    /**
     * Looks up the class metadata for the provided object. The specific class of the object must be registered in the class loader - super classes will not be checked.
     *
     * @param object The object to retrieve metadata for
     * @param <U>    The type of the object
     * @return The metadata for the class of the given object, or null if it is not registered.
     */
    <U extends T> ClassMetadata<U, ?> getMetadata(U object);

    /**
     * Copies the registered class
     *
     * @param object The object to create a copy of
     * @return A copy of the class, or null if not registered
     */
    <TYPE extends T> TYPE copy(TYPE object);

    /**
     * @param id The id identifying the class to look up
     * @return The metadata for the given class, or null if not registered.
     */
    ClassMetadata<? extends T, ?> getMetadata(String id);

    /**
     * Resolves metadata for a class given a string that may either be a uri or just a name. T
     * his will return null if either there is no class identified by that name, or more than one.
     *
     * @param name The uri or name of a class
     * @return The metadata for the given class, or null if it couldn't be resolved to a single option.
     */
    ClassMetadata<? extends T, ?> resolve(String name);

}
