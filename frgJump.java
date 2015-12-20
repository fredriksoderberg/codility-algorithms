{\rtf1\ansi\ansicpg1252\cocoartf1404\cocoasubrtf130
{\fonttbl\f0\fmodern\fcharset0 Courier;\f1\fmodern\fcharset0 Courier-Bold;}
{\colortbl;\red255\green255\blue255;\red117\green117\blue117;\red0\green0\blue0;\red255\green255\blue255;
\red115\green0\blue2;\red16\green121\blue2;}
\paperw11900\paperh16840\margl1440\margr1440\vieww10800\viewh8400\viewkind0
\deftab720
\pard\pardeftab720\sl320\partightenfactor0

\f0\fs24 \cf2 \expnd0\expndtw0\kerning0
\outl0\strokewidth0 \strokec2 // you can also use imports, for example:\cf3 \cb4 \strokec3 \
\cf2 \cb1 \strokec2 // import java.util.*;\cf3 \cb4 \strokec3 \
\
\cf2 \cb1 \strokec2 // you can write to stdout for debugging purposes, e.g.\cf3 \cb4 \strokec3 \
\cf2 \cb1 \strokec2 // System.out.println("this is a debug message");\cf3 \cb4 \strokec3 \
\
\pard\pardeftab720\sl320\partightenfactor0

\f1\b \cf3 \cb1 class
\f0\b0  
\f1\b \cf5 \strokec5 Solution
\f0\b0 \cf3 \strokec3  \
\{\cb4 \
\pard\pardeftab720\sl320\partightenfactor0
\cf3 \cb1     
\f1\b public
\f0\b0  
\f1\b int
\f0\b0  
\f1\b \cf5 \strokec5 solution
\f0\b0 \cf3 \strokec3 (
\f1\b int
\f0\b0  X, 
\f1\b int
\f0\b0  Y, 
\f1\b int
\f0\b0  D) \
    \{\cb4 \
\cb1         \cf2 \strokec2 // write your code in Java SE 8\cf3 \cb4 \strokec3 \
\cb1         
\f1\b int
\f0\b0  jumps = (
\f1\b int
\f0\b0 )((Y-X) / D);\cb4 \
\cb1         
\f1\b if
\f0\b0  ((Y-X) % D == \cf6 \strokec6 0\cf3 \strokec3 )\cb4 \
\cb1             
\f1\b return
\f0\b0  jumps;\cb4 \
\cb1         
\f1\b else
\f0\b0 \cb4 \
\cb1             
\f1\b return
\f0\b0  jumps + \cf6 \strokec6 1\cf3 \strokec3 ;\cb4 \
\cb1     \cb4 \
\cb1     \}\cb4 \
\cb1 \}}