package creational.prototype;

import java.util.HashMap;
import java.util.Map;

class ColorStore {
    private static Map<String, Color> colorMap = new HashMap<>();
    static {
        colorMap.put("blue", new blueColor());
        colorMap.put("black", new blackColor());
    }

    static Color getColor(String colorName) {
        return (Color) colorMap.get(colorName).clone();
    }
}