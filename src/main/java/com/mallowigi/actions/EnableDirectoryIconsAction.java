package com.mallowigi.actions;

import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.actionSystem.ToggleAction;
import com.mallowigi.config.AtomFileIconsConfig;
import org.jetbrains.annotations.NotNull;

public final class EnableDirectoryIconsAction extends ToggleAction {

  private static final AtomFileIconsConfig CONFIG = AtomFileIconsConfig.getInstance();

  @Override
  public boolean isSelected(@NotNull final AnActionEvent e) {
    return CONFIG.isEnabledDirectories();
  }

  @Override
  public void setSelected(@NotNull final AnActionEvent e, final boolean state) {
    CONFIG.toggleDirectoriesIcons();
    CONFIG.fireChanged();
  }
}
