SUMMARY = "Extremely basic live image init script"
LICENSE = "MIT"

#VIRTUAL-RUNTIME_dev_manager ?= "busybox-mdev"

# see https://github.com/frno7/linux/wiki/Building-a-PlayStation-2-Linux-INITRAMFS-root-filesystem
# do_image_complete

PACKAGE_INSTALL = "${VIRTUAL-RUNTIME_base-utils} iopmod udev base-passwd ${ROOTFS_BOOTSTRAP_INSTALL}"

INITRAMFS_FSTYPES = "cpio.xz"

# Do not pollute the initrd image with rootfs features
IMAGE_FEATURES = ""
IMAGE_LINGUAS = ""

IMAGE_FSTYPES = "${INITRAMFS_FSTYPES}"
inherit core-image
