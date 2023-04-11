#               ,-----------------------------------------------.
#               |F13|F14|F15|F16|F17|F18|F19|F20|F21|F22|F23|F24|
#               |---+---+---+---+---+---+---+---+---+---+---+---|
#               |F1 |F2 |F3 |F4 |F5 |F6 |F7 |F8 |F9 |F10|F11|F12|
#               `-----------------------------------------------'
# ,-------. ,-----------------------------------------------------------. ,-----------. ,---------------.
# |Cap|   | |  §|  1|  2|  3|  4|  5|  6|  7|  8|  9|  0|  +|  ´|    Bsp| |Ins|Hom|PgU| |Num|  /|  *|  -|
# |---+---| |-----------------------------------------------------------| |---+---+---+ |---+---+---+---|
# |VUp|Pre| |Tab  |  Q|  W|  E|  R|  T|  Y|  U|  I|  O|  P|  Å|  ¨| Retn| |Del|End|PgD| |  7|  8|  9|  +|
# |---+---| |------------------------------------------------------`    | `---+---+---' |---+---+---+---|
# |VDn|Nex| |Esc   |  A|  S|  D|  F|  G|  H|  J|  K|  L|  Ö|  Ä|  '|    |     | Up|     |  4|  5|  6|  +|
# |---+---| |-----------------------------------------------------------| ,---+---+---. |---+---+---+---|
# |Mut|Pla| |Shft|  <|  Z|  X|  C|  V|  B|  N|  M|  ,|  .|  -|Shift     | |Lef|Dow|Rig| |  1|  2|  3|   |
# |---+---| |-----------------------------------------------------------| `---+---+---' |---+---+---|   |
# |Gui|Cal| |LCtrl|   |Alt|         Space                |Ralt|   |RCtrl|     |Gui|     |      0|  ,|Ent|
# `-------' `-----'   `---------------------------------------'   `-----'     `---'     `---------------'

remapblock
  # Numpad:
  ESC NUM_LOCK
  NUM_LOCK PAD_SLASH
  SCROLL_LOCK PAD_ASTERIX
  EXTRA_SYSRQ PAD_MINUS
  PAD_ASTERIX PAD_PLUS
  #PAD_MINUS PAD_PLUS
  PAD_PLUS PAD_ENTER
  # Numpad upper right corner
 
  # Left keys:
  EXTRA_F1 F1
  EXTRA_F2 F2
  EXTRA_F3 F3
  EXTRA_F4 F4
  EXTRA_F5 F5
  EXTRA_F6 F6
  EXTRA_F7 F7
  EXTRA_F8 F8
  EXTRA_F9 LGUI
  EXTRA_F10 F10
 
  # Replace Caps_lock with Esc
  CAPS_LOCK ESC
 
  # Key in the middle of the arrow keys.
  LANG_4 DOWN
 
  # Fix ' and *
  EUROPE_1 BACKSLASH
endblock

