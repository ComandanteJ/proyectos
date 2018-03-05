#!/usr/bin/python
# -*- coding: utf-8 -*-

miarray = ['silvia','federico','miguel','julia','evaristo']
print miarray[2]

for elem in miarray:
   print elem, " es un valor contenido en el array miarray"

for index in range(len(miarray)):
   print miarray[index], " es el valor contenido en el array sub ", index

index=0
for elem in miarray:
   print index, ":", elem
   index += 1

miarray.append('carlos')
miarray.index('carlos')

'miguel' in miarray
'carlitos' in miarray

undict = {'nombre':'Juan','edad':22,'dni':51022365,'direccion':'Ave Maria numero 35'} 
undict

print undict['direccion']
print undict['dni']
undict.values()
undict.keys()
for key in undict.keys():
   print key, "===>", undict[key]

import os
for var in os.environ.keys():
   print var,"=",os.environ[var]
