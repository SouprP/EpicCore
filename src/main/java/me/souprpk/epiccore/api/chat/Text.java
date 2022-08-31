package me.souprpk.epiccore.api.chat;

import org.bukkit.ChatColor;

public class Text {

    /**
     *
     * @param text text to color
     * @return returns a colored text
     */
    public static String color(String text){
        return ChatColor.translateAlternateColorCodes('&', text);
    }

    /**
     *
     * @param text text to color
     * @param colorCode color code to use
     * @return returns a colored text
     */
    public static String color(char colorCode, String text){
        return ChatColor.translateAlternateColorCodes(colorCode, text);
    }

    public static String decolor(String text){
        return ChatColor.stripColor(text);
    }
    
}
