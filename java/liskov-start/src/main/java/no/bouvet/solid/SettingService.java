package no.bouvet.solid;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SettingService {

    private List<Setting> allSettingStores() {
        return Arrays.asList(new ApplicationSetting(), new UserSetting(), new SpecialGeneratedSetting());
    }

    public List<String> loadAll() {
        List<String> settings = new ArrayList<>();
        allSettingStores().forEach(settingStore -> settings.add(settingStore.load()));
        return settings;
    }

    public void saveAll() {
        for (Setting settingStore : allSettingStores()) {
            if (settingStore instanceof SpecialGeneratedSetting) {
                return;
            }
            settingStore.save();
        }
    }
}
