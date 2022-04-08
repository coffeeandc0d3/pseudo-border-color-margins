#!/bin/bash

# Extract theme to /usr/share/themes
sudo tar -xf Matcha-Config.tar.xz -C /usr/share/themes

# C program just appends data to gtk.css for border states (active/inactive)
g++ -o configure-theme configure-theme.cpp

# Will pass user path to help C program find files easier
userPath=`echo /home/$USER`

# Store the data to be appended in the $HOME dir
cp appendData $userPath

# Run auto append program, passing in user pathname
./configure-theme $userPath

# Install keybindings to get the gaps/margins: 
javac -d . initKeybindings.java

echo Type name of ~/.config/openbox/~.xml file. Example: lxde-rc.xml, or rc.xml
read userConfig 

# Pass in filepath for user rc.xml filename, and filepath for bindings being added
java insertion.initKeybindings $userPath/.config/openbox/$userConfig $userPath/build/pseudo-border-color-margins/bindings.xml

# Cleanup:
rm $userPath/appendData
openbox --reconfigure
