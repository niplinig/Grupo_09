package fashion;

import java.util.LinkedList;

public class ThemeManager {

    public LinkedList<Theme> themes = new LinkedList<>();

    public ThemeManager() {
        themes.add(new Theme("Default Theme", "DefaultTheme.css"));
        themes.add(new Theme("Color Theme", "ColorTheme.css"));
        themes.add(new Theme("Abstract Theme", "AbstractTheme.css"));
    }

    public LinkedList<Theme> getThemes() {
        return themes;
    }

}
