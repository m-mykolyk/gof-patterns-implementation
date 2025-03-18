package structural.flyweight;

import java.util.HashMap;
import java.util.Map;

class FontFactory {
    private static final Map<String, Font> fontCache = new HashMap<>();

    static  Font getFont(String fontName) {
        if(!fontCache.containsKey(fontName)) {
            fontCache.put(fontName, new SharedFont(fontName));
            System.out.println("Created new font: " + fontName);
        } else {
            System.out.println("Reusing existing font: " + fontName);
        }
        return fontCache.get(fontName);
    }
}
