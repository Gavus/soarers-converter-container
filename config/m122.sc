# default mappings for terminal 122-key keyboards

ifset set3
remapblock
	# Numpad:
	ESC		NUM_LOCK
	NUM_LOCK	PAD_SLASH
	SCROLL_LOCK	PAD_ASTERIX
	EXTRA_SYSRQ	PAD_MINUS
	PAD_ASTERIX	PAD_PLUS
	PAD_MINUS	PAD_PLUS
	PAD_PLUS	PAD_ENTER
	# Numpad upper right corner

	# Left keys:
	EXTRA_F1	ESC
	EXTRA_F2	SCROLL_LOCK
	EXTRA_F3	PRINTSCREEN
	EXTRA_F4	PAUSE
	EXTRA_F5	MEDIA_VOLUME_UP
	EXTRA_F6	MEDIA_NEXT_TRACK
	EXTRA_F7	MEDIA_VOLUME_DOWN
	EXTRA_F8	MEDIA_PLAY_PAUSE
	EXTRA_F9	LGUI
	EXTRA_F10	MENU

	# Key in the middle of the arrow keys.
	LANG_4 RGUI

	# Fix ' and *
	EUROPE_1	BACKSLASH
endblock
