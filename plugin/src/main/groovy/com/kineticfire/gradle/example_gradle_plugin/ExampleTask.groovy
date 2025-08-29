/*
 * (c) Copyright 2023-2025 example-gradle-plugin Contributors. All rights reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
/*
 * KineticFire Labs: https://labs.kineticfire.com/
 *     project site: https://github.com/kineticfire-labs/example-gradle-plugin/
 */
package com.kineticfire.gradle.example_gradle_plugin

import org.gradle.api.DefaultTask
import org.gradle.api.tasks.TaskAction


/**
 * A task for the plugin.
 */
abstract class ExampleTask extends DefaultTask {

    @TaskAction
    def doExample( ) {
        println 'ExampleTask: running example task!'
    }

}


