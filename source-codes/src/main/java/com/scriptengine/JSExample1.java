package com.scriptengine;

import javax.script.*;
import java.util.List;
import java.util.Map;

public class JSExample1 {
    public record Person(String name, int age) {
    }

    static void checkDefaultScriptEngines() {
        ScriptEngineManager sem = new ScriptEngineManager();
        List<ScriptEngineFactory> factories = sem.getEngineFactories();
        for (ScriptEngineFactory factory : factories)
            System.out.println(factory.getEngineName() + " " + factory.getEngineVersion() + " " + factory.getNames());
        if (factories.isEmpty())
            System.out.println("No Script Engines found");
    }

    static void sayHello(String name) throws Exception {
        ScriptEngine engine = new ScriptEngineManager().getEngineByName("nashorn");
        engine.eval("print('Hello %s');".formatted(name));
    }

    static String passParameter(String name, int count) throws Exception {
        ScriptEngine engine = new ScriptEngineManager().getEngineByName("nashorn");
        Bindings bindings = engine.createBindings();
        bindings.put("count", count);
        bindings.put("name", name);

        String script = "var greeting='Hello ';" +
                "for(var i=count;i>0;i--) { " +
                "greeting+=name + ' '" +
                "}" +
                "greeting";

        return (String) engine.eval(script, bindings);
    }

    static String invokeAddFunction(int a, int b) throws Exception {
        ScriptEngine engine = new ScriptEngineManager().getEngineByName("nashorn");
        engine.eval(
                """
                        function addFunction(a,b) {
                            return a + b;
                        };
                        """);
        Invocable invocable = (Invocable) engine;
        return String.valueOf(invocable.invokeFunction("addFunction", a, b));
    }

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
        checkDefaultScriptEngines();
        sayHello("Nashorn JavaScript Engine");
        System.out.println(passParameter("Shaparak", 3));
        int a = 2, b = 7;
        System.out.printf("add (%d,%d): %s\n", a, b, invokeAddFunction(a, b));
        System.out.println(usingJavaHashMap());
        System.out.println("average person age: " + averageAge(List.of(
                new Person("a", 20),
                new Person("b", 25),
                new Person("c", 30),
                new Person("d", 35)
        )));
    }
}
