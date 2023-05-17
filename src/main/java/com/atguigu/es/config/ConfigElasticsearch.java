package com.atguigu.es.config;

import org.apache.http.HttpHost;
import org.elasticsearch.client.RestClient;
import org.elasticsearch.client.RestHighLevelClient;
import org.springframework.context.annotation.Configuration;


@Configuration //配置类
public class ConfigElasticsearch {

    //利用RestHighLevelClient操作
    public RestHighLevelClient esRestClient(){
        RestHighLevelClient client = new RestHighLevelClient(
                RestClient.builder(
                        new HttpHost("192.168.179.128",9200,"http"))
        );
        return client;
    }

    public static void main(String[] args) {
        System.out.println("hello git");
        System.out.println("hello git");
        System.out.println("hello git");
        System.out.println("sds git");
    }
}
