package com.liumapp.workable.converter.decorators;

import com.liumapp.qtools.property.core.ConfigurationNode;
import com.liumapp.workable.converter.config.ConverterConfig;
import com.liumapp.workable.converter.core.LoadingConfig;
import com.liumapp.workable.converter.templates.NormalConverterConfigLoaderTemplate;

/**
 * file CreatingFoldersForParamsConfig.java
 * author liumapp
 * github https://github.com/liumapp
 * email liumapp.com@gmail.com
 * homepage http://www.liumapp.com
 * date 2019/5/11
 */
public class CreatingFoldersForParamsConfig extends NormalConverterConfigLoaderTemplate {
    public CreatingFoldersForParamsConfig(LoadingConfig loadingConfig) {
        super(loadingConfig);
    }

    @Override
    public ConverterConfig loadConfig(ConfigurationNode node) throws Throwable {
        //get all config params
        ConverterConfig config = super.loadConfig(node);
        //check config and init necessary folder files

        return config;
    }
}
