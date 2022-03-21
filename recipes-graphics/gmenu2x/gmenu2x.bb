SUMMARY = "gmenu2x"
DESCRIPTION = "A gmenu2x"
#HOMEPAGE = "http://matchbox-project.org"
#BUGTRACKER = "http://bugzilla.yoctoproject.org/"

LICENSE = "GPL-2.0-or-later"
LIC_FILES_CHKSUM = "file://COPYING;md5=393a5ca445f6965873eca0259a17f833"

DEPENDS = "libsdl2"

# The startup-notification requires x11 in DISTRO_FEATURES
#REQUIRED_DISTRO_FEATURES = "x11"

SRC_URI = "git://github.com/zfteam/gmenu2x-sdl2.git;protocol=https;branch=master"
SRCREV = "c015722dcb0f8a454796fc191d20ba38d55e4503"

#EXTRA_OECONF = "--enable-startup-notification --enable-dbus"
S = "${WORKDIR}/git"

#inherit autotools pkgconfig features_check gettext
