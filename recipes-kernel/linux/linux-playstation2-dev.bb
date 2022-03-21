KERNEL_VERSION_SANITY_SKIP = "1"
LIC_FILES_CHKSUM = "file://COPYING;md5=bbea815ee2795b2f4230826c0c6b8814"

inherit kernel
require recipes-kernel/linux/linux-yocto.inc

SRC_URI = "git://github.com/frno7/linux.git;protocol=https;branch=ps2-main"

#KBRANCH = "ps2-v3.8"
#SRC_URI = "https://github.com/rickgaiser/linux.git;branch=${KBRANCH}"

#https://github.com/frno7/linux/blob/ps2-main/arch/mips/configs/ps2_defconfig
SRC_URI += "file://defconfig"
LINUX_VERSION ?= "5.4"
LINUX_VERSION_EXTENSION:append = "-custom"

SRCREV = "de37b463522983681ec7fd3530119f36ec63789f"

PV = "${LINUX_VERSION}+git${SRCPV}"

COMPATIBLE_MACHINE = "playstation2"
