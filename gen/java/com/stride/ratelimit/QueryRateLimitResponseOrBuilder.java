// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: stride/ratelimit/query.proto

package com.stride.ratelimit;

public interface QueryRateLimitResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:stride.ratelimit.QueryRateLimitResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.stride.ratelimit.RateLimit rate_limit = 1 [json_name = "rateLimit"];</code>
   * @return Whether the rateLimit field is set.
   */
  boolean hasRateLimit();
  /**
   * <code>.stride.ratelimit.RateLimit rate_limit = 1 [json_name = "rateLimit"];</code>
   * @return The rateLimit.
   */
  com.stride.ratelimit.RateLimit getRateLimit();
  /**
   * <code>.stride.ratelimit.RateLimit rate_limit = 1 [json_name = "rateLimit"];</code>
   */
  com.stride.ratelimit.RateLimitOrBuilder getRateLimitOrBuilder();
}
