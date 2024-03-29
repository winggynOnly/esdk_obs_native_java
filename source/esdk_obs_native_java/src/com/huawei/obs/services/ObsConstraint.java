/*
 * Copyright Notice:
 *      Copyright  1998-2009, Huawei Technologies Co., Ltd.  ALL Rights Reserved.
 *
 *      Warning: This computer software sourcecode is protected by copyright law
 *      and international treaties. Unauthorized reproduction or distribution
 *      of this sourcecode, or any portion of it, may result in severe civil and
 *      criminal penalties, and will be prosecuted to the maximum extent
 *      possible under the law.
 */
package com.huawei.obs.services;

/**OBS系统中的用到的常量。通过常量名称获取配置信息
 */
final class ObsConstraint
{
    /**OBS域名的名称
     */
    protected static final String END_POINT = "hw-endpoint";
    
    /**是否使用OPEN SSL(HTTPS)
     */
    protected static final String HTTPS_ONLY = "hw.https-only";
    
    /**是否不把请求中的桶名加入域名
     */
    protected static final String DISABLE_DNS_BUCKET = "hw.disable-dns-buckets";
    
    /**若使用HTTP，使用的端口号
     */
    protected static final String HTTP_PORT = "hw-endpoint-http-port";
    
    /**若使用HTTPS，使用的端口号
     */
    protected static final String HTTPS_PORT = "hw-endpoint-https-port";
    
    /**与OBS服务端建立的最大连接数
     */
    protected static final String HTTP_MAX_CONNECT = "httpclient.max-connections";
    
    /**发送OBS业务请求最大重复次数
     */
    protected static final String HTTP_RETRY_MAX = "httpclient.retry-max";
    
    /**发送OBS业务请求连接超时时间
     */
    protected static final String HTTP_CONNECT_TIMEOUT = "httpclient.connection-timeout-ms";
    
    /**SOCKET的超时时间
     */
    protected static final String HTTP_SOCKET_TIMEOUT = "httpclient.socket-timeout-ms";
    
    /**桶的默认区域
     */
    protected static final String DEFAULT_BUCKET_LOCATION = "s3service.default-bucket-location";
    
    /**配置文件名称
     */
    protected static final String CONFIG_FILE_NAME = "MosService.properties";
    
    protected static final int HTTP_CONNECT_TIMEOUT_VALUE = 6000;
    
    protected static final int HTTP_MAX_CONNECT_VALUE = 20;
    
    protected static final int HTTP_RETRY_MAX_VALUE = 5;
    
    protected static final int HTTP_SOCKET_TIMEOUT_VALUE = 6000;
    
    protected static final int HTTP_PORT_VALUE = 5080;

    protected static final int HTTPS_PORT_VALUE = 5443;
    
    //桶的默认区域值
    protected static final String DEFAULT_BUCKET_LOCATION_VALUE = "CHINA";
    
    //桶的默认鉴权方式
    protected static final String DEFAULT_BUCKET_LOCATION_SIGNA = "s3";
    
}
