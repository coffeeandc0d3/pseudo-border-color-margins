# pseudo-border-color-margins
Openbox config with gaps and additional gtk.css for colored borders

[*NOTE*] 

You'll only have margins/'gaps' by implementing the keybindings which are the only thing not auto-installed in the script. Just copy the rc.xml (however you need to name it) to ~/.config/openbox. Then at a prompt type: openbox --reconfigure

[Modify Keybindings]

See top of the 'rc.xml' to find keybinding section. Of course these can be overriden to your liking as long as the margin code is kept :) 

[Overview]

Basically this is 'fake gaps' (really margins) for Openbox windows along with colored borders. Note the screenshot has the border-width at 3, but you can certainly make it thicker and prettier. 
To really take advantage of the 'faux' manual-tiling, you'll wanna use the keyboard shortcuts or modify to your liking. 

[Alt + Left or Right]:
Snap windows *but* there will be a margin on all sides for both windows.

[Ctrl + Shift + Alt] + [Left/Right/Up/Down] : 
Snaps windows into respective corners. Might look like a confusing shortcut but it plays nicely with the first one 
ergonommically. 

Note: GTK applications will not have a correct 'active' color of the soft red. This is due to needing client-side rendering or something that GTK is built around. 
What this means is your GTK apps will always have the inactive border color - mint green in this case. 

![faux-border-colors](https://user-images.githubusercontent.com/31811490/158075168-4eac0bc5-76db-488d-8b42-bc4df596f772.png)

[To Install]

mkdir build

cd build

git clone https://github.com/coffeeandc0d3/pseudo-border-color-margins

cd pseudo-border-color-margins/ 

sudo chmod u+x install.sh

./install.sh

[*Note: this auto installs the Openbox theme, gtk.css for colored borders and active states, but does not install the openbox keybindings. The file is included in the repo: rc.xml but rename to whichever works for your distro and openbox.]
