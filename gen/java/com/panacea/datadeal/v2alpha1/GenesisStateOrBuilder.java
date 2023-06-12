// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: panacea/datadeal/v2alpha1/genesis.proto

package com.panacea.datadeal.v2alpha1;

public interface GenesisStateOrBuilder extends
    // @@protoc_insertion_point(interface_extends:panacea.datadeal.v2alpha1.GenesisState)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>map&lt;uint64, .panacea.datadeal.v2alpha1.Deal&gt; deals = 1 [json_name = "deals", (.gogoproto.nullable) = false];</code>
   */
  int getDealsCount();
  /**
   * <code>map&lt;uint64, .panacea.datadeal.v2alpha1.Deal&gt; deals = 1 [json_name = "deals", (.gogoproto.nullable) = false];</code>
   */
  boolean containsDeals(
      long key);
  /**
   * Use {@link #getDealsMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.Long, com.panacea.datadeal.v2alpha1.Deal>
  getDeals();
  /**
   * <code>map&lt;uint64, .panacea.datadeal.v2alpha1.Deal&gt; deals = 1 [json_name = "deals", (.gogoproto.nullable) = false];</code>
   */
  java.util.Map<java.lang.Long, com.panacea.datadeal.v2alpha1.Deal>
  getDealsMap();
  /**
   * <code>map&lt;uint64, .panacea.datadeal.v2alpha1.Deal&gt; deals = 1 [json_name = "deals", (.gogoproto.nullable) = false];</code>
   */
  /* nullable */
com.panacea.datadeal.v2alpha1.Deal getDealsOrDefault(
      long key,
      /* nullable */
com.panacea.datadeal.v2alpha1.Deal defaultValue);
  /**
   * <code>map&lt;uint64, .panacea.datadeal.v2alpha1.Deal&gt; deals = 1 [json_name = "deals", (.gogoproto.nullable) = false];</code>
   */
  com.panacea.datadeal.v2alpha1.Deal getDealsOrThrow(
      long key);

  /**
   * <code>map&lt;string, .panacea.datadeal.v2alpha1.DataCert&gt; data_certs = 2 [json_name = "dataCerts", (.gogoproto.nullable) = false];</code>
   */
  int getDataCertsCount();
  /**
   * <code>map&lt;string, .panacea.datadeal.v2alpha1.DataCert&gt; data_certs = 2 [json_name = "dataCerts", (.gogoproto.nullable) = false];</code>
   */
  boolean containsDataCerts(
      java.lang.String key);
  /**
   * Use {@link #getDataCertsMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, com.panacea.datadeal.v2alpha1.DataCert>
  getDataCerts();
  /**
   * <code>map&lt;string, .panacea.datadeal.v2alpha1.DataCert&gt; data_certs = 2 [json_name = "dataCerts", (.gogoproto.nullable) = false];</code>
   */
  java.util.Map<java.lang.String, com.panacea.datadeal.v2alpha1.DataCert>
  getDataCertsMap();
  /**
   * <code>map&lt;string, .panacea.datadeal.v2alpha1.DataCert&gt; data_certs = 2 [json_name = "dataCerts", (.gogoproto.nullable) = false];</code>
   */
  /* nullable */
com.panacea.datadeal.v2alpha1.DataCert getDataCertsOrDefault(
      java.lang.String key,
      /* nullable */
com.panacea.datadeal.v2alpha1.DataCert defaultValue);
  /**
   * <code>map&lt;string, .panacea.datadeal.v2alpha1.DataCert&gt; data_certs = 2 [json_name = "dataCerts", (.gogoproto.nullable) = false];</code>
   */
  com.panacea.datadeal.v2alpha1.DataCert getDataCertsOrThrow(
      java.lang.String key);

  /**
   * <code>uint64 next_deal_number = 3 [json_name = "nextDealNumber"];</code>
   * @return The nextDealNumber.
   */
  long getNextDealNumber();
}
