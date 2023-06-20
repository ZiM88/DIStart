package com.example.distart.example1

import javax.inject.Inject

class Activity {

   val component = DaggerNewComponent.create()
   val keyboard = component.getKeyboard()
   val mouse = component.getMouse()
   val monitor = component.getMonitor()
}