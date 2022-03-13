# pseudo-border-color-margins
Openbox config and themrc w/ gtk for colored borders

Simple 'fake gaps' (really margins) for Openbox windows with colored border panels. Note the screenshot has the border-width at 3, but you can certainly make it thicker and prettier. 
To really take advantage of the 'faux' manual-tiling, you'll wanna use the keyboard shortcuts or modify to your liking. 
[Alt + Left or Right]:
Snap windows *but* there will be a margin on all sides left for both windows.
[Ctrl + Shift + Alt] + [Left/Right/Up/Down] : 
Snaps windows into respective corners. Might look like a confusing shortcut but it plays nicely with the first one 
ergonommically. 

Note: GTK themes will not have a correct 'active' color of the soft red. This is due to needing client-side rendering or something that GTK is built around. 
What this means is your GTK apps will always have the inactive border color - mint green in this case. 

![faux-border-colors](https://user-images.githubusercontent.com/31811490/158075168-4eac0bc5-76db-488d-8b42-bc4df596f772.png)
