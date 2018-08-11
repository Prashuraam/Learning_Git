; wait for 8 seconds to appear download and save dialog. Used class property of download dialog.
WinWait("[CLASS:MozillaDialogClass]","",2)

; Perform keyboard ALT key down + s + ALT key Up action to select Save File Radio button using keyboard sortcut.
Send("!s")

; Wait for 3 seconds
Sleep(1000)

; Press Keyboard ENTER button.
Send("{ENTER}")