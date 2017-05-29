/*
 * ZW_logging.h
 *
 *  Created on: Aug 11, 2015
 *      Author: aes
 */

#ifndef ZW_LOGGING_H_
#define ZW_LOGGING_H_



#if defined(WIN32)
#define LOG_PRINTF(f, ...) printf(f,  __VA_ARGS__ )
#define ERR_PRINTF(f, ...) printf(f,  __VA_ARGS__ )
#define WRN_PRINTF(f, ...) printf(f,  __VA_ARGS__ )
#define DBG_PRINTF(f, ...) printf(f,  __VA_ARGS__ )
#elif defined(__ASIX_C51__)
#define LOG_PRINTF
#define ERR_PRINTF printf
#define WRN_PRINTF printf
#define DBG_PRINTF
#elif defined(__BIONIC__)
#include <android/log.h>
#define LOG_PRINTF(f, ...) __android_log_print(ANDROID_LOG_INFO , "libzwave", f , ## __VA_ARGS__ )
#define ERR_PRINTF(f, ...) __android_log_print(ANDROID_LOG_ERROR, "libzwave", f , ## __VA_ARGS__ )
#define WRN_PRINTF(f, ...) __android_log_print(ANDROID_LOG_WARN , "libzwave", f , ## __VA_ARGS__ )
#define DBG_PRINTF(f, ...) __android_log_print(ANDROID_LOG_DEBUG, "libzwave", f , ## __VA_ARGS__ )
#elif defined(SYSLOG)
#include <syslog.h>

#define LOG_PRINTF(f, ...) syslog(LOG_INFO , f , ## __VA_ARGS__ )
#define ERR_PRINTF(f, ...) syslog(LOG_ERR,  f , ## __VA_ARGS__ )
#define WRN_PRINTF(f, ...) syslog(LOG_WARNING , f , ## __VA_ARGS__ )
#define DBG_PRINTF(f, ...) syslog(LOG_DEBUG,  f , ## __VA_ARGS__ )


#else
/**
 * Information level logging.
 * \param f argument similar to the one passed to printf
 */
#define LOG_PRINTF(f, ...) printf("\033[32;1m%u " f "\033[0m",  clock_time(), ## __VA_ARGS__ )
/**
 * Error level logging.
 * \param f argument similar to the one passed to printf
 */
#define ERR_PRINTF(f, ...) printf("\033[31;1m%u " f "\033[0m",  clock_time(), ## __VA_ARGS__ )
/**
 * Warning level logging.
 * \param f argument similar to the one passed to printf
 */
#define WRN_PRINTF(f, ...) printf("\033[33;1m%u " f "\033[0m",  clock_time(), ## __VA_ARGS__ )
/**
 * Debug level logging.
 * \param f argument similar to the one passed to printf
 */
#define DBG_PRINTF(f, ...) printf("\033[34;1m%u " f "\033[0m", clock_time(), ## __VA_ARGS__ )
#endif


#endif /* ZW_LOGGING_H_ */
