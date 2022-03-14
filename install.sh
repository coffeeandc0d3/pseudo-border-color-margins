#!/bin/bash

# Extract theme to /usr/share/themes
sudo tar -xf Matcha-Config.tar.xz -C /usr/share/themes

g++ -o configure-theme configure-theme.cpp

userPath=`echo /home/$USER`

cp /home/$USER/build/faux-border-gap_colors/appendData $userPath

pwd

./configure-theme $userPath 
 
