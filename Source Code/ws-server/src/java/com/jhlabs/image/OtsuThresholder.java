/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.jhlabs.image;

/**
 *
 * @author cengslymn
 */
public class OtsuThresholder {


public int thresh(int [] src){
    // Calculate histogram
int ptr = 0;
int []histData;
histData= new int[256];
int threshold = 0;
while (ptr < src.length) {
   int h = src[ptr] & 0xff;
   histData[h] ++;
   ptr ++;
}

// Total number of pixels
int total = src.length;
float sum = 0;
for (int t=0 ; t<256 ; t++) sum += t * histData[t];

float sumB = 0;
int wB = 0;
int wF = 0;

float varMax = 0;


for (int t=0 ; t<256 ; t++) {
   wB += histData[t];               // Weight Background
   if (wB == 0) continue;

   wF = total - wB;                 // Weight Foreground
   if (wF == 0) break;

   sumB += (float) (t * histData[t]);

   float mB = sumB / wB;            // Mean Background
   float mF = (sum - sumB) / wF;    // Mean Foreground

   // Calculate Between Class Variance
   float varBetween = (float)wB * (float)wF * (mB - mF) * (mB - mF);

   // Check if new maximum found
   if (varBetween > varMax) {
      varMax = varBetween;
      threshold = t;
   }
}
return threshold;
}
}
