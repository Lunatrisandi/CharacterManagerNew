package com.unpri.charactermanager.view;

import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.border.Border;

public class AppTheme {

    // 3 warna minimal
    public static final Color PRIMARY =
            new Color(41, 128, 185);

    public static final Color SUCCESS =
            new Color(46, 204, 113);

    public static final Color DANGER =
            new Color(231, 76, 60);

    public static final Color BACKGROUND =
            new Color(245, 245, 245);

    // 3 font minimal
    public static final Font TITLE_FONT =
            new Font("Arial", Font.BOLD, 18);

    public static final Font TEXT_FONT =
            new Font("Arial", Font.PLAIN, 14);

    public static final Font SMALL_FONT =
            new Font("Arial", Font.PLAIN, 12);

    // border
    public static final Border CARD_BORDER =
            BorderFactory.createLineBorder(
                    PRIMARY,
                    2);

    public static Color colorForType(String type) {

        switch (type) {

        case "WARRIOR":
            return DANGER;

        case "MAGE":
            return PRIMARY;

        case "ARCHER":
            return SUCCESS;

        default:
            return Color.GRAY;
        }
    }
}