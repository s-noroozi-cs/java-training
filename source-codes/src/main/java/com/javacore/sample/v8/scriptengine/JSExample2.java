package com.javacore.sample.v8.scriptengine;

import com.javacore.sample.v8.model.Person;

import javax.script.Invocable;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import java.util.List;
import java.util.Map;

public class JSExample2 {
    static Map usingJavaHashMap() throws Exception {
        ScriptEngine engine = new ScriptEngineManager().getEngineByName("nashorn");
        return (Map) engine.eval(
                """
                        var HashMap = Java.type('java.util.HashMap');
                        var map = new HashMap();
                        map.put('hello', 'world');
                        map;
                        """);
    }

    static double averageAge(List<Person> persons) throws Exception {
        ScriptEngine engine = new ScriptEngineManager().getEngineByName("nashorn");
        engine.eval(
                """
                        function averageAge(persons) {
                            var age=0;
                            var num=0;
                            for each (var p in persons) {
                                /* person class should be public to access it*/
                                age += p.age
                                num++;
                            }
                            return age / num;
                        };
                        """);
        Invocable invocable = (Invocable) engine;
        return (double)invocable.invokeFunction("averageAge", persons);
    }

    public static void main(String[] args) throws Exception {
        System.out.println(usingJavaHashMap());

        System.out.println("average person age: " + averageAge(List.of(
                new Person("a", 20),
                new Person("b", 25),
                new Person("c", 30),
                new Person("d", 35)
        )));
    }
}
