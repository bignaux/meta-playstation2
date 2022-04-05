
# `-march=r5900' already enables the R5900 short loop workaround.
# However, the R5900 ISA and most other MIPS ISAs are mutually
# exclusive since R5900-specific instructions are generated as well.

# The `-mfix-r5900' option can be used in combination with e.g.
# `-mips2' or `-mips3' to generate generic MIPS binaries that also
# work with the R5900 target.

DEFAULTTUNE ?= "mipsr5900el"

# no fpu see https://github.com/frno7/linux/issues/3
require conf/machine/include/mips/tune-mips32r2.inc

AVAILTUNES += "mipsr5900el"
TUNEVALID[mipsr5900el] = "Enable optimization related to r5900 support"
TUNE_CCARGS .= "${@bb.utils.contains('TUNE_FEATURES', 'mipsr5900el', ' -march=r5900 ', '',d)}"

TUNE_FEATURES:tune-mipsr5900el = "${TUNE_FEATURES:tune-mipsel-nf} mipsr5900el"
BASE_LIB:tune-mipsr5900el = "lib32"
MIPSPKGSFX_VARIANT:tune-mipsr5900el = "mipsr5900el"
PACKAGE_EXTRA_ARCHS:tune-mipsr5900el = "mipsel-nf mipsr5900el-nf"

QEMU_EXTRAOPTIONS_mipsr5900el-nf = " -cpu 34kf"
