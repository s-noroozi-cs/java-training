package com.scriptengine;

import javax.script.Invocable;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import java.util.List;

public class JSExample2 {
    static double averageAge(List<JSExample1.Person> persons) throws Exception {
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

        System.out.println("average person age: " + averageAge(List.of(
                new JSExample1.Person("a", 20),
                new JSExample1.Person("b", 25),
                new JSExample1.Person("c", 30),
                new JSExample1.Person("d", 35)
        )));
    }
}
