SUMMARY = "Argus Operating System base image"

IMAGE_INSTALL = "packagegroup-core-boot ${CORE_IMAGE_EXTRA_INSTALL}"

LICENSE = "MIT"

EXTRA_IMAGE_FEATURES:remove:argus-prod = "debug-tweaks"

IMAGE_FSTYPES = "wic"

inherit core-image

create_data_dir() {
    install -d ${IMAGE_ROOTFS}/data
}
IMAGE_PREPROCESS_COMMAND += "create_data_dir;"
