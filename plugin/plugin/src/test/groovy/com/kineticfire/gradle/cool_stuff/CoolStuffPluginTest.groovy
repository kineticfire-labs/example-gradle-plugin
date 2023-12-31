/*
 * (c) Copyright 2023 KineticFire. All rights reserved.
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
package com.kineticfire.gradle.cool_stuff


import org.gradle.testfixtures.ProjectBuilder
import org.gradle.api.Project
import spock.lang.Specification


/**
 * A simple unit test for the plugin.
 */
class CoolStuffPluginTest extends Specification {

    def "plugin registers 'coolThing' task"() {
        given:
        def project = ProjectBuilder.builder( ).build( )

        when:
        project.plugins.apply( 'com.kineticfire.gradle.cool_stuff' )

        then:
        project.tasks.findByName( 'coolThing' ) != null
    }

    def "plugin registers 'greatThing' task"() {
        given:
        def project = ProjectBuilder.builder( ).build( )

        when:
        project.plugins.apply( 'com.kineticfire.gradle.cool_stuff' )

        then:
        project.tasks.findByName( 'greatThing' ) != null
    }

}
