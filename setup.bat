echo off
cls
color f
title setup forge source 1.9
start /wait cmd /c gradlew.bat setupDecompWorkspace
start /wait cmd /c gradlew.bat eclipse
pause