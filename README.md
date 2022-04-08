# pseudo-border-color-margins
Openbox config with gaps and additional gtk.css for colored borders

![faux-border-colors](https://user-images.githubusercontent.com/31811490/158075168-4eac0bc5-76db-488d-8b42-bc4df596f772.png)

[Overview]

Basically this is 'fake gaps' (really margins) for Openbox windows along with colored borders. Note the screenshot has the border-width at 3, but you can certainly make it thicker and prettier. 
To really take advantage of the installed 'fake', manual-tiling, you'll wanna use the keyboard shortcuts or modify to your liking. 

* [Alt + Left or Right]:
Snap windows with a margin on all sides for both windows.

* [Ctrl + Shift + Alt] + [Left/Right/Up/Down] : 
Snaps windows into respective corners. Might look like a confusing shortcut but it plays nicely with the first one 
ergonommically. 

Note: 

* GTK applications will not have a correct 'active' color of the soft red. This is due to needing client-side rendering or something that GTK is built around. 
What this means is your GTK apps will always have the inactive border color - mint green in this case. 

* The transparency in the preview image isn't in this script, see https://github.com/ibhagwan/picom for how to get it if you're interested :)

[To Install]

mkdir build

cd build

git clone https://github.com/coffeeandc0d3/pseudo-border-color-margins

cd pseudo-border-color-margins/ 

sudo chmod u+x install.sh

./install.sh

This will install border colors for active/inactive states of all windows, with exception to active gtk apps (inactive still works). 

Lastly it installs the 'gaps' by using ~.xml keybindings in your /home/$USER/.config/openbox/.xml 

To enable, open a prompt: 

`obconf`

Select Matcha-Config

:) 
