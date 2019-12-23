#OSMC
###(Open Source Minipack Core)


OSMC is a framework designed to make the creation of plugins (minipacks as they're called as to prevent confusion) dead simple.

It is an abstracted layer that sandwiches between any OSMC-Minipack created, and any other server library.

#####What does that mean for the average person?
It means that any OSMC minipack created will work perfectly on any server that OSMC is supported on.

Let's say you find a Spleef minipack. You can then run that exact minipack on Spigot, Nukkit (Bedrock), even Sponge, and
it will work the exact same way every time.

#####How is that possible?
OSMC is just an outline of tools that you can use. It is then up to the plugins created for the specific server to translate
everything from Spigot events, as an example. It looks like this

Spigot <-> OSMC <-> Minipacks

It doesn't even need to run on Minecraft, technically.