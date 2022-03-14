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

# Cleanup:
rm $userPath/appendData
openbox --reconfigure
