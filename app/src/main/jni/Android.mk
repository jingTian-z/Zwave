LOCAL_PATH:= $(call my-dir)

include $(CLEAR_VARS)

rwildcard = $(foreach d,$(wildcard $1*),$(call rwildcard,$d/,$2) $(filter $(subst *,%,$2),$d))
SRC_SUFFIX := *.c *.cpp 
SRC_FILES := $(call rwildcard,$(LOCAL_PATH)/,$(SRC_SUFFIX))
LOCAL_SRC_FILES += $(SRC_FILES:$(LOCAL_PATH)/%=%)

LOCAL_C_INCLUDES := $(LOCAL_PATH)
LOCAL_C_INCLUDES += $(shell ls -FR $(LOCAL_C_INCLUDES) | grep $(LOCAL_PATH)/$ )
LOCAL_C_INCLUDES := $(LOCAL_C_INCLUDES:$(LOCAL_PATH)/%:=$(LOCAL_PATH)/%)

LOCAL_MODULE := libzwave
LOCAL_MODULE_TAGS := optional
LOCAL_PRELINK_MODULE := false

LOCAL_CFLAGS := \
    -Wno-multichar \
    -DANDROID \
    -DLIBDIR="c" \
    -DBUILDING_LIBICONV \
	-DIN_LIBRARY

LOCAL_LDLIBS    := -lm -llog

LOCAL_SHARED_LIBRARIES := liblog libcutils

include $(BUILD_SHARED_LIBRARY)
#include $(BUILD_EXECUTABLE)
