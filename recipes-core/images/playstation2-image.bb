require recipes-core/images/core-image-minimal.bb
PR = "r1"
DESCRIPTION = "Minimalistic image for PS2"

KERNEL_EXTRA_ARGS += "LOADADDR=0x80016040"

IMAGE_FEATURES += "ssh-server-dropbear"

#IMAGE_INSTALL += "${PTESTS_FAST}"

# possible IMAGE_FSTYPES :
# * linux in iso, save on mc/vmc or pfs
# * linux as normal install (on partition ext/reiser, save in /home)
# * linux in packed elf , easy to deploy, save according to new-app scheme
# * wmic see https://pelux.io/software-factory/master/chapters/baseplatform/deploying-the-image.html
IMAGE_FSTYPES ?= "tar.bz2"

#WKS_FILE ?= "edgerouter.wks"
#IMAGE_BOOT_FILES ?= "vmlinux;vmlinux.64"
#do_image_wic[depends] += "mtools-native:do_populate_sysroot dosfstools-native:do_populate_sysroot"
