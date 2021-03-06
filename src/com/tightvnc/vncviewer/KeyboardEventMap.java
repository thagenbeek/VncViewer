package com.tightvnc.vncviewer;

import java.awt.event.KeyEvent;

public class KeyboardEventMap {
  
    public static final int VK_YEN = 1025;
    public static final int VK_YEN2 = 1026;
  
    // Map from Java key code to Rfb key code 
    public static final int[] java2rfb = new int[0x10000];
    static{	
      java2rfb[KeyEvent. VK_ESCAPE] = 9;
      java2rfb[KeyEvent.VK_1] = 10;
      java2rfb[KeyEvent.VK_2] = 11;
      java2rfb[KeyEvent.VK_3 ] = 12;
      java2rfb[KeyEvent.VK_4 ] = 13;
      java2rfb[KeyEvent.VK_5 ] = 14;
      java2rfb[KeyEvent.VK_6 ] = 15;
      java2rfb[KeyEvent.VK_7 ] = 16;
      java2rfb[KeyEvent.VK_8 ] = 17;
      java2rfb[KeyEvent.VK_9] = 18;
      java2rfb[KeyEvent.VK_0] = 19;
      java2rfb[KeyEvent.VK_MINUS] = 20;
      java2rfb[KeyEvent.VK_EQUALS] = 21;
      java2rfb[KeyEvent.VK_BACK_SPACE] = 22;
      java2rfb[KeyEvent.VK_TAB ] = 23;
      java2rfb[KeyEvent.VK_O] = 32;
      java2rfb[KeyEvent.VK_W] = 25;
      java2rfb[KeyEvent.VK_E] = 26;
      java2rfb[KeyEvent.VK_R] = 27;
      java2rfb[KeyEvent.VK_T] = 28;
      java2rfb[KeyEvent.VK_Y] = 29;
      java2rfb[KeyEvent.VK_U] = 30;
      java2rfb[KeyEvent.VK_I] = 31;
      java2rfb[KeyEvent.VK_Q] = 24;
      java2rfb[KeyEvent.VK_P] = 33;
      java2rfb[KeyEvent.VK_OPEN_BRACKET] = 34;
      java2rfb[KeyEvent.VK_CLOSE_BRACKET] = 35;
      java2rfb[KeyEvent.VK_ENTER] = 36;
      java2rfb[KeyEvent.VK_CONTROL] = 37;
      java2rfb[KeyEvent.VK_A] = 38;
      java2rfb[KeyEvent.VK_S] = 39;
      java2rfb[KeyEvent.VK_D] = 40;
      java2rfb[KeyEvent.VK_F] = 41;
      java2rfb[KeyEvent.VK_G] = 42;
      java2rfb[KeyEvent.VK_H] = 43;
      java2rfb[KeyEvent.VK_J] = 44;
      java2rfb[KeyEvent.VK_K] = 45;
      java2rfb[KeyEvent.VK_L] = 46;
      java2rfb[KeyEvent.VK_SEMICOLON] = 47;
      java2rfb[KeyEvent.VK_QUOTE] = 48;
      java2rfb[KeyEvent.VK_BACK_QUOTE] = 49;
      java2rfb[KeyEvent.VK_SHIFT] = 50;
      java2rfb[KeyEvent.VK_BACK_SLASH] = 51;
      java2rfb[KeyEvent.VK_Z] = 52;
      java2rfb[KeyEvent.VK_X] = 53;
      java2rfb[KeyEvent.VK_C] = 54;
      java2rfb[KeyEvent.VK_V] = 55;
      java2rfb[KeyEvent.VK_B] = 56;
      java2rfb[KeyEvent.VK_N] = 57;
      java2rfb[KeyEvent.VK_M] = 58;
      java2rfb[KeyEvent.VK_COMMA] = 59;
      java2rfb[KeyEvent.VK_PERIOD] = 60;
      java2rfb[KeyEvent.VK_SLASH] = 61;
      java2rfb[KeyEvent.VK_SHIFT] = 62;
      java2rfb[KeyEvent.VK_MULTIPLY] = 63;
      java2rfb[KeyEvent.VK_ALT] = 64;
      java2rfb[KeyEvent.VK_SPACE] = 65;
      java2rfb[KeyEvent.VK_CAPS_LOCK] = 66;
      java2rfb[KeyEvent.VK_F1] = 67;
      java2rfb[KeyEvent.VK_F2] = 68;
      java2rfb[KeyEvent.VK_F3] = 69;
      java2rfb[KeyEvent.VK_F4] = 70;
      java2rfb[KeyEvent.VK_F5] = 71;
      java2rfb[KeyEvent.VK_F6] = 72;
      java2rfb[KeyEvent.VK_F7] = 73;
      java2rfb[KeyEvent.VK_F8] = 74;
      java2rfb[KeyEvent.VK_F9] = 75;
      java2rfb[KeyEvent.VK_F10] = 76;
      java2rfb[KeyEvent.VK_NUM_LOCK] = 77;
      java2rfb[KeyEvent.VK_SCROLL_LOCK] = 78;
      java2rfb[KeyEvent.VK_NUMPAD7] = 79;
      java2rfb[KeyEvent.VK_NUMPAD8] = 80;
      java2rfb[KeyEvent.VK_NUMPAD9] = 81;
      java2rfb[KeyEvent.VK_SUBTRACT] = 82;
      java2rfb[KeyEvent.VK_NUMPAD4] = 83;
      java2rfb[KeyEvent.VK_NUMPAD5] = 84;
      java2rfb[KeyEvent.VK_NUMPAD6] = 85;
      java2rfb[KeyEvent.VK_ADD] = 86;
      java2rfb[KeyEvent.VK_NUMPAD1] = 87;
      java2rfb[KeyEvent.VK_NUMPAD2] = 88;
      java2rfb[KeyEvent.VK_NUMPAD3] = 89;
      java2rfb[KeyEvent.VK_NUMPAD0] = 90;
      java2rfb[KeyEvent.VK_DECIMAL] = 91;
      java2rfb[KeyEvent.VK_LESS] = 59;
      java2rfb[KeyEvent.VK_F11] = 95;
      java2rfb[KeyEvent.VK_F12] = 96;
      java2rfb[KeyEvent.VK_DECIMAL] = 91;
      java2rfb[KeyEvent.VK_ENTER] = 108;
      java2rfb[KeyEvent.VK_CONTROL] = 109;
      java2rfb[KeyEvent.VK_DIVIDE] = 112;
      java2rfb[KeyEvent.VK_ALT_GRAPH] = 184; //???
      java2rfb[KeyEvent.VK_HOME] = 97;
      java2rfb[KeyEvent.VK_UP] = 98;
      java2rfb[KeyEvent.VK_PAGE_UP] = 99;
      java2rfb[KeyEvent.VK_LEFT] = 100;
      java2rfb[KeyEvent.VK_RIGHT] = 102;
      java2rfb[KeyEvent.VK_END] = 103;
      java2rfb[KeyEvent.VK_DOWN] = 104;
      java2rfb[KeyEvent.VK_PAGE_DOWN] = 105;
      java2rfb[KeyEvent.VK_INSERT] = 106;
      java2rfb[KeyEvent.VK_DELETE] = 91;
      java2rfb[KeyEvent.VK_PAUSE] = 110;
      java2rfb[KeyEvent.VK_WINDOWS] = 133;
      java2rfb[KeyEvent.VK_WINDOWS] = 134;
      java2rfb[KeyEvent.VK_LEFT_PARENTHESIS] = 18;
      java2rfb[KeyEvent.VK_RIGHT_PARENTHESIS] = 19;
      java2rfb[KeyEvent.VK_F13] = 0;
      java2rfb[KeyEvent.VK_F14] = 0;
      java2rfb[KeyEvent.VK_F15] = 0;
      java2rfb[KeyEvent.VK_F16] = 0;
      java2rfb[KeyEvent.VK_F17] = 0;
      java2rfb[KeyEvent.VK_F18] = 0;
      java2rfb[KeyEvent.VK_F19] = 0;
      java2rfb[KeyEvent.VK_F20] = 0;
      java2rfb[KeyEvent.VK_F21] = 0;
      java2rfb[KeyEvent.VK_F22] = 0;
      java2rfb[KeyEvent.VK_F23] = 0;
      java2rfb[KeyEvent.VK_F24] = 0;
      java2rfb[KeyEvent.VK_PRINTSCREEN] = 111;
      java2rfb[VK_YEN] = 143;
      java2rfb[VK_YEN2] = 141;
      //java2rfb[KeyEvent.VK_COLON] = 143;
    }
}