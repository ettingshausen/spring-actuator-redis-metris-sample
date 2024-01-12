
spring boot support Redis Cache Metrics since version 2.4.0.
It is very useful to monitor the Redis Cache performance.
In this tutorial, we will show you how to enable Redis Cache Metrics in Spring Boot 2.4.0.

The most important thing is to set the `spring.cache.cache-names` property to the cache name you want to monitor. 
If you want to monitor multiple caches, you can use a comma-separated list. If this property is not set, there will no metrics for Redis Cache.



