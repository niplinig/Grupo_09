package fashion;

import java.util.LinkedList;

public class ThemeManager {

    public LinkedList<Theme> themes = new LinkedList<>();

    public ThemeManager() {
        themes.add(new Theme("Color", "ColorTheme.css"));
        themes.add(new Theme("Abstract", "AbstractTheme.css"));
        themes.add(new Theme("Hacker", "HackerTheme.css"));
    }

    public LinkedList<Theme> getThemes() {
        return themes;
    }

    
}
