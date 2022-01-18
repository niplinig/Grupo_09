package fashion;

import java.util.ArrayList;

public class ThemeManager {

    public ArrayList<Theme> themes = new ArrayList<>();

    public ThemeManager() {
        themes.add(new Theme("Color", "ColorTheme.css"));
        themes.add(new Theme("Abstract", "AbstractTheme.css"));
        themes.add(new Theme("Hacker", "HackerTheme.css"));
        themes.add(new Theme("Default", "default.css"));
    }

    public ArrayList<Theme> getThemes() {
        return themes;
    }

    
}
