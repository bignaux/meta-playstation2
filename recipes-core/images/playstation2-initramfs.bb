LICENSE = "MIT"

VIRTUAL-RUNTIME_dev_manager ?= "busybox-mdev"
#iopmod install

# see https://github.com/frno7/linux/wiki/Building-a-PlayStation-2-Linux-INITRAMFS-root-filesystem
initramfs_do_deploy() {

  # cd ${B}
  mkdir -p bin dev etc lib mnt proc root sbin sys tmp usr usr/bin usr/sbin var

  # cp ../../iopmod/module/*.irx lib/firmware/ps2/
}

addtask initramfs_do_deploy
