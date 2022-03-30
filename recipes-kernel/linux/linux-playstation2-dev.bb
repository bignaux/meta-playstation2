KERNEL_VERSION_SANITY_SKIP = "1"
LIC_FILES_CHKSUM = "file://COPYING;md5=bbea815ee2795b2f4230826c0c6b8814"

inherit kernel
require recipes-kernel/linux/linux-yocto.inc

KBRANCH = "ps2-main"
SRC_URI = "git://github.com/frno7/linux.git;protocol=https;branch=${KBRANCH}"

#https://github.com/frno7/linux/blob/ps2-main/arch/mips/configs/ps2_defconfig
SRC_URI += "file://defconfig"
#SRC_URI += "file://0001-fix-resolution.patch"
LINUX_VERSION ?= "5.4"
LINUX_VERSION_EXTENSION:append = "-custom"
SRCREV = "de37b463522983681ec7fd3530119f36ec63789f"

KERNEL_MODULE_AUTOLOAD += "ps2fb ohci-ps2 sd_mod ums-usbat usbhid hid-generic"

COMPATIBLE_MACHINE = "playstation2"

#TODO : enable in-tree defconfig
#KBUILD_DEFCONFIG_playstation2 = "ps2_defconfig"
#KMACHINE_playstation2 = "ps2"
