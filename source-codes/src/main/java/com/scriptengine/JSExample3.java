package com.scriptengine;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import java.io.InputStream;
import java.io.InputStreamReader;

public class JSExample3 {
    public static void main(String[] args) throws Exception {
        String jsFile = "moment.js";
        InputStream jsInputStream = Thread.currentThread().getContextClassLoader().getResourceAsStream(jsFile);
        ScriptEngine engine = new ScriptEngineManager().getEngineByName("nashorn");
        engine.eval(new InputStreamReader(jsInputStream));
        System.out.println(engine.eval("moment().format('LLLL')"));
    }
}
